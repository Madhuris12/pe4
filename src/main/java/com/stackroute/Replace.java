package com.stackroute;

import java.util.Scanner;

public class Replace {
    public static void main(String[] args) {
        String original, strnew, strnew1, strnew2;
        System.out.println("enter the string");
        Scanner scan = new Scanner(System.in);
        original = scan.nextLine();
        System.out.println("Actual string is " + original);
        //replace the vowel by space and print remaining
        strnew = original.replace("d", "f");
        System.out.println("string is " + strnew);
        strnew1 = strnew;
        strnew2 = strnew1.replace("l", "t");


        System.out.println("string is " + strnew2);
    }
}