package com.dsa.recursion;

import java.util.Scanner;

public class PrintDecreasingIncreasing {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter highest number to be printed : ");
            int num = sc.nextInt();

            printDecreasingIncreasing(num);
        }

    private static void printDecreasingIncreasing(int num) {
        if(num == 0) { //base case
            return;
        }

        System.out.println(num);
        printDecreasingIncreasing(num -1);
        System.out.println(num);
    }
}
