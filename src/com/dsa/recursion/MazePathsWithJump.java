package com.dsa.recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class MazePathsWithJump {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        ArrayList<String> paths = getMaizePathsWithJump(1, 1, n, m);
        System.out.println(paths);
    }

//    sr - source row
//    sc - source column
//    dr - destination row
//    dc - destination column

    private static ArrayList<String> getMaizePathsWithJump(int sr, int sc, int dr, int dc) {
        if (sr == dr && sc == dc) {
            ArrayList<String> baseCase = new ArrayList<>();
            baseCase.add("");
            return baseCase;
        }

        ArrayList<String> paths = new ArrayList<>();

        // horizontal moves
        for (int ms = 1; ms <= dc - sc; ms++) {
            ArrayList<String> hpaths = getMaizePathsWithJump(sr, sc + ms, dr, dc);
            for (String hpath : hpaths) {
                paths.add("h" + ms + hpath);
            }
        }

        // vertical moves
        for (int ms = 1; ms <= dr - sr; ms++) {
            ArrayList<String> vpaths = getMaizePathsWithJump(sr + ms, sc, dr, dc);
            for (String vpath : vpaths) {
                paths.add("v" + ms + vpath);
            }
        }

        //diagonal moves
        for (int ms = 1; ms <= dr - sr && ms <= dc - sc; ms++) {
            ArrayList<String> dpaths = getMaizePathsWithJump(sr + ms, sc + ms, dr, dc);
            for (String dpath : dpaths) {
                paths.add("d" + ms + dpath);
            }
        }
        return paths;
    }
}