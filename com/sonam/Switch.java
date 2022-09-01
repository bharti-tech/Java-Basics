package com.sonam;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        String fruit = in.next();

//        if(fruit.equals("Mango")){
//            System.out.println("King of fruit");
//        }
//
//        if(fruit.equals("apple")){
//            System.out.println("Sweet Round Red fruit");
//        }
//        switch (fruit) {
//            case "Mango" -> System.out.println("King of fruit");
//            case "Apple" -> System.out.println("Sweet red fruit");
//            case "Orange" -> System.out.println("Round Fruit");
//            case "Grapes" -> System.out.println("Small green fruit");
//            default -> System.out.println("Please enter the valid fruit");
//        }

        //Program->2
         int day = in.nextInt();
//        switch (day) {
//            case 1 -> System.out.println("Monday");
//            case 2 -> System.out.println("Tuesday");
//            case 3 -> System.out.println("Wednesday");
//            case 4 -> System.out.println("Thrusday");
//            case 5 -> System.out.println("Friday");
//            case 6 -> System.out.println("Saturday");
//            case 7 -> System.out.println("Sunday");
//        }

        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
            case 6, 7 -> System.out.println("Weekend");
        }


    }
}
