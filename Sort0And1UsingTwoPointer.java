package com.java.array;

import java.util.Arrays;

public class Sort0And1UsingTwoPointer {
    public static void main(String[] args) {
        int arr[]={0,1,1,1,0,0,0,0,1,1};
        sortZeroAndOnePointer(arr);
    }

    private static void sortZeroAndOnePointer(int[] arr)
    {
    int left=0;
    int right=arr.length-1;
    while(left<right)
    {

        if(arr[left]==1)
        {
            arr[right] = arr[right] + arr[left];
            arr[left] = arr[right] - arr[left];
            arr[right] = arr[right] - arr[left];
            right--;
        }
        else {
            left++;
        }


    }
        System.out.println(Arrays.toString(arr));
    }
}
