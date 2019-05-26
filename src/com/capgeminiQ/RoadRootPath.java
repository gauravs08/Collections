package com.capgeminiQ;

/*
 * to find out how many roads need to destroy between 2 cities to disconnect 2 base cities (base will be min and max number in the string)
S * */
public class RoadRootPath {

	public static void main(String[] args) {

		String[] inp = {"1#2","4#3"};
		int minroad = min_roads(inp);
		System.out.println("Min Road to be destroyed to disconnect both cities is : " +minroad);
	}

	
	
	public static int min_roads(String[] input1)
    {
		int length = input1.length;
	
		int baseMin = Integer.parseInt(input1[0].split("#")[0]);
		int baseMax = 0;
		int BaseMinLen = 0,BaseMaxLen = 0;
		
		Integer[][] roadMap = new Integer[length][length]; 
		//finding max and min base station in the input string
		for (int i = 0; i < length; i++) {
			
			String[] e = input1[i].split("#");
			int e1 = Integer.parseInt(e[0]);
			int e2 = Integer.parseInt(e[1]);
			
			if (e1 < baseMin) {	baseMin = e1; 	}
			if (e1 > baseMax) { baseMax = e1;	}

			if (e2 > baseMax) { baseMax = e2; 	}
			if (e2 < baseMin) { baseMin = e2; 	}
			
		
			if(length <baseMax)
			{//roadMap = Arrays.copyOf(roadMap, baseMax);
				Integer[][] roadMap2 = new Integer[baseMax][baseMax];
				System.arraycopy(roadMap, 0, roadMap2, 0, baseMax);
				roadMap =roadMap2;
			}
			
			findplaceinRoadMap(roadMap, e1,e2,length);
			findplaceinRoadMap(roadMap, e2,e1,length);
			

			
		}
		
		
		for(int i=0;i<length ;i++) {
			 if(roadMap[i][0] == baseMin) {
				 int p=1;
				 while(roadMap[i][p++] !=0)
				 BaseMinLen++;
			 }
			 if(roadMap[i][0] == baseMax) {
				 int p=1;
				 while(roadMap[i][p++] !=0)
				 BaseMaxLen++;
			 }
		}
		/*System.out.println(BaseMaxLen + "," + BaseMinLen);*/
		if(BaseMaxLen >BaseMinLen) return BaseMinLen;
		
		return BaseMaxLen;

    }



	private static void findplaceinRoadMap(Integer[][] roadMap, int e1, int e2,
			int len) {

		int k = 0;
		boolean found = false;
		while ( roadMap[k][0] != null) {
			if (roadMap[k][0] == e1) {
				found = true;
				break;
			}
			k++;
		}
		if (found == false) {
			roadMap[k][0] = e1;
		}

		for (int i = 0; i < len; i++) {
			int j = 1;
			if ((roadMap[i][0]) == e1) {
				while (j < len) {
					if (roadMap[i][j] == null) {
						roadMap[i][j] = e2;
						return;
					}
					j++;
				}
			}

		}
	}
}
