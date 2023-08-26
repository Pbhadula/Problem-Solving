package com.dsa.recursion;

import java.util.Scanner;

public class TowerOfHanoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String t1 = "A";    //tower 1
        String t2 = "B";    //tower 2
        String t3 = "C";    //tower 3
        toh(n, t1, t2, t3);
    }

    private static void toh(int n, String t1d, String t2d, String t3d) {
        if (n == 0) {
            return;
        }
        toh(n - 1, t1d, t3d, t2d);                              //will print the instructions to move n-1 disks from t1 to t3 using t2
        System.out.println(n + "[" + t1d + " -> " + t2d + "]");
        toh(n - 1, t3d, t2d, t1d);                              //will print the instructions to move n-1 disks from t3 to t2 using t1
    }
}
