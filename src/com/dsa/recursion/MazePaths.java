package com.dsa.recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class MazePaths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        ArrayList<String> paths = getMaizePaths(1,1,n,m);
        System.out.println(paths);
    }

//    sr - source row
//    sc - source column
//    dr - destination row
//    dc - destination column

    private static ArrayList<String> getMaizePaths(int sr, int sc, int dr, int dc) {

        if(sr==dr && sc==dc) {
            ArrayList<String> baseCase = new ArrayList<>();
            baseCase.add("");
            return baseCase;
        }

        ArrayList<String> horizontalPaths = new ArrayList<>();
        ArrayList<String> verticalPaths = new ArrayList<>();

        if(sc<dc) {
            horizontalPaths = getMaizePaths(sr, sc+1, dr, dc);
        }

        if(sr<dr) {
            verticalPaths = getMaizePaths(sr +1, sc, dr, dc);
        }

        ArrayList<String> paths = new ArrayList<>();

        for(String hpath: horizontalPaths) {
            paths.add("h"+hpath);
        }
        for(String vpath: verticalPaths) {
            paths.add("v"+vpath);
        }

        return paths;
    }
}
