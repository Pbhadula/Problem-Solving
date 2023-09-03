package com.dsa.stacks;

import java.util.Scanner;
import java.util.Stack;

public class InfixEvaluation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the expression to evaluate : ");
        String exp = sc.nextLine();

        Stack<Integer> operand = new Stack<>();
        Stack<Character> operator  = new Stack<>();

        for(int i=0; i<exp.length(); i++) {
            char ch = exp.charAt(i);

            if(ch == '(') {
                operator.push(ch);
            } else if (ch == ')') {
                while(operator.peek() != '(') {
                    char optor = operator.pop();
                    int v2 = operand.pop();
                    int v1 = operand.pop();
                    
                    int opValue = operation(v1,v2,optor);
                    operand.push(opValue);
                }
                operator.pop();
            } else if (Character.isDigit(ch)) {
                operand.push(ch - '0');
            } else if(ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                //ch is wanting higher priority operators to solve first
                while(operator.size()>0 && operator.peek() != '(' && precedence(ch) <= precedence(operator.peek())) {
                    char optor = operator.pop();
                    int v2 = operand.pop();
                    int v1 = operand.pop();

                    int opValue = operation(v1,v2,optor);
                    operand.push(opValue);
                }
                //ch is pushing itself now
                operator.push(ch);
            }
        }
        while(operator.size()!=0) {
            char optor = operator.pop();
            int v2 = operand.pop();
            int v1 = operand.pop();

            int opValue = operation(v1,v2,optor);
            operand.push(opValue);
        }
        System.out.println(operand.peek());
    }

    private static int precedence(char ch) {
        if( ch == '+' || ch == '-') {
            return 1;
        } else {
            return 2;
        }
    }

    private static int operation(int v1, int v2, char ch) {
        if(ch == '+') {
            return v1+v2;
        } else if(ch == '-'){
            return v1-v2;
        } else if (ch == '*') {
            return v1*v2;
        } else {
            return v1/v2;
        }
    }
}
