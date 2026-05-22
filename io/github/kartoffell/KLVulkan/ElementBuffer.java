package io.github.kartoffell.KLVulkan;

import org.jspecify.annotations.NonNull;
import org.jspecify.annotations.Nullable;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;
import java.util.Iterator;
import java.util.function.Function;

public class ElementBuffer<T> implements Iterable<T>, Element<T> {


    protected final MemorySegment address;
    protected final Function<MemorySegment, T> producer;
    protected final int elementSize;
    protected int limit, position, mark;

    //Standard ElementBuffer creation functions
    public static <T> ElementBuffer<T> wrap(MemorySegment segment, int elementSize, Function<MemorySegment, T> producer) {
        return new ElementBuffer<T>(producer, elementSize, segment.reinterpret(Long.MAX_VALUE));
    }


    public static <T> ElementBuffer<T> allocateDirect(Arena arena, int count, int elementSize, Function<MemorySegment, T> producer) {
        return new ElementBuffer<T>(producer, elementSize, arena.allocate((long) count *elementSize, ValueLayout.ADDRESS.byteAlignment()));
    }

    protected ElementBuffer(Function<MemorySegment, T> producer, int elementSize, MemorySegment address) {
        this.producer = producer;
        this.elementSize = elementSize;
        this.address = address;
    }

    public T get(int indx) {
        final var v = address.asSlice((long) indx *elementSize, elementSize);
        return producer.apply(v);
    }

    public int getElementSize() {
        return elementSize;
    }
    public int capacity() {
        return Math.toIntExact(address.byteSize() / elementSize);
    }

    @Override
    public MemorySegment address() {
        return address;
    }

    public ElementBuffer<T> limit(int limit) {
        this.limit = limit;
        return this;
    }
    public ElementBuffer<T> mark(int mark) {
        this.mark = mark;
        return this;
    }
    public ElementBuffer<T> position(int position) {
        this.position = position;
        return this;
    }

    public int limit() {
        return limit;
    }
    public int mark() {
        return mark;
    }
    public int position() {
        return position;
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
