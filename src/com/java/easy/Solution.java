package com.java.easy;

import java.util.ArrayList;

public class Solution {

	static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        // Your code here
        //Arrays.sort(arr);
        ArrayList<Integer> list = new ArrayList<Integer>();
        int idx =0, sum =0;
        boolean flag = false;
        for(int i=idx;i<n;i++){
            sum+=arr[i];
            if(sum==s){
                list.add(idx+1);
                list.add(i+1);
                flag = true;
                break;
            }
            if(sum>s){
                i = idx++;
                sum=0;
            }
        }
        if(flag) return list;
        else {list.add(-1); return list;}
    }
	
}
