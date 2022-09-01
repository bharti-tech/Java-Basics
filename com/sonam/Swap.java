package com.sonam;

public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;


        //Swap the number
//        int temp = a;
//        a = b;
//        b = temp;
        swap(a,b);

        System.out.println(a + " " + b);

        String name = "Sonam Bharti";
        changename(name);
        System.out.println(name);

        System.out.println();
//        int num = 40;
    }

    static void changename(String name) {
        name = "Sapna Bharti"; //Creating a new object.

    }
    static void swap(int num1,int num2) {
        int temp = num1;
        num1 = num2;
        num2 = temp;

        // this change will only valid in this function scope only.
    }
}
