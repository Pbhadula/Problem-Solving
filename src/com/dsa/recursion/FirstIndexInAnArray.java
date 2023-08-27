package com.dsa.recursion;

import java.util.Scanner;

public class FirstIndexInAnArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int []arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]= scanner.nextInt();
        }
        int d=scanner.nextInt();
        int firstIndex= findFirstIndex(arr,0,d);
        System.out.println(firstIndex);

    }

    private static int findFirstIndex(int[] arr, int i, int d) {
        if (i == arr.length) {
            return -1;
        }
//        wrong method - comparing all values first
//        int firstIndexInSmallerArray=findFirstIndex(arr, i+1, d);
//        if (arr[i] == d) {
//            return arr[i];
//        }
//        else {
//            return firstIndexInSmallerArray;
//        }


//        correct method - will return index in first encounter
        if (arr[i] == d) {
            return i;
        }
        else {
            int firstIndexInSmallerArray= findFirstIndex(arr,i+1,d);
            return firstIndexInSmallerArray;
        }

    }
}
