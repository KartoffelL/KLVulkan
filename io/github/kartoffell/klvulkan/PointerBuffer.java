package io.github.kartoffell.klvulkan;

import org.jspecify.annotations.NonNull;
import org.jspecify.annotations.Nullable;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;
import java.nio.Buffer;
import java.util.Iterator;
import java.util.function.Function;

// Copyright 2026 Kareem Athamneh
// Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the “Software”), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
// The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
// THE SOFTWARE IS PROVIDED “AS IS”, WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
/**
 * PointerBuffers are a variation of ElementBuffers, that instead of storing Elements consecutively in linear memory, store pointers to structs.
 * @param <T>
 */
public class PointerBuffer<T> extends ElementBuffer<T> {

    //Standard PointerBuffer creation functions

    /**
     * Wraps the given MemorySegment into an PointerBuffer with undefined size.
     * @param segment the MemorySegment to wrap
     * @param producer a function that produces Element-classes given some MemorySegment
     * @return a new PointerBuffer
     * @param <T> the Element Type
     */
    public static <T> PointerBuffer<T> wrap(MemorySegment segment, Function<MemorySegment, T> producer) {
        return new PointerBuffer<T>(producer, (int) ValueLayout.ADDRESS.byteSize(), segment.reinterpret(Long.MAX_VALUE));
    }
    /**
     * Allocates a new PointerBuffer using the given Arena with an ADDRESS-byte alignment. This PointerBuffer will consist of count-pointers (pointing to null).
     * @param arena the Arena to use
     * @param count the capacity of the PointerBuffer
     * @param producer a function that produces Element-classes given some MemorySegment
     * @return a new PointerBuffer
     * @param <T> the Element Type
     */
    public static <T> PointerBuffer<T> allocateDirect(Arena arena, int count, Function<MemorySegment, T> producer) {
        return new PointerBuffer<T>(producer, (int) ValueLayout.ADDRESS.byteSize(), arena.allocate(ValueLayout.ADDRESS, count));
    }
    /**
     * Allocates a new PointerBuffer using the given Arena with an ADDRESS-byte alignment. This PointerBuffer will be of size values.length and consist of pointers to values, in order.
     * @param arena the Arena to use
     * @param values the values to initialize this PointerBuffer to
     * @return a new PointerBuffer
     * @param <T> the Element Type
     */
    public static <T> PointerBuffer<T> allocateDirect(Arena arena, T...values) {
        final var d =  new PointerBuffer<T>(null, (int) ValueLayout.ADDRESS.byteSize(), arena.allocate(ValueLayout.ADDRESS, values.length));
        for(int i = 0; i < values.length; i++)
            d.set(i, values[i]);
        return d;
    }

    protected PointerBuffer(Function<MemorySegment, T> producer, int elementSize, MemorySegment address) {
        super(producer, elementSize, address);
    }

    public @Nullable T get(int indx) {
        final var v = address.get(ValueLayout.ADDRESS, (long) indx * elementSize).reinterpret(Long.MAX_VALUE);
        if(v.address()==0)
            return null;
        return producer.apply(v);
    }

    /**
     * Sets the pointer at the given index to point to some value.
     * @param indx the index
     * @param value the value. May be null, of Type T, a native Buffer, a MemorySegment or an Element.
     * @apiNote Note that the value should match the correct type in memory, or else the behaviour is undefined and may lead to crashes.
     */
    public void set(int indx, @Nullable T value) {
        MemorySegment ad = MemorySegment.NULL;
        if(value != null)
            switch (value) {
                case Buffer buff -> {
                    ad = MemorySegment.ofBuffer(buff);
                }
                case MemorySegment seg -> {
                    ad = seg;
                }
                case Element<?> el -> {
                    ad = el.address();
                }
                default -> throw new IllegalStateException("Unexpected value: " + value);
            }
        address.set(ValueLayout.ADDRESS, indx* 8L, ad);
    }

    /**
     * {@inheritDoc}
     * @throws IllegalStateException when the capacity of this ElementBuffer is undefined
     */
    @Override
    public @NonNull Iterator<T> iterator() throws IllegalStateException {
        if(address.byteSize() == Long.MAX_VALUE)
            throw new IllegalStateException("Cannot iterate over an ElementBuffer of unknown capacity!");
        return new Iterator<T>() {
            int pos = 0;
            @Override
            public boolean hasNext() {
                return pos < capacity();
            }

            @Override
            public T next() {
                final var res = get(pos);
                pos++;
                return res;
            }
        };
    }
}
