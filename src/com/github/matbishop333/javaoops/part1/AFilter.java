package com.github.matbishop333.javaoops.part1;
/*Test: Write a program to filter through a list of strings and only keep those that start with "A" and return them
in lowercase */

import java.util.ArrayList;
import java.util.List;

public class AFilter {
    public List<String> filter(List<String>list) {
        List<String> lowerCaseList = new ArrayList<>();

        for (String item : list){
            lowerCaseList.add(item.toLowerCase());
        }

        lowerCaseList.removeIf(n -> !n.startsWith("a"));

        return lowerCaseList;
    }
}
