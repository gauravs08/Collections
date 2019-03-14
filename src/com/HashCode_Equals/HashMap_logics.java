package com.HashCode_Equals;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class HashMap_logics {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		HashMap<String, String> pHMapString = new HashMap<String, String>();
		pHMapString.put("ONE","1");
		pHMapString.put("TWO","2");
		pHMapString.put("THREE", null);
		pHMapString.put(null, null);  //HashMap allow us to set key and value both as null ,no run time error 
		String pPrintHM = pHMapString.get(null);
		
		System.out.println("Value of Two is:: " + pPrintHM);
		
		Integer a= 127; 
		Integer b= 127;
/*		String a ="ab";
		String b ="ab";*/
		boolean bol = a==b;
		System.out.println("-----HashCode ------");
		System.out.println("a.hashCode()= "+a.hashCode());
		System.out.println("b.hashCode()= "+b.hashCode());
		System.out.println("a.equals(b) = "+a.equals(b));
		System.out.println("a==b  = "+(a==b));  //return true if a,b are below 128 else return false.
		System.out.println("a==b  = "+(a.intValue()==b.intValue())); //return true even though value is >=128
		
		
		//setting  an integer hashmap to same hashcode and key as a,b=129
		HashMap<Integer, Integer> pHMInteger= new HashMap<Integer,Integer>();
		pHMInteger.put(a, 129);
		pHMInteger.put(b, 130);
		
		System.out.println("pHMInteger.get(a) = "+pHMInteger.get(a));
		System.out.println("pHMInteger.get(b) = "+pHMInteger.get(b));
		
		System.out.println("-----ConcurrentHashMap ------");
		ConcurrentHashMap<String, String> pConcHM = new ConcurrentHashMap<String, String>();
		pConcHM.put("ConcA", "97");
		pConcHM.put("ConcB", "98");
		pConcHM.put("ConcC", "99");
	
		//below no compile time error but Run time error NullPointerException
		/*pConcHM.put("ConcC", null);
		pConcHM.put(null, null);*/

		System.out.println(pConcHM.get("ConcC"));
		
	}

}
