package com.dsa.arrays;

import java.util.Scanner;

public class CeilAndFloor {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter no of elements in array :");
        int n = s.nextInt();
        System.out.println("Enter array element :");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }

        System.out.println("Enter the data value :");
        int data = s.nextInt();

        int low = 0;
        int high = arr.length-1;
        int ceil = 0;
        int floor = 0;

        while(low <= high) {
            int mid = (low + high) / 2;

            if(data < arr[mid]) {
                high = mid - 1;
                ceil = arr[mid];
            } else if(data > arr[mid]) {
                low = mid + 1;
                floor = arr[mid];
            } else {
                ceil = arr[mid];
                floor = arr[mid];
                break;
            }
        }

        System.out.println("Ceil : "+ceil);
        System.out.println("Floor : "+floor);

    }
}
