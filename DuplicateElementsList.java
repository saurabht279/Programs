package com.java.array;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElementsList {
    public static void main(String[] args) {
        int arr[]={1,5,8,9,3,4,6,7,5};
        printDuplicateElements(arr);
    }

    private static void printDuplicateElements(int[] arr) {
       Set<Integer> set=new HashSet<>();
        for(int elem:arr)
        {
        if(set.add(elem))
        {
            //set.add(elem);
        }
        else
        {
            System.out.println(elem);
        }
        }
        System.out.println(set);
    }
}
