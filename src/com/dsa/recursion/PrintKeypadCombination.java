package com.dsa.recursion;

import java.util.Scanner;

public class PrintKeypadCombination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String pressedKey = sc.nextLine();

        printKeypadCombination(pressedKey, "");
    }

    public static String[] codes = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

    private static void printKeypadCombination(String ques, String ans) {

        if (ques.length() == 0) {
            System.out.println(ans);
            return;
        }

        char ch = ques.charAt(0);
        String restOfString = ques.substring(1);

        String codeForCharacter = codes[ch - '0'];
        for (int i = 0; i < codeForCharacter.length(); i++) {
            char characterCode = codeForCharacter.charAt(i);
            printKeypadCombination(restOfString, ans + characterCode);
        }
    }
}
