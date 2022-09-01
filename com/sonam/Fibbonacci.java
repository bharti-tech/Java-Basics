package com.sonam1;

import java.util.Scanner;

public class Fibbonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int a = in.next();
        int n = in.nextInt();
        int p=0;
        int i=1;
//        int count = 2;

//        while (count <= n) {
//            int temp = i;
//            i = i + p;
//            p=temp;
//            count++;
//        }
        for (int count = 2; count <= n; count++) {
            int temp = i;
            i=i+p;
            p=temp;
        }

        System.out.println(i);
    }
}
