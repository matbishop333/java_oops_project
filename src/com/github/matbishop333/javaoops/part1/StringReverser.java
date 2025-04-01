package com.github.matbishop333.javaoops.part1;
// Task: Write a function to reverse a given string.

public class StringReverser {
    public String reverseString(String str1) {
        StringBuilder sb = new StringBuilder(str1);
        sb.reverse();
        return new StringBuilder(str1).reverse().toString();
    }
}
