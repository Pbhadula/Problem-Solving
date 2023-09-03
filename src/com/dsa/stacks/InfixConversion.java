package com.dsa.stacks;

import java.util.Scanner;
import java.util.Stack;

public class InfixConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Infix expression to evaluate Postfix and Prefix: ");
        String exp = sc.nextLine();

        Stack<String> postfix = new Stack<>();
        Stack<String> prefix = new Stack<>();
        Stack<Character> operator = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);

            if (ch == '(') {
                operator.push(ch);
            } else if ((ch >= '0' && ch <= '9') ||
                    (ch >= 'a' && ch <= 'z') ||
                    (ch >= 'A' && ch <= 'Z')) {
                postfix.push(ch + "");
                prefix.push(ch + "");
            } else if (ch == ')') {
                while (operator.peek() != '(') {
                    process(operator, postfix, prefix);
                }
                operator.pop();             //popping the starting bracket '('
            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                while (operator.size() > 0 &&
                        operator.peek() != '(' &&
                        precedence(ch) <= precedence(operator.peek())) {
                    process(operator, postfix, prefix);
                }
                operator.push(ch);          //pushing current operator
            }
        }
        while (operator.size() > 0) {
            process(operator, postfix, prefix);
        }
        System.out.println("Postfix : " + postfix.pop());
        System.out.println("Prefix : " + prefix.pop());
    }

    private static void process(Stack<Character> operator, Stack<String> postfix, Stack<String> prefix) {
        char op = operator.pop();

        String postV2 = postfix.pop();
        String postV1 = postfix.pop();
        String postValue = postV1 + postV2 + op;
        postfix.push(postValue);

        String preV2 = prefix.pop();
        String preV1 = prefix.pop();
        String preValue = op + preV1 + preV2;
        prefix.push(preValue);
    }

    private static int precedence(char ch) {
        if (ch == '+' || ch == '-') {
            return 1;
        } else if (ch == '*' || ch == '/') {
            return 2;
        } else {
            return -1;
        }
    }
}
