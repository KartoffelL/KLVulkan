package io.github.kartoffell.KLVulkan;

import java.lang.foreign.MemorySegment;

public interface Element<SELF> {

    MemorySegment address();

}
