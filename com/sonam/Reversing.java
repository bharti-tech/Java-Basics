package com.sonam1;

public class Reversing {
    public static void main(String[] args) {
        int num = 23597;

        int renum =0;

        while (num > 0) {
            int rem = num % 10;
            num /= 10;

            renum = renum * 10 + rem;
        }

        System.out.println(renum);
    }
}
