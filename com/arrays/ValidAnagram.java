package com.arrays;

import java.util.Arrays;
import java.util.Objects;

public class ValidAnagram {


    public static void main(String[] args) {
        System.out.println(isAnagram("ABC", "CBA"));
        System.out.println(isAnagram("GAH", "MOP"));
        System.out.println(isAnagram("T", "TTT"));
        System.out.println(isAnagram("aA", "Aa"));
        System.out.println(isAnagram("01", "10"));




    }

    private static boolean isAnagram(String first, String second) {
        if (Objects.isNull(first) || Objects.isNull(second)) {
            return false;
        }
        int firstLen = first.length();
        int secondLen = second.length();
        if (firstLen == 0 || secondLen == 0 || firstLen != secondLen) {
            return false;
        }
        char[] firstArray = first.toCharArray();
        char[] secondArray = second.toCharArray();

        Arrays.sort(firstArray);
        Arrays.sort(secondArray);

        return Arrays.equals(firstArray, secondArray);
    }

}
