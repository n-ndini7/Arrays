package com.java.medium;

public class Solution {
	/*
	Given an array arr[] of N non-negative integers representing the height of blocks. If width of each block is 1,
	 compute how much water can be trapped between the blocks during the rainy season. 
	*/
	
	static long trappingWater(int arr[], int n) { 
        // Your code here
        int lmax= Integer.MIN_VALUE;
        int rmax=Integer.MIN_VALUE;
        long vol =0;
        int l =0;
        int r=n-1;
        while(l<r){
            lmax=Math.max(lmax,arr[l]);
            rmax=Math.max(rmax,arr[r]);
            if(lmax<rmax){
                vol+=lmax-arr[l];
                l++;
            }
            else{
                vol+=rmax-arr[r];
                r--;
            }
        }
        return vol;
    } 
}
