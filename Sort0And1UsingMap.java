package com.java.array;

import java.util.HashMap;

public class Sort0And1UsingMap {
    public static void main(String[] args) {
        int arr[]={0,1,0,0,0,1,1,1};
       int sortedArr[]=sortZeroAndOne(arr);
        for(int elem:sortedArr)
        {
            System.out.println(elem);
        }
    }

    private static int[] sortZeroAndOne(int[] arr) {
        HashMap<Integer,Integer> memo=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            if(memo.containsKey(arr[i]))
                  memo.put(arr[i],memo.get(arr[i])+1);
            else {
                memo.put(arr[i], 1);
            }
        }
        int sortedArr[]=new int[arr.length];
        for(int i=0;i<memo.get(0);i++)
        {
            sortedArr[i]=0;
        }
        for(int i= memo.get(0);i< arr.length;i++)
        {
            sortedArr[i]=1;
        }
        //System.out.println(memo);
        return sortedArr;
    }
}
