package com.sonam;

import java.util.Scanner;

public class ProjectCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter 1st number:");
        int a = in.nextInt();
        System.out.print("Enter 2nd number:");
        int b = in.nextInt();
        System.out.print("Enter the operation to be performed:");
        String Op = in.next();
        //switch case
        switch (Op) {
            case "+" -> System.out.println(a + " " + Op + " " + b + " =" + (a + b));
            case "-" -> System.out.println(a + " " + Op + " " + b + " =" + (a - b));
            case "*" -> System.out.println(a + " " + Op + " " + b + " =" + (a * b));
            case "/" -> System.out.println(a + " " + Op + " " + b + " =" + (a / b));
            case "%" -> System.out.println(a + " " + Op + " " + b + " =" + (a % b));
            default -> System.out.println("Invalid Operator");
        }

    }
}
