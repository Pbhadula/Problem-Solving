package com.dsa.arrays;

import java.util.Scanner;

public class DiffOf2Arrays {
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

        int[] diff = new int[n2];

        int i = arr1.length-1;
        int j = arr2.length-1;
        int k = diff.length-1;

        int carry = 0;

        while(k>=0) {
            int digit = 0;
            int arr1value = i >= 0 ? arr1[i] : 0;

            if(arr2[j] + carry >= arr1value ) {
                digit = arr2[j] + carry - arr1value;
                carry = 0;
            } else {
                digit = arr2[j] + carry + 10 -arr1value;
                carry = -1;
            }

            diff[k] = digit;

            i--;
            j--;
            k--;
        }

        int indx =0;
        //To remove preceding 0 values (001)
        while(indx< diff.length) {
            if(diff[indx] == 0) {
                indx++;
            } else {
                break;
            }
        }

        //for printing difference
        while(indx< diff.length){
            System.out.print(diff[indx]);
            indx++;
        }
    }
}

