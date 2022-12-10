package com.arrays;

import java.util.Arrays;
import java.util.Objects;

public class ContainsDuplicate {

    private static boolean hasDuplicates(String[] args) {
        if(Objects.isNull(args) || args.length == 0) {
            return false;
        }
        return (args.length > Arrays.stream(args).distinct().count()) ?
                true: false;
    }

    public static void main(String...args) {
        String[] input1 = new String[]{"A", "AA", "A", "C"};
        System.out.println(hasDuplicates(input1));

        String[] input2 = new String[]{"A", "B"};
        System.out.println(hasDuplicates(input2));

        String[] input3 = new String[]{"CC", "CC"};
        System.out.println(hasDuplicates(input3));

        String[] input4 = new String[]{"CC"};
        System.out.println(hasDuplicates(input4));

    }


}
