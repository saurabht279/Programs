package com.java.array;

import java.util.HashSet;

public class DistinctElementList {
    public static void main(String[] args) {
        int arr[]={1,5,6,7,8,5,7};
        findDistinct(arr);
    }

    private static void findDistinct(int[] arr) {
        HashSet set=new HashSet();
        for(int elem:arr)
        {
            set.add(elem);
        }
        System.out.println(set);

    }
}
