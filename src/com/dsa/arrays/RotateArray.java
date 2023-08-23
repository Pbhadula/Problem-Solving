package com.dsa.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter no of elements in array :");
        int n = s.nextInt();
        System.out.println("Enter the value by which the array should rotate :");
        int k = s.nextInt();
        System.out.println("Enter array element :");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }

        k= k% arr.length;

        if(k<0) {
            k = k + arr.length;
        }

        reverseArray(arr, 0, arr.length-k-1);

        reverseArray(arr, arr.length-k, arr.length-1);

        reverseArray(arr, 0, arr.length-1);

        Arrays.stream(arr).forEach(System.out::println);

    }
        public static void reverseArray(int[] arr, int left, int right) {
            while(left<right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }
}
