package com.stackroute;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Reverse object = new Reverse();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the sentence");
        String str = scan.nextLine();
        object.reverseWordInMyString(str);
    }

    public void reverseWordInMyString(String str) {
        String[] words = str.split(" ");
        String reversedString = "";
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String reverseWord = "";
            for (int j = word.length() - 1; j >= 0; j--) {
                reverseWord = reverseWord + word.charAt(j);
            }
            reversedString = reversedString + reverseWord + " ";
        }
        System.out.println(str);
        System.out.println(reversedString);
    }
}
