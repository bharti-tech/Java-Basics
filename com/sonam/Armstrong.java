package com.sonam;

//import javax.swing.*;
import java.util.Scanner;

public class Armstrong {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        boolean Ans = isArmstrong(n);
//        System.out.println(Ans);

//        System.out.println(isArmstrong(n));

        // Print all the 3 digit Armstrong no.
        for (int i = 100; i < 1000; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
    }
    }
        static boolean isArmstrong(int n) {
            int sum = 0;
            int Original = n;
            while (n > 0) {
                int rem = n % 10;
                sum = sum + rem * rem * rem;
                n = n / 10;
            }
            return sum == Original;
        }
    }
