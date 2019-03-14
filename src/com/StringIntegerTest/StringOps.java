package com.StringIntegerTest;

public class StringOps {

	/**
	 * INFO: String obj is immutable means its value cannot change ,only thing that changes is reference
	 * 1 -> String s points to " Hello " 
	 * 
	 * 2 ->  Since s is String obj (immutable) in 2 line s give away reference from " Hello " and now it is pointing to " Hello World"
	 * 		 " Hello " is free for GC as there is no reference
	 * 
	 * 3 ->  s.trim() is tricky it will create a new obj of "Hello World" but no one is pointing to it .because its not s =s.trim();
	 * 
	 * as you see there are  3 obj[" Hello "," Hello World ","Hello World"] created in first 3 lines and till 3 line String is pointing to 2nd obj " Hello World "
	 * this create lot of performance issue. beter to use StringBuilder or StringBuffer 
	 */
	public static void main(String[] args) {
		
		System.out.println(" =============Immutable vs Mutable String ===============");
		String s = " Hello "; //1    s->" Hello "
		s += " World ";		  //2	 s->" Hello World "      FOR GC :: " Hello "
		s.trim( );			  //3	 s->" Hello World "		 FOR GC :: " Hello World " ," Hello "
		System.out.println(s);//4  o/p:" Hello World "
		s = s.trim();		  //5	
		System.out.println(s);//6  o/p:"Hello World"
		
		
		// Optimising above code
		StringBuilder sb = new StringBuilder(" Gaurav ");
		sb.append(" Sharma ");
		System.out.println(sb.toString().trim( ));
		
		System.out.println(""+s.concat(sb.toString()));
		/*
		 * The StringBuilder is not a thread-safe class. It is fine when you are
		 * using it as a local variable. If you want to use it as an instance
		 * variable then use the StringBuffer class which is thread-safe. If you
		 * are curious to know what happens under the covers during String
		 * manipulation -- String concatenation
		 */
		System.out.println(" ============= 2) correct below code===============");

		System.out.println("abc".hashCode() +" b hascode()"+"bca".hashCode());
		
		
		String a ="world";
		String b ="w";
		String c ="world";
		
		b+="orld";

		
		System.out.println(a.equals(b));
		System.out.println(a == b);
		System.out.println(a == c);	
		
		String a2 =a;
		System.out.println(a == a2);

		String d= b.concat("orld");
		
		System.out.println(a == d);
	}

}
