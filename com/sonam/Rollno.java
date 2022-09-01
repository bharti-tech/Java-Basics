package com.sonam;

public class Rollno {
    public static void main(String[] args) {
        //Q: Store a Roll no.
        int a = 19;

        //Q: store a person's name
        String name = "Sonam Bharti";

        //Q: store 5 roll numbers
        int rno1 =23;
        int rno2 =45;
        int rno3 =11;

        //syntax
        //datatype[] variable_name = new datatype[size];
        //store 5 roll no:
//        int[] rnos = new int[5];
//        //or directly
//        int[] rnos2 = {23,45,65,33,22};

        int[] ros; //declaration of array. ros is getting defined in the stack
        ros = new int[5]; // initialisation: actually here object is being created in the memory (heap)

//        System.out.println(ros[1]);

        String[] arr = new String[4];
        System.out.println(arr[0]);

//        String str = null;
////        int num = null;

    }
}
