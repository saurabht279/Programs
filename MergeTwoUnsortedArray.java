package com.java.array;

import java.util.Arrays;

public class MergeTwoUnsortedArray {
    public static void main(String[] args) {
        int arr1[]={1,6,3,4,5};
        int arr2[]={5,8,9,7,6};
        mergeTwoArray(arr1,arr2);

    }

    private static void mergeTwoArray(int[] arr1, int[] arr2) {
        int arr3[]=new int[arr1.length+arr2.length];
        for(int i=0;i<arr1.length;i++)
        {
            arr3[i]=arr1[i];
        }
        int count=0;
        for(int i=arr1.length;i<arr3.length;i++)
        {
            arr3[i]=arr2[count];
            count++;
        }

        System.out.println(Arrays.toString(arr3));
    }

}
