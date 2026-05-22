package io.github.kartoffell.KLVulkan;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.function.Function;

/**
 * A c-style representation of a null-terminated ascii string.
 */
public class CString implements Element<CString>, CharSequence {

    public static CString wrap(MemorySegment segment) {
        return new CString(segment);
    }

    public static CString allocateDirect(Arena arena, int size) {
        return new CString(arena.allocate(size));
    }

    public static CString allocateDirect(Arena arena, String value) {
        final var b = value.getBytes(StandardCharsets.US_ASCII);
        final var bb = new byte[b.length+1];
        System.arraycopy(b, 0, bb, 0, b.length);
        return new CString(arena.allocateFrom(ValueLayout.JAVA_BYTE, bb));
    }


    private final MemorySegment address;

    CString(MemorySegment address) {
        this.address = address;
    }

    public int length() {
        final var mem = address();
//        for(int i = 0; i < mem.byteSize(); i++) {
//            if(mem.get(ValueLayout.JAVA_BYTE, i) == 0)
//                return i;
//        }
        return Math.toIntExact(mem.byteSize());
    }
    public char charAt(int index) {
//        for(int b = 0; b < address.byteSize(); b++) {
//            byte c = address.get(ValueLayout.JAVA_BYTE, b);
//            if((c&0b11000000) != 0b10000000) {
//                if(index == 0) {
//                    int bytes = Integer.numberOfLeadingZeros(b^1);
//
//                }
//                index--;
//            }
//        }
//        throw new IllegalStateException();
        return (char) address.get(ValueLayout.JAVA_BYTE, index);
    }
    public boolean isEmpty() {
        return address().get(ValueLayout.JAVA_BYTE, 0) == 0;
    }
    public CharSequence subSequence(int start, int end) {
        if(end == address.byteSize()) {
            return new CString(address.asSlice(start));
        }
        return toString().subSequence(start, end);
    }

//    private int getByteOffset(int index) {
//        for(int b = 0; b < address.byteSize(); b++) {
//            byte c = address.get(ValueLayout.JAVA_BYTE, b);
//            if((c&0b11000000) != 0b10000000) {
//                if(index == 0)
//                    return b;
//                index--;
//            }
//        }
//        throw new IllegalStateException();
//    }


    public String toString() {
        return address.getString(0, StandardCharsets.US_ASCII);
    }

    @Override
    public MemorySegment address() {
        return address;
    }
}
