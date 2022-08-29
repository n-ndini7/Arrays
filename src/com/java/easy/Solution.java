package com.java.easy;


/*Given an array A of n positive numbers. 
 * The task is to find the first Equilibium Point in the array. 
	Equilibrium Point in an array is a position such that the sum of elements before it
 is equal to the sum of elements after it.
 */

public class Solution {

	public static int equilibriumPoint(long arr[], int n) {

        long sum=0;
        long s2=0;
        if(n==1) return 1;
        for(int i=0;i<n;i++)sum+=arr[i];
        for(int i =0;i<n;i++){
            s2+=arr[i];
            if(s2-arr[i]==sum-s2) return i+1;
        }
        return -1;
    }
	
}
