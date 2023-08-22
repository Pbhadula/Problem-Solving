package com.dsa.arrays;

import java.util.Scanner;

public class BarChart {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter no of elements in array :");
        int n = s.nextInt();
        System.out.println("Enter array element :");
        int[] arr = new int[n];

        for(int i=0; i< arr.length; i++) {
            arr[i] = s.nextInt();
        }

        int max = arr[0];
        for(int i=1; i< arr.length; i++) {
            if(arr[i]>max) {
                max = arr[i];
            }
        }

        for(int floor = max; floor>= 1; floor--) {
            for(int i=0; i<arr.length; i++) {
                if(arr[i] >= floor) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
