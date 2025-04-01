package com.github.matbishop333.javaoops.part1;

import java.util.ArrayList;
import java.util.List;

public class TestRunner {
    public static void main(String[] args) {
        //StringSwapper Test:
        StringSwapper swapper = new StringSwapper();
        String[] swapped = swapper.stringSwap("Java", "Code");
        System.out.println("Swapped: " + swapped[0] + ", " + swapped[1]);

        //AlphaCharacterCounter Test:
        AlphaCharacterCounter counter = new AlphaCharacterCounter();
        String test = "Java 101! Is this working?";
        System.out.println("Test String Full Character Count: " + (test.length()-1));
        int result = counter.alphaCount(test);
        System.out.println("Alpha character count: " + result);

        //StringReverser Test:
        StringReverser sr = new StringReverser();
        String reverseTest = "Hello";
        System.out.println("This is my test string: " + reverseTest);
        String newString = sr.reverseString(reverseTest);
        System.out.println("This is my newly reversed string: " + newString);

        //PalindromeChecker Test:
        PalindromeChecker pc = new PalindromeChecker();
        String pcTest = "madam";
        System.out.println("Is " + pcTest + " a palindrome?");
        System.out.println("Answer: " + pc.checkPalindrome(pcTest));

        //AnagramChecker Test:
        AnagramChecker ac = new AnagramChecker();
        String str1 = "Listen";
        String str2 = "Silent";
        System.out.println("Are '" + str1 + "' and '" + str2 +"' anagrams?");
        System.out.println("Answer: " + ac.anagramCheck(str1, str2));

        //VowelCounter Test:
            VowelCounter vc = new VowelCounter();
            String vcString = "documentation";
            System.out.println("Number of vowels in '" + vcString + "': " + vc.vowelCount(vcString));

        //WordCounter Test:
        WordCounter wc = new WordCounter();
        String wcString = "Hello, world!";
        System.out.println("Number of words in '" + wcString + "': " + wc.wordCount(wcString));

        //AFilter Test:
        AFilter af = new AFilter();
        List<String> testList = List.of("Apple", "Banana", "Avocado", "Peach", "apricot");
        System.out.println("Filtered List: " + af.filter(testList));

        //FirstUniqueCharFinder Test:
        FirstUniqueCharFinder finder = new FirstUniqueCharFinder();
        String input = "abracadabra";
        char charResult = finder.uniqueChar(input);
        System.out.println("First unique character: " + charResult);

        //DuplicateRemover Test:
        DuplicateRemover dr = new DuplicateRemover();
        List<String> drInput = List.of("apple", "banana", "apple", "cherry", "banana");

        System.out.println("Original: " + drInput);
        System.out.println("No Duplicates: " + dr.dupeRemover(new ArrayList<>(drInput)));

        }
    }
