package com.java.array;

import java.util.Arrays;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,5};
        int arr2[]={5,6,7,8,9};
        mergeSortedArray(arr1,arr2);
    }

    private static void mergeSortedArray(int[] arr1, int[] arr2) {
        int arr3[]=new int[arr1.length+arr2.length];
        int arr1Pointer=0;
        int arr2Pointer=0;
        int i=0;
        int j=0;
        int k=0;
        while(i<arr1.length&&j<arr2.length)
        {
            if(arr1[i]<arr2[i])
            {
               arr3[k]=arr1[i];
               i++;k++;
            }
           else {
               arr3[k]=arr2[j];
               k++;
               j++;
            }
        }

        while(i<arr1.length)
        {
            arr3[k]=arr1[i];k++;i++;
        }
        while(j<arr2.length)
        {
            arr3[k]=arr2[j];k++;j++;
        }
        System.out.println(Arrays.toString(arr3));
    }
}
