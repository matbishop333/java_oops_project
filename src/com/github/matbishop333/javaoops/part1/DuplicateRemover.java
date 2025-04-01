package com.github.matbishop333.javaoops.part1;
// Test: Remove all duplicates from ArrayList

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateRemover {
    public List<String> dupeRemover(List<String> input){
        Set<String> seen = new HashSet<>();
        List<String> noDuplicates = new ArrayList<>();

        for(String item : input) {
           if(seen.add(item)) {
               noDuplicates.add(item);
           }
        }
        return noDuplicates;
    }
}
