package com.github.matbishop333.javaoops.part1;
// Test: Check if two strings are anagrams(meaning they contain the same characters in different order)

import java.util.Arrays;

public class AnagramChecker {
    public Boolean anagramCheck(String str1, String str2) {

        if(str1.length() != str2.length()){
            return false;
        }

        char[] arr1 = str1.toLowerCase().toCharArray();
        char[] arr2 = str2.toLowerCase().toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1,arr2);
    }
}
