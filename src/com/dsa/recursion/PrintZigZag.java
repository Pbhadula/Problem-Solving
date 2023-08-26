package com.dsa.recursion;

import java.util.Scanner;

public class PrintZigZag {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        pzz(n);
    }

    private static void pzz(int n) {
        if (n == 0) {
            return;
        }
        System.out.println("pre: "+ n);
        pzz(n-1);
        System.out.println("in: "+n);
        pzz(n-1);
        System.out.println("post: "+n);
    }
}

//sol
//num = 3
//        result
//                pre: 3
//                pre: 2
//                pre: 1
//                in: 1
//                post: 1
//                in: 2
//                pre: 1
//                in: 1
//                post: 1
//                post: 2
//                in: 3
//                pre: 2
//                pre: 1
//                in: 1
//                post: 1
//                in: 2
//                pre: 1
//                in: 1
//                post: 1
//                post: 2
//                post: 3

