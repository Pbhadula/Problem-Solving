package com.dsa.recursion;


import java.util.Scanner;

public class AllIndicesOfAnArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Length of the array: ");
        int n=scanner.nextInt();
        int []arr=new int[n];
        System.out.println("Enter values of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i]= scanner.nextInt();
        }
        System.out.println("Enter the value of x: ");
        int x=scanner.nextInt();
        int[] allIndices= getAllIndices(arr,x,0,0);
        DisplayTheArray.displayArrayReverse(allIndices,0);

    }

    private static int[] getAllIndices(int[] arr, int x, int idx, int foundSoFar ) {
        if(idx == arr.length) {
            return new int[foundSoFar];
        }
        if(arr[idx] == x) {
            int [] iarr= getAllIndices(arr, x, idx+1, foundSoFar+1);
            iarr[foundSoFar]=idx;
            return iarr;

        } else {
            int iarr[]= getAllIndices(arr, x, idx+1, foundSoFar);
            return iarr;
        }
    }
}
