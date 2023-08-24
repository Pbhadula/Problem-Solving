package com.dsa.arrays;

import java.util.Scanner;

public class SubsetOfArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter no of elements in array :");
        int n = s.nextInt();
        System.out.println("Enter array element :");
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }

        int rows = (int)Math.pow(2, arr.length);

        for(int i=0; i<rows; i++) {
            String set = "";
            int temp = i;

            for(int j= arr.length-1; j>=0; j--) {
                int rem = temp % 2;
                temp = temp /2;

                if(rem == 0) {
                    set = "-\t" + set;
                } else {
                    set =  arr[j] + "\t" + set;
                }
            }
            System.out.println(set);

        }

    }
}
