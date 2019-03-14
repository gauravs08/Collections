package com.InfosysQuestions;

import java.lang.Character.Subset;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Find all the subset of an array, having integers from 1 to 9, such that sum of each subset is 10.
 *
 */
public class SubsetSum {
	public static void main(String [] args) {
		int[] arr = {11,16,11,9,7,13,5,3,1,14} ;
		int sum = 10;
		SubsetSum ss = new SubsetSum(arr, sum);
		List<List<Integer>> result = ss.find();
		System.out.println(result);
	}
	
	public SubsetSum(int[] arr, int sum) {
		super();
		this.arr = arr;
		this.baseSum = sum;
	}
	
	
	
	public List<List<Integer>> find(){
		
		List<List<Integer>> allSubsets = new ArrayList<List<Integer>>();
		
		for( int i =0; i < arr.length; i++ ){
			
			int value = arr[i];
			
			if( value > 0 && value < 10 ){
			
				List<List<Integer>> subsetTails = getSubsets( baseSum - value, i+1 );
					
				for(List<Integer> tail : subsetTails ){
						
					List<Integer> singleSubset = new ArrayList<Integer>();
					singleSubset.add( value );
					singleSubset.addAll( tail );
						
					if( isBaseSumSatisfied( singleSubset ) ){
						allSubsets.add(singleSubset);
					}
				}
			}
		}
		
		return allSubsets;
	}
		
	
	//==== PRIVATE =====
	
	private final int[] arr;
	private final int baseSum;
	
	private List<List<Integer>> getSubsets( int sum, int offset ){
		
		if( sum <= 0 || offset >= arr.length){
			return new ArrayList<List<Integer>>();
		}
				
		List<List<Integer>> subsets = new ArrayList<List<Integer>>();		
		
		
		for( int i = offset; i < arr.length; i++ ){
			
			if( arr[i] > 0 && arr[i] < 10 ){
				
				List<List<Integer>> posibleTails = getSubsets(sum - arr[i], i+1);
				
				if( posibleTails.isEmpty() ){
					List<Integer> singleSubset = new ArrayList<Integer>();
					singleSubset.add( arr[i] );					
					subsets.add(singleSubset);
				}
				else {				
					for( List<Integer> tail : posibleTails ){
						List<Integer> singleSubset = new ArrayList<Integer>();
						singleSubset.add( arr[i] );
						singleSubset.addAll(tail);
						
						subsets.add(singleSubset);
					}
				}
			}
		}
		return subsets;
	}


	private boolean isBaseSumSatisfied(List<Integer> singleSubset ){
		
		int actualSum = 0;
		
		for(int value : singleSubset ){
			actualSum += value;
		}
		return baseSum == actualSum;
	}

}