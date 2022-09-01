package com.sonam1;

//import java.util.Scanner;

public class OccurrenceOfNum {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
        int n = 457778;
        int count =0;


        while(n > 0) {
            int rem=n%10;
            if (rem==7){
                count++;
            }
            n=n/10;
        }
        System.out.println(count);
    }
}
