package com.dsa.recursion;

import java.util.Scanner;

public class PowerXN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Number : ");
        int x = scanner.nextInt();

        System.out.println("Enter Power : ");
        int n = scanner.nextInt();

        int xn = power(x, n);
        System.out.println(xn);
}

    private static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int xn = x * power(x, n -1);
        return xn;
    }
}
