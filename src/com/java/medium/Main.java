package com.java.medium;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main (String[] args) throws IOException
	 {
	 
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
       int t = Integer.parseInt(br.readLine()); 

       while(t-- > 0){
           int size = Integer.parseInt(br.readLine());
           String[] arrStr = ((String)br.readLine()).split("\\s+");
           int[] arr= new int[size];
           for(int i = 0;i<size;i++){
               arr[i] = Integer.parseInt(arrStr[i]);
           }
           System.out.println(new Solution().minJumps(arr));
       }
	 }
}
