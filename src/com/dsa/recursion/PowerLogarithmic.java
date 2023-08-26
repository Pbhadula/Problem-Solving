package com.dsa.recursion;

import java.util.Scanner;

public class PowerLogarithmic {
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
        int xpnb2 = power(x, n / 2);
        int xn = xpnb2 * xpnb2;
        if (n % 2 == 1) {
            xn = xn * x;
        }
        return xn;
    }
}
