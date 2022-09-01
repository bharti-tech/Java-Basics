package com.sonam;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();
        String department = in.next();

        switch (empID) {
            case 1 -> System.out.println("Sonam Bharti");
            case 2 -> System.out.println("Shikha Bharti");
            case 3 -> {
                System.out.println("Emp Number 3");
                switch (department) {
                    case "EEE" -> System.out.println("EEE Department");
                    case "IT" -> System.out.println("IT Department");
                    default -> System.out.println(" No Department");
                }
            }
            default -> System.out.println("Enter correct ID");
        }
    }
}
