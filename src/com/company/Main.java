package com.company;

public class Main {

    public static void main(String args[]) {

        int n = 100;
        int p = 61;
        System.out.println("Drawing Book");

        int totalPageTurnCountFromFront = n / 2;
        int targetPageTurnCountFromFront = p /2;
        int targetPageTurnCountFromBack = totalPageTurnCountFromFront - targetPageTurnCountFromFront;


        System.out.println(Math.min(targetPageTurnCountFromFront,targetPageTurnCountFromBack));

    }
}
