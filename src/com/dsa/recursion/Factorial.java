package com.dsa.recursion;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number to find factorial : ");
        int num = sc.nextInt();

        System.out.println(factorial(num));
    }

    public static int factorial(int num) {
        if(num == 1) {
            return 1;
        }

        int fact = num * factorial(num - 1);;
        return fact;
    }
}
