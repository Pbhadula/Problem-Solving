package com.dsa.stacks;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class MergeOverlappingIntervals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of time intervals : ");
        int n = sc.nextInt();

        int[][] arr = new int[n][2];

        System.out.println("Enter Intervals : ");
        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        mergeOverlappingIntervals(arr);
    }

    private static void mergeOverlappingIntervals(int[][] arr) {

        Pair[] pairs = new Pair[arr.length];
        for (int i = 0; i < arr.length; i++) {
            pairs[i] = new Pair(arr[i][0], arr[i][1]);
        }
        Arrays.sort(pairs);
        Stack<Pair> stack = new Stack<>();
        for (int i = 0; i < pairs.length; i++) {
            if (i == 0) {
                stack.push(pairs[i]);
            } else {
                Pair top = stack.peek();
                if (pairs[i].startTime > top.endTime) {
                    stack.push(pairs[i]);
                } else {
                    top.endTime = Math.max(top.endTime, pairs[i].endTime);
                }
            }
        }
        Stack<Pair> resultStack = new Stack<>();
        while (stack.size() > 0) {
            resultStack.push(stack.pop());
        }

        while (resultStack.size() > 0) {
            Pair p = resultStack.pop();
            System.out.println(p.startTime + " " + p.endTime);
        }
    }

    public static class Pair implements Comparable<Pair> {
        int startTime;
        int endTime;

        Pair(int startTime, int endTime) {
            this.startTime = startTime;
            this.endTime = endTime;
        }

        // this > other      return +ve
        // this = other       return 0
        // this < other        return -ve
        public int compareTo(Pair other) {
            if (this.startTime != other.startTime) {
                return this.startTime - other.startTime;
            } else {
                return this.endTime - other.endTime;
            }
        }
    }
}

//Intervals
//        22 28
//        1 8
//        25 27
//        14 19
//        27 30
//        5 12
//
//        Expected result
//        1 12
//        14 19
//        22 30

