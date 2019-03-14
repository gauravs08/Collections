package com.capgeminiQ;



public class DijkstraAlgorithm {

	
	public static void main(String[] args) {

		String[] input1 = {"A","B","C","D","E"};
		int[] input2 = {2,2,4,1,3,2,3,3,5,1};//{2,1,3,2,4,3};////{2,3,1,5,4,3};
		System.out.println((minimum_cost(input1, input2)));
	}

	private static int minimum_cost(String[] input1, int[] input2) {
		
		int cost = 0;
		int lennode = input1.length;
		int x = 0;
		
		int result = findcorrectfeed(lennode-1);
		if(result != input2.length)
		{
			return 0;
		}
		int[][] crossnode = new int[lennode-1][lennode];
		
		
		
		for (int i = 0; i < lennode - 1; i++) {
			for(int j = i ; j < lennode -1 ;j++) {
				if(i<=j) {
				crossnode[j][i] = input2[x++];
				}
			}
		}
		
		for(int i =0 ; i<lennode-1 ; i++) {
			int minDist = Integer.MAX_VALUE;
			for(int j = i ; j < lennode -1 ;j++) {
				if(i<=j) {
					if(crossnode[j][i] <minDist ) {
						minDist = crossnode[j][i];
					}
				}
			}
			cost += minDist;
		}
		
		
		
		return cost;
	}

	private static int findcorrectfeed(int lennode) {
		if(lennode == 0) {
			return 0;
		}
		
		return lennode + findcorrectfeed(lennode-1);
	}
}