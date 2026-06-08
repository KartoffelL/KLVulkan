package io.github.kartoffell.klvulkan;

import org.jspecify.annotations.NonNull;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;
import java.util.Iterator;
import java.util.function.Function;

// Copyright 2026 Kareem Athamneh
// Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the “Software”), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
// The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
// THE SOFTWARE IS PROVIDED “AS IS”, WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
/**
 * ElementBuffers are a variation of any Element that occurs multiple times continuously in memory. They may be regarded as arrays of some specific Element.
 * @param <T>
 */
public class ElementBuffer<T> implements Iterable<T>, Element<T> {


    protected final MemorySegment address;
    protected final Function<MemorySegment, T> producer;
    protected final int elementSize;
//    protected int limit, position, mark;

    //Standard ElementBuffer creation functions

    /**
     * Wraps the given MemorySegment into an ElementBuffer with undefined size.
     * @param segment the MemorySegment to wrap
     * @param elementSize the size of each Element, in bytes
     * @param producer a function that produces Element-classes given some MemorySegment
     * @return a new ElementBuffer
     * @param <T> the Element Type
     */
    public static <T> ElementBuffer<T> wrap(MemorySegment segment, int elementSize, Function<MemorySegment, T> producer) {
        return new ElementBuffer<T>(producer, elementSize, segment.reinterpret(Long.MAX_VALUE));
    }

    /**
     * Allocates a new ElementBuffer using the given Arena with an ADDRESS-byte alignment. This ElementBuffer will consist of count-elements of size elementSize (initialized to 0).
     * @param arena the Arena to use
     * @param count the capacity of the ElementBuffer, in Elements
     * @param elementSize the size of each Element, in bytes
     * @param producer a function that produces Element-classes given some MemorySegment
     * @return a new ElementBuffer
     * @param <T> the Element Type
     */
    public static <T> ElementBuffer<T> allocateDirect(Arena arena, int count, int elementSize, Function<MemorySegment, T> producer) {
        return new ElementBuffer<T>(producer, elementSize, arena.allocate((long) count *elementSize, ValueLayout.ADDRESS.byteAlignment()));
    }

    protected ElementBuffer(Function<MemorySegment, T> producer, int elementSize, MemorySegment address) {
        this.producer = producer;
        this.elementSize = elementSize;
        this.address = address;
    }

    /**
     * Returns the Element at the given index.
     * @param indx the index of the Element
     * @return the Element
     */
    public T get(int indx) {
        final var v = address.asSlice((long) indx *elementSize, elementSize);
        return producer.apply(v);
    }

    /**
     * {@return the size of each Element, in bytes}
     */
    public int getElementSize() {
        return elementSize;
    }

    /**
     * {@return the capacity of this ElementBuffer}
     * @apiNote if the capacity of this ElementBuffer is unknown, then the returned value will be <code>Math.toIntExact(Long.MAX_VALUE / elementSize)</code>
     */
    public int capacity() {
        return Math.toIntExact(address.byteSize() / elementSize);
    }

    @Override
    public MemorySegment address() {
        return address;
    }

//    /**
//     *
//     * @param limit
//     * @return
//     */
//    public ElementBuffer<T> limit(int limit) {
//        this.limit = limit;
//        return this;
//    }
//    public ElementBuffer<T> mark(int mark) {
//        this.mark = mark;
//        return this;
//    }
//    public ElementBuffer<T> position(int position) {
//        this.position = position;
//        return this;
//    }
//
//    public int limit() {
//        return limit;
//    }
//    public int mark() {
//        return mark;
//    }
//    public int position() {
//        return position;
//    }


    /**
     * {@inheritDoc}
     * @throws IllegalStateException when the capacity of this ElementBuffer is undefined
     */
    @Override
    public @NonNull Iterator<T> iterator() throws IllegalStateException{
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
