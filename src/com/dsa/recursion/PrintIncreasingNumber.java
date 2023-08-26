package com.dsa.recursion;

import java.util.Scanner;

public class PrintIncreasingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter highest number to be printed : ");
        int num = sc.nextInt();

        printIncreasing(num);
    }

    private static void printIncreasing(int num) {
        if(num == 0) {
            return;
        }
        printIncreasing(num - 1);
        System.out.println(num);
    }
}
