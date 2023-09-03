package com.dsa.stacks;

import java.util.Scanner;
import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int[] nextGreatestIntegerInRight = nextGreatestIntegerInRight(arr);
        System.out.println(nextGreatestIntegerInRight);
    }

    private static int[] nextGreatestIntegerInRight(int[] arr) {
        int[] nextGreaterInteger = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        stack.push(arr[arr.length - 1]);
        nextGreaterInteger[arr.length - 1] = -1;
        for (int i = arr.length - 2; i >= 0; i--) {
            while (stack.size() > 0 && arr[i] >= stack.peek()) {
                stack.pop();
            }
            if (stack.size() == 0) {
                nextGreaterInteger[i] = -1;
            } else nextGreaterInteger[i] = stack.peek();
            stack.push(arr[i]);
        }
        return nextGreaterInteger;
    }


}
