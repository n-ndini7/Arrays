package com.java.medium;

public class Solution {
	/*
	Given a string s, return the longest palindromic substring in s.
	*/
	// using tabulation approach
	 public String longestPalindrome(String s) {
	        int n = s.length();
	        int maxLen=1;
	        boolean[][] tbl = new boolean[n][n];
	        for(int i=0;i<n;i++)
	            tbl[i][i]=true;
	        
	        // case length ==1
	        if(n==1)return s;
	        //case length==2;
	        int start=0;
	        for(int i =0;i<n-1;i++){
	            if(s.charAt(i)==s.charAt(i+1)){
	                tbl[i][i+1]=true;
	                start=i;
	                maxLen=2;
	            }
	        }
	        
	        //case length >2
	        for(int k=3;k<=n;k++){
	            for(int i =0;i<n-k+1;i++){
	                int j=i+k-1;
	                if(tbl[i+1][j-1]&&s.charAt(i)==s.charAt(j))
	                {
	                    tbl[i][j]=true;
	                    if(k>maxLen){
	                        start=i;
	                        maxLen=k;
	                    }
	                }
	            }
	        }
	        return s.substring(start,start+maxLen);
	    }
}
