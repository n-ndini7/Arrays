package com.java.easy;

import java.util.ArrayList;
import java.util.TreeSet;


/*
 * Given an array of distinct integers.
 *  The task is to count all the triplets such that sum of two elements equals the third element.
 */

public class Solution {

	int countTriplet(int arr[], int n) {
        // code here
        int c=0;
        TreeSet<Integer> tree = new TreeSet<>();
        for(Integer i: arr){
            tree.add(i);
        }
        for(int i =0;i<n;i++){
            for(int j=0;j<i;j++){
                if(tree.contains(arr[j]+arr[i]))c++;
            }
        }
        return c;
    }
	
}
