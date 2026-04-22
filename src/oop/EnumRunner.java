package oop;

import java.util.Arrays;

public class EnumRunner {
    static void main() {
        ProcessorType bit32Processor = ProcessorType.BIT_32;
        System.out.println(bit32Processor);
        System.out.println(bit32Processor.name());
        System.out.println(bit32Processor.toString());
        System.out.println(ProcessorType.valueOf("BIT_32") + "\n");

        System.out.println(Arrays.toString(ProcessorType.values()));
        System.out.println(bit32Processor.ordinal());
        System.out.println(bit32Processor.getName());
        System.out.println(bit32Processor.getDescription());
    }
}
