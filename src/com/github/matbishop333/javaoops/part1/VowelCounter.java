package com.github.matbishop333.javaoops.part1;
//Test: Create a method to count how many vowels are present in a string "documentation"
public class VowelCounter {
    public int vowelCount(String str1) {
        int count = 0;
        String vowels = "aeiouAEIOU";
        for (int i =0; i < str1.length(); i++) {
            if(vowels.indexOf(str1.charAt(i)) >= 0) {
                count ++;
            }
        }
        return count;
    }
}
