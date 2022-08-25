package com.java.medium;

import java.util.Arrays;

public class Solution {
	/*
	 * Given an array arr[] denoting heights of N towers and a positive integer K,
	 *  you have to modify the height of each tower either by increasing or decreasing them by K only once.
Find out what could be the possible minimum difference of the height of shortest and longest towers after 
you have modified each tower.
	*/
	
	int getMinDiff(int[] arr, int n, int k) {
        // code here
        Arrays.sort(arr);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int diff = arr[n-1]-arr[0];
        for(int i=1;i<n;i++){
            max=Math.max(arr[i-1]+k,arr[n-1]-k);
            min = Math.min(arr[0]+k,arr[i]-k);
            diff=Math.min(diff,max-min);
        }
        return diff;
        
    }
}
