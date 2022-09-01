package com.sonam;

import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
//         String message = greet();
//        System.out.println(message);
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Your name");
        String name1 = in.next();
        String personalised = myGreet(name1);
        System.out.println(personalised);

    }
    static String myGreet(String name) {
        String message = "Hello " + name;
        return message;
    }
    static String greet() {
        String greeting = "ni hao";
        return greeting;
    }
}
