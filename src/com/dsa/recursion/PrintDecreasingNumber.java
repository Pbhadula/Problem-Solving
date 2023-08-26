package com.dsa.recursion;

import java.util.Scanner;

public class PrintDecreasingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter highest number to be printed : ");
        int num = sc.nextInt();

        printDecreasing(num);
    }

    private static void printDecreasing(int num) {
        if(num == 0) {
            return;
        }
        System.out.println(num);
        printDecreasing(num - 1);
    }
}
