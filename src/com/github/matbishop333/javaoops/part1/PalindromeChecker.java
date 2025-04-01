package com.github.matbishop333.javaoops.part1;
//Task: Write a program to check is a String is Palindrome(reads same forwards and backwards)

public class PalindromeChecker {
    public Boolean checkPalindrome(String str1) {
        String reversed = new StringBuilder(str1).reverse().toString();
        return str1.equals(reversed);
        }
    }
