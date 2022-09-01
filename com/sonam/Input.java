package com.sonam;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        arr[0] = 23;
        arr[1] = 45;
        arr[2] = 90;
        arr[3] = 15;
        arr[4] = 3;
        // input using for loops
//        System.out.println(arr[3]);
        //Inputs using for loops
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = in.nextInt();
//        }
//
//        System.out.println(Arrays.toString(arr));


//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }

        //arry of objects
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));
         //to modify
        str[1] = "Sonam";
        System.out.println(Arrays.toString(str));
    }
}
