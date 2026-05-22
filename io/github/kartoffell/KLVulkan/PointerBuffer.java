package io.github.kartoffell.KLVulkan;

import org.jspecify.annotations.NonNull;
import org.jspecify.annotations.Nullable;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;
import java.nio.Buffer;
import java.util.Iterator;
import java.util.function.Function;

public class PointerBuffer<T> extends ElementBuffer<T> {

    //Standard PointerBuffer creation functions

    public static <T> PointerBuffer<T> wrap(MemorySegment segment, Function<MemorySegment, T> producer) {
        return new PointerBuffer<T>(producer, (int) ValueLayout.ADDRESS.byteSize(), segment.reinterpret(Long.MAX_VALUE));
    }

    public static <T> PointerBuffer<T> allocateDirect(Arena arena, int count, Function<MemorySegment, T> producer) {
        return new PointerBuffer<T>(producer, (int) ValueLayout.ADDRESS.byteSize(), arena.allocate(ValueLayout.ADDRESS, count));
    }

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

    @Override
    public @NonNull Iterator<T> iterator() {
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
