package com.dsa.stacks;

import java.util.Stack;

public class SlidingWindow {
    public static void main(String[] args) {
        int[] arr = {6, 5, 2, 1, 2, 5, 6, 3, 4, 6};
        int[] nextGreaterElement = new int[arr.length];
        int k = 4;
        Stack<Integer> st = new Stack<>();
        st.push(arr.length - 1);
        nextGreaterElement[arr.length - 1] = arr.length;

        for (int i = arr.length - 2; i >= 0; i--) {
            while (st.size() > 0 && arr[i] >= arr[st.peek()]) {
                st.pop();
            }

            if (st.size() == 0) {
                nextGreaterElement[i] = arr.length;
            } else {
                nextGreaterElement[i] = st.peek();
            }

            st.push(i);
        }

        int j = 0;

        for (int i = 0; i <= arr.length - k; i++) {
            //enter the loop to find the maximum of window starting at i
            if (j < i) {
                j = i;
            }

            while (nextGreaterElement[j] < i + k) {
                j = nextGreaterElement[j];
            }
            System.out.println(arr[j]);
        }
    }
}
