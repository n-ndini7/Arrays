package com.java.medium;

public class Solution {
	/*
	Given an array of integers. Find the Inversion Count in the array. 
	Inversion Count: For an array, inversion count indicates how far (or close) 
	the array is from being sorted. If array is already sorted then the inversion count is 0. 
	If an array is sorted in the reverse order then the inversion count is the maximum. 
	Formally, two elements a[i] and a[j] form an inversion if a[i] > a[j] and i < j.
	*/
	
	static long inversionCount(long arr[], long N)
    {
        // Your Code Here
        long[] temp = new long[(int)N];
        long c = sort(arr,temp,0,(int)N-1);
        return c;
    }
    static long merge(long[] arr, long[] temp, int l , int mid,int r){
        int i=l, j =mid, k=l;
        long c=0;
        while(i<=mid-1&&j<=r){
             if(arr[i]<=arr[j]){
                 temp[k++]=arr[i++];
             } else{
                 temp[k++]=arr[j++];
                 c+=(mid-i);
             }
        }
        while(i<=mid-1){
            temp[k++]=arr[i++];
        }
        while(j<=r){
            temp[k++]=arr[j++];
        }
        for(int p =l;p<=r;p++){
            arr[p]=temp[p];
        }
        return c;
    }
    static long sort(long[] arr, long[] temp, int l, int r){
        long c= 0;
        int mid=0;
        if(l<r){
            mid = (l+r)>>1;
            c+= sort(arr,temp,l,mid);
            c+= sort(arr,temp,mid+1,r);
            c+=merge(arr,temp,l,mid+1,r);
        }
        return c;
    }
}
