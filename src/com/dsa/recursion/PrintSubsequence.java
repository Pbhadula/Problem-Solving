package com.dsa.recursion;

import java.util.Scanner;

public class PrintSubsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        printSubSequence(str, "");

    }

    private static void printSubSequence(String ques, String ans) {
        if (ques.length() == 0) {
            System.out.println(ans);
            return;
        }

        char ch = ques.charAt(0);
        String restOfString = ques.substring(1);

        printSubSequence(restOfString, ans + ch);
        printSubSequence(restOfString, ans + "-");
    }
}
