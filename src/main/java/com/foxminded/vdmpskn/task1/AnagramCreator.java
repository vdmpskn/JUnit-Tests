package com.foxminded.vdmpskn.task1;

import java.util.StringJoiner;

import static com.foxminded.vdmpskn.task1.Anagrams.reverseWord;

public class AnagramCreator {

    public static String createSentenceAnagram(String str) {
        if (str == null || str.trim().isEmpty()) {
            throw new NullPointerException("Input string cannot be null or empty.");
        }
        StringJoiner anagram = new StringJoiner(" ");
        String [] splitSentence = str.split(" ");

        for (String s : splitSentence) {
            anagram.add(reverseWord(s));
        }
        return anagram.toString();
    }

}
