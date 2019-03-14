package com.capgeminiQ;

public class ChocolateFactory {

	
	public static void main(String[] args) {
		
		int total = chocolates( 1, 2, 3, 4);
		System.out.println(total);

	}
	
	public static int chocolates(int input1,int input2,int input3,int input4)
    {
		int total =0;
		if(input1==0 || input2==0 || input3 == 0||input4==0) {
			return 0;
		}
		int[][] combiXX = new int[4][2]; ;
	
				combiXX[0][0] = input1;
				combiXX[0][1] = input3;  //1X3  
				
				combiXX[1][0] = input1;
				combiXX[1][1] = input4;  //1X4
				
				combiXX[2][0] = input2;
				combiXX[2][1] = input3;  //2X3  
				
				combiXX[3][0] = input2;
				combiXX[3][1] = input4;  //2X4
		int index = 0;
		for(int[] len:combiXX) {
			int small;
			while (len[0] != len[1]) {
				if (len[0] > len[1]) {
					small = len[1];
					combiXX[index][0] -= small;
				} else {
					small = len[0];
					combiXX[index][1] -= small;
				}
				total++;
			}
			total++;
			index++;
			
			
			
		}
				
		return total;
		
		
    }

}
