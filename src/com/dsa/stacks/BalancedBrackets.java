package com.dsa.stacks;

import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')') {
                boolean val = handleCLosing(stack, '(');
                if (!val) {
                    System.out.println(false);
                    return;
                }
            } else if (ch == '}') {
                boolean val = handleCLosing(stack, '{');
                if (!val) {
                    System.out.println(false);
                    return;
                }
            } else if (ch == ']') {
                boolean val = handleCLosing(stack, '[');
                if (!val) {
                    System.out.println(false);
                    return;
                }
            }
        }

        System.out.println(stack.size() == 0);
    }

    private static boolean handleCLosing(Stack<Character> stack, char correspondingOpeningChar) {
        if (stack.size() == 0) {
            return false;
        } else if (stack.peek() != correspondingOpeningChar) {
            return false;
        } else {
            stack.pop();
            return true;
        }
    }
}
