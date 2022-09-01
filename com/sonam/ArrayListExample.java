package com.sonam;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //syntax
        ArrayList<Integer> list = new ArrayList<>(10);

//        list.add(67);
//        list.add(22);
//        list.add(54);
//        list.add(99);
//        list.add(78);
//        list.add(24);
//        list.add(22);

//        System.out.println(list.contains(54));
//        System.out.println(list);
//        list.set(0, 54);
//
//        list.remove(2);
//        System.out.println(list);
//
        // input
        for(int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }
//
        // get item at any index
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));
        }
//
        System.out.println(list);
    }
}
