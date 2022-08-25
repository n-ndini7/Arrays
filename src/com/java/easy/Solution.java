package com.java.easy;

import java.util.ArrayList;
import java.util.TreeSet;


/*Given an array of size N-1 such that it only contains distinct 
 * integers in the range of 1 to N. Find the missing element.
 */

public class Solution {

	 int MissingNumber(int array[], int n) {
	        // Your Code Here
	        // Using hashing
	        int[] hsh = new int[n+1];
	        for(int i =0;i<n-1;i++) 
	            {hsh[array[i]-1]++;}
	        for(int i=0;i<hsh.length;i++){
	            if(hsh[i]==0) return i+1;
	        }
	        return -1;
	    }
	
}
