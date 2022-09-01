package com.sonam;

public class Max {
    public static void main(String[] args) {
        int[] arr = {1, 300, 6, 9, 54, 7, 200};
        System.out.println(maxRange(arr, 2, 6 ));

    }

    //imagine that array is not empty
    static int max(int[] arr) {
        if (arr.length == 0) {
            return -1; //work on edge cases here, like array being null
        }
        int maxVal = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }

        //max in range
        static int maxRange ( int[] arr, int start, int end){
            if (end < start) {
                return -1;//work on edge cases here, like array being null
            }
            if (arr == null) {
                return -1; //work on edge cases here, like array being null
            }
            int maxVal = arr[start];
            for (int i = start; i <= end; i++) {
                if (arr[i] > maxVal) {
                    maxVal = arr[i];
                }
            }
            return maxVal;
        }


}