package com.InfosysQuestions;
/*separating positive and negative numbers in an array*/
public class sortingarray {
	public static void main(String[] args) {
				int[] array = {3,-1,-2,2,2,3,2,-6,2,3,-8,0,2};
				printArray(array);
				array = sortArray(array);
				printArray(array);
			}
			
			private static int[] sortArray(int[] array) {
				int location =0;
				for (int i = 0; i < array.length; i++) {
					if(array[i]>=0) {
						if(i!=location) {
							for (int j = i; j > location; j--) {
								int temp = array[j];
								array[j] = array[j-1];
								array[j-1]= temp;
							}
						}
						location++;
					}
					
				}
				return array;
			}

			private static int[] sortArray2(int[] array) {
				int location =0;
				for (int i = 0; i < array.length; i++) {
					if(array[i]>=0) {
						if(i!=location) {
							for (int j = i; j > location; j--) {
								int temp = array[j];
								array[j] = array[j-1];
								array[j-1]= temp;
							}
						}
						location++;
					}
					
				}
				return array;
			}
			
			private static void printArray(int[] array) {
				for (int i = 0; i < array.length; i++) {
					System.out.print(array[i]+" ");
				}
				System.out.println("");
			}

	}

