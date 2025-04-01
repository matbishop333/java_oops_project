package com.github.matbishop333.javaoops.part1;
//Test: Find the first Non-Repeating Character in a String. example "abracadabra" would be "C"

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqueCharFinder {
    public char uniqueChar(String str1) {
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for (char c : str1.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) +1 );
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return '\0';
    }
}
