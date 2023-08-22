package com.dsa.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SumOf2Arrays {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter no of elements in first array :");
        int n1 = s.nextInt();
        System.out.println("Enter array element :");
        int[] arr1 = new int[n1];

        for(int i=0; i< arr1.length; i++) {
            arr1[i] = s.nextInt();
        }

        System.out.println("Enter no of elements in second array :");
        int n2 = s.nextInt();
        System.out.println("Enter array element :");
        int[] arr2 = new int[n2];

        for(int i=0; i< arr2.length; i++) {
            arr2[i] = s.nextInt();
        }

        int[] sum = new int[n1>n2 ? n1 : n2];

        int i = arr1.length-1;
        int j = arr2.length-1;
        int k = sum.length-1;

        int carry = 0;

        while(k>=0) {
            int digit = carry;

            if(i>=0) {
                digit = digit + arr1[i];
            }

            if(j>=0) {
                digit = digit + arr2[j];
            }

            carry = digit / 10;
            digit = digit % 10;

            sum[k] = digit;

            i--;
            j--;
            k--;
        }

        if(carry != 0 ) {
            System.out.print(carry);
        }
//        for(int val : sum) {
//            System.out.println(val);
//        }
        Arrays.stream(sum)
                .forEach(System.out::print);
    }
}
