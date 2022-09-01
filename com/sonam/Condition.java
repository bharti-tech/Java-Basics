package com.sonam1;

public class Condition {
    public static void main(String[] args) {
//        System.out.println("Hello World!");
        /*
            Syntax of if statements:
            if(boolean expression T or F){
               //body
            } else {
            // do this
            }
         */
        int salary =25400;
//        if (salary >10000){
//            salary = salary + 2000;
//        } else{
//            salary = salary + 1000;
//        }

        //Multiple if-else statements
        if (salary>10_000 && salary<20000 ) {
            salary += 2000; //salary = salary + 2000
        } else if (salary > 20_000) {
            salary+=3000;
        } else{
            salary+=1000;
        }



        System.out.println(salary);


    }
}
