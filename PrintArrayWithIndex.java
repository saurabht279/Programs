package com.java.array;

public class PrintArrayWithIndex {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        printArrayWithIndex(arr);
    }

    private static void printArrayWithIndex(int[] arr) {
        for(int element:arr)
        {
            System.out.println(element);
        }
    }
}
