package com.sonam;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
//        fun();
//        multiple(2,3,"sonam","Sapna");
        //demo();
        demo(2,5,6);
        fun(2,5,9);


    }
    static void demo(int ...v) {
        System.out.println(Arrays.toString(v));
    }
    static void multiple(int a, int b, String ...v){
        System.out.println(Arrays.toString(v));
    }

    static void fun(int ...v) {
        System.out.println(Arrays.toString(v));
    }
}
