package com.java.medium;

public class Solution {
	/*
	Given a sorted array of positive integers. Your task is to rearrange  the array elements alternatively 
	i.e first element should be max value, 
	second should be min value, third should be second max, fourth should be second min and so on.
	*/
	
	public static void rearrange(long arr[], int n){
        // Your code here
        if(n==1) return;
        long[] arr1 = new long[n];
        int p=n-1, idx=1;
        for(int i =1;i<n;){
            arr1[i-1]=arr[p--];
            arr1[i]=arr[i-idx];
            i=i+2;
            idx++;
            if(n%2==1&&i>n-1){
                arr1[n-1]=arr[n/2];
                break;
            }
            
        }
        System.arraycopy(arr1,0,arr,0,n);
    }
}
