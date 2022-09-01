package com.sonam;

public class Overloading {

    public static void main(String[] args) {
        fun(67);
        fun("Sonam Bharti");
        int ans1 = sum(2,3);
        int ans2 = sum(2,4,5);
        System.out.println(ans1);
        System.out.println(ans2);

    }
    static int sum(int a, int b) {
        return a + b;
    }
    static int sum(int a, int b, int c) {
        return a + b + c;
    }

    //having same
    static void fun(int a) {
        System.out.println("First One:");
        System.out.println(a);
    }

    static void fun(String name) {
        System.out.println("Second one");
        System.out.println(name);
    }
}
