package com.java.medium;

public class Solution {
	/*
	 * Given an array Arr[] of N integers. Find the
	 *  contiguous sub-array(containing at least one number) 
	 *  which has the maximum sum and return its sum.	 */
	
	// KANDANE's Algorithm
	// arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int arr[], int n){
        // Using Kandane's algorithm
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i =0;i<n;i++){
            sum+=arr[i];
            if(max<sum)max=sum;
            if(sum<0) sum=0;
        }
        if(max==0) max=-1;
        return max;
    }
}
