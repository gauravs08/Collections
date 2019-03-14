package com.equalsComparision;

public class Test {

	public static void main(String[] args) {
		// 1)----Boolean.valueof(str)
		System.out.println("3)-----Boolean.valueof(str)");
		String str = "True";
		System.out.println(Boolean.valueOf(str));// The Boolean returned
													// represents a true value
													// if the string argument is
													// not null and is equal,
													// ignoring case,to the
													// string "true".

		// 2)----byte(0-127) vs int i==b and i.equal(b)
		System.out.println("3)-----byte(0-127) vs int i==b and i.equal(b)");
		int i = 10;
		byte b = 10;
		int j = 10;
		System.out.println(i == b); // return true
		//System.out.println(i.equal(b)); //Compile time error
		byte b1 = 127;
		// byte b2 =128; // cannot hold more then 127value error require integer
		
		
	
		
		char c = 'a';
		System.out.println("c==97 -->>"+(c==97));
		//System.out.println(c.equals(97));  //compile time error //Cannot invoke equals(int) on the primitive type char
		System.out.println("========================================================== ");
		System.out.println("Comparing Integer with Integer range -128 to 127 ");
		// Integer behaves same as int if range is smaller then 127 
		// but if range is greater then 127 it will return false if compared with == or Integer.valueOf(i)==Integer.valueOf(i) 
		// this happen because of autoboxing and un-boxing
		//ii.intValue :: gives int value
		//Integer.valueOf(int) :: covert int to Integer
		Integer ii = 128;
		Integer ib = 128;
		System.out.println("Integer ii ::"+ii +" & Integer.valueOf(ii) ::"+Integer.valueOf(ii));
		System.out.println("Integer ib ::"+ib +" & Integer.valueOf(ib) ::"+Integer.valueOf(ib));
		System.out.println("ii.intValue() is::"+(ii.intValue()));
		System.out.println("ii==ib is::"+(ii==ib));
		System.out.println("Integer.valueOf(ii)==Integer.valueOf(ib) is::"+(Integer.valueOf(ii)==Integer.valueOf(ib)));
		System.out.println("ii.equals(ib) is::"+(ii.equals(ib)));
		System.out.println("ii.intValue()==ib.intValue() is::"+(ii.intValue()==ib.intValue()));
		System.out.println("ii.equals(ib.intValue()) is::"+(ii.equals(ib.intValue())));
		
		System.out.println("========================================================== ");
		
		Integer in = new Integer(10);
		Integer jn = new Integer(10);
		Integer in2 = 10;
		
		
		//System.out.println("i.equals(j) -->>"+(i.equals(j))); //error - since i is primitive type so cannot invoke equals() on int
		System.out.println("in.equals(j) -->>"+(in.equals(j)));
		
		System.out.println("i==in -->>" + (i==in));
		System.out.println("in2.equals(in) -->>" + (in2.equals(in))); 
		//System.out.println("i.equals(in) -->>" + (i.equals(in))); //complie time error int & Integer both are diff
		System.out.println("in==jn -->>" + (in == jn));   //returns false
		System.out.println("in.equals(jn) -->>" + in.equals(jn)); //returns true

		// 3)---- breaking for nested for loop
		System.out.println("3)-----breaking for nested for loop");
		outerloop: for (int k = 0; k < 3; k++) {
			for (int l = 0; l < 3; l++) {
				if (k * l > 4) {
					System.out.println("Breaking");
					break outerloop;
				}
				System.out.println(k + " " + l);
			}
		}
		System.out.println("Done");
	}

}
