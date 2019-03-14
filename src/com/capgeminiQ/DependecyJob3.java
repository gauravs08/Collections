package com.capgeminiQ;


public class DependecyJob3 {

	
	public static void main(String[] args) {

		String[] jobs ={"a#b","b#c"};
		String result =construction(jobs);
		System.out.println(result);
	}

	
	
	public static String construction(String[] input1)
    {
		//String result = "No";
		int len = input1.length;
		
		char[][] relation = new char[len][2];
		char ch;int j = 0;
		for(String l : input1) {
			String[] pair = l.split("#");
			
			for(int i =0 ;i<=1;i++){
				ch = pair[i].toCharArray()[0];
				relation[j][i] = ch;
			}
			j++;
		}
		
		boolean isTransitive = false;
		/*for (char[] pair1 : relation) {
			for (char[] pair2 : relation) {
				if (pair1[0] == pair2[1]) {
					
					isTransitive = true;
					// check if pair1[0],pair2[1] is in the relation
					char[] testPair = new char[2];
					testPair[0] = pair1[0];
					testPair[1] = pair2[1];
					boolean test = false;
					for (char[] pair : relation) {
						if (testPair[0] == pair[0] && testPair[1] == pair[1]) {
							test = true;
						}
					}
					if (!test) {
						isTransitive = false;
					}
				}
			}
		}*/
		
		for (int i=0; i<relation.length;i++) {
			for (int k=i;k<relation.length;k++) {
				char[] pair1 = relation[i]; 
				char[] pair2 = relation[k]; 
				if (pair1[0] == pair2[1]) {
					
					isTransitive = true;
					
				}
			}
		}
		if (isTransitive) {
			return "No";
		}
		
		
       return "Yes";
    }
}
