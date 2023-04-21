package com.java.array;

import java.util.Arrays;

public class ArrayReverse {
    public static void main(String[] args) {
        int arr[]={1,2,3,6,7,8,9};

        reverseArray(arr);
    }

    private static void reverseArray(int[] arr) {
        int left = 0,right= arr.length-1;
        while(left<right)
        {
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;right--;

        }

        System.out.println(Arrays.toString(arr));
    }
}
