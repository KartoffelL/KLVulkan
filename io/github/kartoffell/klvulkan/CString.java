package io.github.kartoffell.klvulkan;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;
import java.nio.charset.StandardCharsets;

// Copyright 2026 Kareem Athamneh
// Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the “Software”), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
// The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
// THE SOFTWARE IS PROVIDED “AS IS”, WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
/**
 * A c-style representation of a null-terminated ascii string.
 */
public class CString implements Element<CString>, CharSequence {

    /**
     * Wraps the given MemorySegment into a CString. Carse should be taken when using this method, since invalid input may crash the JVM.
     * @param segment the segment (should be null-terminated)
     * @return a new CString
     */
    public static CString wrap(MemorySegment segment) {
        if(segment.byteSize() != 0)
            return new CString(segment);
        final var seg = segment.reinterpret(Long.MAX_VALUE);
        int indx = 0;
        while (seg.get(ValueLayout.JAVA_BYTE, indx) != 0x00) {
            indx++;
        }
        return new CString(segment.reinterpret(indx));
    }

    /**
     * Allocates a new empty CString. The size should be non-null, and the resulting CString will be null-terminated.
     * @param arena the arena to use
     * @param size the size
     * @return a new CString
     */
    public static CString allocateDirect(Arena arena, int size) {
        return new CString(arena.allocate(size));
    }

    /**
     * Allocates a new CString, populating it with the given value. The given String will be represented using the US_ASCII charset.
     * @param arena the arena to use
     * @param value the US_ASCII string
     * @return a new CString
     */
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

    @Override
    public int length() {
        final var mem = address();
//        for(int i = 0; i < mem.byteSize(); i++) {
//            if(mem.get(ValueLayout.JAVA_BYTE, i) == 0)
//                return i;
//        }
        return Math.toIntExact(mem.byteSize()-1);
    }
    @Override
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
    @Override
    public boolean isEmpty() {
        return address().get(ValueLayout.JAVA_BYTE, 0) == 0;
    }
    @Override
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

    @Override
    public String toString() {
        return address.getString(0, StandardCharsets.US_ASCII);
    }

    @Override
    public MemorySegment address() {
        return address;
    }
}
