package com.capgeminiQ;

import java.util.Arrays;
/* two companies A and B 
 * 
 * merge them and find the maiden of two 
 * logic 
 * 
 * ODD:	n/2 th element
 * 
 * Even:  value[n +(n+1)]/2
 * 		
 * 
 * */
public class CandidateCode {

	public static void main(String[] args) {
		
		int[] compA = {-1,2,5};//{2,7,9,12,25,27,30,15,17,19,23};
		int[] compB = {3,0,1};//{2,5,8,10,20,21,25,30,14,18,19};
		
		if(compA.length == 0 && compB.length ==0) {
			System.out.println("Invalid Company array!!");
		} else{
			System.out.println("Median is :: "+median(compA, compB));
		}
	}
	
	
	public static int medianA(int[] input1,int[] input2)
    {
		int[] totarr = new int[input1.length + input2.length];
		System.arraycopy(input1, 0, totarr, 0, input1.length);
		System.arraycopy(input2, 0, totarr, input1.length, input2.length);
		
		//System.out.println(Arrays.toString(totarr));
		Arrays.sort(totarr);
		//System.out.println("sorted array:: "+ Arrays.toString(totarr));
		
		//System.out.println("length :" +totarr.length );
		
		if(totarr.length % 2 == 0) {
			//System.out.println("even length");
			int firstEl = totarr[totarr.length/2 -1];
			//System.out.println("1st::" + firstEl);
			int secEl = totarr[(totarr.length)/2 +1  -1];
			//System.out.println("2st::" + secEl);
			
			double mid = (double)(firstEl + secEl)/2;
			//System.out.println(mid);

			return (int) Math.round(mid);
			
		} else {
			//System.out.println("odd length");
			
			int odd = (totarr.length +1)/2 -1;
			//System.out.println("element position from 0 ::" +odd);
			
			return(totarr[odd]);
		}
		
    }
	public static int median(int[] input1,int[] input2)
    {
		int[] totarr = new int[input1.length + input2.length];
		System.arraycopy(input1, 0, totarr, 0, input1.length);
		System.arraycopy(input2, 0, totarr, input1.length, input2.length);
		
		Arrays.sort(totarr);
		
		
		if(totarr.length % 2 == 0) {
			int firstEl = totarr[totarr.length/2 -1];
			int secEl = totarr[(totarr.length)/2 +1  -1];
			
			double mid = (double)(firstEl + secEl)/2;

			return (int) Math.round(mid);
			
		} else {
			int odd = (totarr.length +1)/2 -1;
			return(totarr[odd]);
		}
		
    }
}
