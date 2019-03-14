package com.HashCode_Equals;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class HashMap_logics {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		HashMap<String, String> hmString = new HashMap<String, String>();
		hmString.put("ONE","1");
		hmString.put("TWO","2");
		hmString.put("THREE", null);
		hmString.put(null, null);  //HashMap allow us to set key and value both as null ,no run time error 
		String hmStringPrint = hmString.get(null);
		
		System.out.println("Value of Two is:: " + hmStringPrint);
		
		Integer a= 127; 
		Integer b= 127;
/*		String a ="ab";
		String b ="ab";*/
		boolean bol = a==b;
		System.out.println("a==b "+bol);
		System.out.println("-----HashCode ------");
		System.out.println("a.hashCode()= "+a.hashCode());
		System.out.println("b.hashCode()= "+b.hashCode());
		System.out.println("a.equals(b) = "+a.equals(b));
		System.out.println("a==b  = "+(a==b));  //return true if a,b are below 128 else return false.
		System.out.println("a==b  = "+(a.intValue()==b.intValue())); //return true even though value is >=128
		
		
		//setting  an integer hashmap to same hashcode and key as a,b=129
		HashMap<Integer, Integer> pHMInteger= new HashMap<Integer,Integer>();
		pHMInteger.put(a, 129);
		pHMInteger.put(b, 130);  // since a,b both are same location so b will override the a value.
		
		System.out.println("pHMInteger.get(a) = "+pHMInteger.get(a));
		System.out.println("pHMInteger.get(b) = "+pHMInteger.get(b));
		
		System.out.println("-----ConcurrentHashMap ------");
		ConcurrentHashMap<String, String> pConcHM = new ConcurrentHashMap<String, String>();
		pConcHM.put("ConcA", "97");
		pConcHM.put("ConcB", "98");
		pConcHM.put("ConcC", "99");
	
		//below code will produce NO compile time error but Run time error NullPointerException
		
		/*Reason: ConcurrentHashMap dont allow null as key or value 
		 * The main reason that nulls aren't allowed in ConcurrentMaps (ConcurrentHashMaps, ConcurrentSkipListMaps) 
		is that ambiguities that may be just barely tolerable in non-concurrent maps can't be accommodated. 
		The main one is that if map.get(key) returns null, 
		you can't detect whether the key explicitly maps to null vs the key isn't mapped. In a non-concurrent map, 
		you can check this via  map.contains(key), but in a concurrent one, the map might have changed between calls.*/
		
		//pConcHM.put("ConcC", null);
		//pConcHM.put(null, null);

		System.out.println(pConcHM.get("ConcC"));
		
	}

}
