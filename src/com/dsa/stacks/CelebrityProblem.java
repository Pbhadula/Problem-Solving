package com.dsa.stacks;

import java.util.Stack;

public class CelebrityProblem {
    public static void main(String[] args) {
//        If there is a '1' in ith row, jth spot, then person i knows about person j.
//        A celebrity is defined as somebody who knows no other person than himself but everybody else knows him.
        int[][] arr = {
                {0, 1, 0},
                {0, 0, 0},
                {0, 1, 1}
        };

        findCelebrity(arr);
    }

    private static void findCelebrity(int[][] arr) {
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i< arr.length; i++) {
            stack.push(i);
        }

        while(stack.size() >= 2) {
            int i = stack.pop();
            int j = stack.pop();

            if(arr[i][j] == 1 ){
                //if i knows j --> i is not a celebrity
                stack.push(j);
            } else {
                //if i does not know j --> j is not a celebrity
                stack.push(i);
            }
        }

        int potentialCeleb = stack.pop();
        for (int i =0 ; i< arr.length; i++) {
            if(i!=potentialCeleb) {
                if(arr[i][potentialCeleb] == 0 || arr[potentialCeleb][i]==1) {
                    System.out.println("No celebrity");
                    return;
                }
            }
        }
        System.out.println(potentialCeleb);
    }
}
