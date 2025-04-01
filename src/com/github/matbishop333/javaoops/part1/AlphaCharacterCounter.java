package com.github.matbishop333.javaoops.part1;
// Task: Write a program to find out how many alpha characters are present in a string

public class AlphaCharacterCounter {
    public int alphaCount(String str1){
        int count = 0;
        for(int i=0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            if(Character.isLetter(ch)){
                count ++;
            }
        }
        return count;
    }
}
