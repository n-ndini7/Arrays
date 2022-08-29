package com.java.easy;

import java.util.ArrayList;
import java.util.Stack;

/*Given an array A of positive integers. Your task is to find the leaders
 *  in the array. An element of array is leader if it is greater than or equal
 *  to all the elements to its right side. The rightmost element is always a leader. 
 */

public class Solution {

	static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        st.push(arr[n-1]);
        for(int i=n-2;i>=0;i--){
            if(arr[i]>=st.peek()){
                st.push(arr[i]);
            }
        }
        while(st.isEmpty()==false){
            list.add(st.pop());
        }
        return list;
    }
	
}
