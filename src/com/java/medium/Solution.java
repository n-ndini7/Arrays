package com.java.medium;

import java.util.Arrays;
import java.util.HashMap;

public class Solution {
	/*
	 Given an array A of N elements. Find the majority element in the array.
	  A majority element in an array A of size N is an element that appears more than N/2 times in the array.
	*/
	
	static int majorityElement(int a[], int size)
    {
        // your code here
        HashMap<Integer,Integer> hsh = new HashMap<>();
        for(int i=0;i<size;i++){
            hsh.put(a[i],hsh.getOrDefault(a[i],0)+1);
            if(hsh.get(a[i])>(size/2)) return a[i];
        } 
        return -1;
    }
}
