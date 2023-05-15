package com.foxminded.vdmpskn.task1;

import java.util.Scanner;

public class Anagrams {

    public static String reverseWord(String str) {
        if (str == null || str.trim().isEmpty()) {
            throw new NullPointerException("Input string cannot be null or empty.");
        }
        char[] sentence = str.toCharArray();
        int endOfSentence = sentence.length - 1;
        StringBuilder sb = new StringBuilder(str.length());

        for (char c : sentence) {
            if (Character.isLetter(c)) {
                while (!Character.isLetter(sentence[endOfSentence])) {
                    endOfSentence--;
                }
                sb.append(sentence[endOfSentence--]);
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sentence = new Scanner(System.in);
        System.out.print("Write your sentence: ");
        String reverse = sentence.nextLine();
        System.out.print("Your reverse sentence: ");
        System.out.println(AnagramCreator.createSentenceAnagram(reverse));

        ResultOfTask.resultOfTask();
    }

}