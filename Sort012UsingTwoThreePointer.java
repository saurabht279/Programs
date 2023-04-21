package com.java.array;

import java.util.Arrays;

public class Sort012UsingTwoThreePointer {
    public static void main(String[] args) {
        int arr[]={0,0,1,2,1,0,1,2,0,1,2,0,1};
        sort012(arr);
    }

    private static void sort012(int[] arr) {

        int left=0;
        int mid=0;
        int high= arr.length-1;

        while(mid<=high)
        {
            if(arr[mid]==0)
            {
              arr[mid]=arr[mid]+arr[left];
              arr[left]=arr[mid]-arr[left];
              arr[mid]=arr[mid]-arr[left];
              left++;
              mid++;


            }
            else if(arr[mid]==1)
            {
                mid++;
            }
            else if (arr[mid]==2)
            {
                int temp=arr[high];
                arr[high]=arr[mid];
                arr[mid]=temp;
                /*arr[high]=arr[high]+arr[mid];
                arr[mid]=arr[high]-arr[mid];
                arr[high]=arr[high]-arr[mid];*/
                high--;
            }
        }

        System.out.println(Arrays.toString(arr));

    }
}
