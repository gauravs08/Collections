package com.Collections;

import java.util.Arrays;

//import java.lang.reflect.Array;

public class Array_1 {

	public static void main(String args[])
	{
		class Car{}; // minimal dummy class
		Car[] cars1; // null reference
		Car[] cars2 = new Car[10]; // null references
		
		for (int i = 0; i < cars2.length; i++)
			cars2[i] = new Car();
		// Aggregated initialization
		Car[] cars3 = {new Car(), new Car(), new Car(), new Car()};
	//	cars1 = {new Car(), new Car(), new Car()};
		
		//Array sorting
		int[] arr = {  7,  2,  8, 10 ,30,12,23,1,4,6,2,8,10};
		Arrays.sort(arr);

		System.out.println("Sorted Array arr[]" + Arrays.toString(arr));
		
		//valid Array declaration
		int arr2[][] = new int[5][5];
		 int[]arr3[] = new int[5][5];
		// int[] arr4 = new int[5][];
		 //int[] arr5 = new int[][5];
		 //int[][] arr6 = new int[][5]; // Cannot specify an array dimension after an empty dimension
		 int[][] arr7 = new int[6][]; // have to specify dimension from left to right cant skip or keep a dimension empty and jump to next
		 
		 
	}
}
