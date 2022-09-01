package com.sonam;

public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        String name = "Sonam";
        {
//            int a =78; // already initialised the value outside the block in the same method
            a = 100;   //reassign the origin ref variable to some other value
            int c = 99;
            name = "Sapna";
            System.out.println(name);
            //Values initialized in this block, will remain in block
        }
//        System.out.println(c);     // cannot use outside the block
//        System.out.println(num);
//        System.out.println(marks);
        System.out.println(a);
        System.out.println(name);

        //Scoping in for loops
        for (int i = 0; i < 4; i++) {
            System.out.println(i);
            int num = 90;
//            int a = 10;
        }

    }


    static void random(int marks) {
        int num = 67;
        System.out.println(num);
        System.out.println(marks);
    }
}
