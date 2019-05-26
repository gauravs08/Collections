package com.equalsComparision;

public class equalsComparision {

	//.equal() --> content/objects   ;  == reference/primitive
	public static void main (String args[]){
		
		char c = 'a';
		System.out.println("c==97 -->>"+(c==97));
		//System.out.println(c.equals(97));  //compile time error //Cannot invoke equals(int) on the primitive type char
	
		Integer in = new Integer(10);
		Integer jn = new Integer(10);
		Integer in2 = 10;
		int j=10;
		int i=10;
		
		//System.out.println("i.equals(j) -->>"+(i.equals(j))); //error - since i is primitive type so cannot invoke equals() on int
		System.out.println("in.equals(j) -->>"+(in.equals(j)));
		
		System.out.println("i==in -->>" + (i==in));//true
		System.out.println("in==in2 -->>" + (in==in2));//false
		System.out.println("in2.equals(in) -->>" + (in2.equals(in))); //true
		//System.out.println("i.equals(in) -->>" + (i.equals(in))); //complie time error int & Integer both are diff
		System.out.println("in==jn -->>" + (in == jn));   //returns false
		System.out.println("in.equals(jn) -->>" + in.equals(jn)); //returns true
		
		/*INFO :: String vs StringBuffer vs StringBuilder
		 * 
		 * What is difference between String, StringBuffer and StringBuilder? When to use them?
			The main difference between the three most commonly used String classes as follows.
			•	StringBuffer and StringBuilder objects are mutable whereas String class objects are immutable.
			•	StringBuffer class implementation is synchronized while StringBuilder class is not synchronized.
			•	Concatenation operator "+" is internally implemented by Java using either StringBuffer or StringBuilder.
			Criteria to choose among String, StringBuffer and StringBuilder
			•	If the Object value will not change in a scenario use [String] Class because a String object is immutable.
			•	If the Object value can change and will only be modified from a single thread, use a [StringBuilder] because StringBuilder is unsynchronized(means faster).
			•	If the Object value may change, and can be modified by multiple threads, use a [StringBuffer] because StringBuffer is thread safe(synchronized).

		 * */
		System.out.println("------String vs StringBuffer---------");
		//String and StringBuffer
		
		String s = "flower";
		String s2 = "flower";
		String s3 = new String("flower");
		
		StringBuilder sb = new StringBuilder("flower");
		StringBuilder sb2 = new StringBuilder("flower");
		
		System.out.println("s==s2 :: "+ (s==s2)); //true
		System.out.println("s==s3 :: "+ (s==s3)); //false
		System.out.println("s.equals(s2) :: "+ (s.equals(s2)));  //true    
		
		System.out.println("sb.toString()==sb2.toString() :: "+ (sb.toString()==sb2.toString()));//false 
		System.out.println("sb.toString().equals(sb2.toString()) :: "+ (sb.toString().equals(sb2.toString()))); //true
		
		System.out.println("s==sb.toString() :: "+ (s==sb.toString())); //false
		System.out.println("s.equals(sb) :: "+ (s.equals(sb)));//false
		System.out.println("s.equals(sb.toString()) :: "+ (s.equals(sb.toString())));//true
		
		System.out.println("s==s3 :: "+ (s==s3));//false
		System.out.println("sb.toString()==s3.toString() :: "+ (sb.toString()==s3.toString()));//false
		System.out.println("s.equals(s3) :: "+ (s.equals(s3)));//true
		System.out.println("s.toString().equals(s3.toString()) :: "+ (s.toString().equals(s3.toString())));//true
		System.out.println("sb.toString().equals(s3.toString()) :: "+ (sb.toString().equals(s3.toString())));//true
		
		
		
		String str1 = new String("ABCD");
		String str2 = new String("ABCD");
		if (str1 == str2) { //FALSE
			System.out.println("String 1 == String 2 is true");
		} else {
			System.out.println("String 1 == String 2 is false");
			String Str3 = str2;
			if (str2 == Str3) { //TRUE
				System.out.println("String 2 == String 3 is true");
			} else {
				System.out.println("String 2 == String 3 is false");
			}
			if (str1.equals(str2)) {//TRUE
				System.out.println("String 1 equals string 2 is true");
			} else {
				System.out.println("String 1 equals string 2 is false");
			}
		}
	}
}
