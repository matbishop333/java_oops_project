package com.github.matbishop333.javaoops.part1;
//Test: Create a method to count the number of words in a string
public class WordCounter {

    public int wordCount(String str1) {
        String[] words = str1.trim().split("[\\s\\p{Punct}]+");
        return words.length;
    }
}
