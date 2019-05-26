package com.Collections;

import java.util.Enumeration;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {

	public static void main(String agrs[]) {

		String str[] = { "japan",
	            "usa",
	            "japan",
	            "russia",
	            "usa",
	            "japan",
	            "japan",
	            "australia"};
	    int len = 8;
	    //No Order
	    ConcurrentHashMap<Integer, String> cHmap = new ConcurrentHashMap<Integer, String>();
	    for( int i =0 ; i< 8;i++){
	    cHmap.putIfAbsent(i, str[i]);
	    cHmap.put(i, str[i]);
	}
	
	 Enumeration k = cHmap.keys();

	    while (k.hasMoreElements()) {
	        Integer key = (Integer) k.nextElement();
	        System.out.println(key + " > " + cHmap.get(key));
	    }

}
}
