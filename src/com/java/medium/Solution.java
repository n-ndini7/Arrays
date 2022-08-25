package com.java.medium;

public class Solution {
	/*
	 * Given an array of N integers arr[] where each element represents the max length of the
	 *  jump that can be made forward from that element. Find the minimum number of jumps to reach 
	 *  the end of the array (starting from the first element). If an element is 0,
	 *   then you cannot move through that element.

Note: Return -1 if you can't reach the end of the array.
	 */
	 static int minJumps(int[] arr){
	        // your code here
	        int jump=0;
	        int chk = 0;
	        int count=0;
	        if(arr.length==1) return 0;
	        if(arr[0]==0) return -1;
	        for(int i=0;i<arr.length;i++){
	            chk=Math.max(arr[i]+i,chk);
	            if(i==jump){
	                jump=chk;
	                count++;
	                if(chk>=arr.length-1) return count;
	                if(arr[i]==0) return -1;
	            }
	        }
	        return count;
	    }
}
