package com.github.matbishop333.javaoops.part1;
// Task: Write a program to swap 2 Strings without a temporary variable

public class StringSwapper {

public String[] stringSwap(String str1, String str2) {
    str1 = str1 + str2;
    str2 = str1.substring(0,str1.length() - str2.length());
    str1 = str1.substring(str2.length());
    return new String[] {str1, str2};
}

}
