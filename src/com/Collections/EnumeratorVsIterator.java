package com.Collections;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;
/*INFO:: Enumerator Vs Iterator
 * Enumeration
	hasMoreElement()
	nextElement()
	N/A
	Un-Sync

	Iterator
		hasNext()
		next()
		remove()
		Thread-Safe 
		
So Enumeration is used when ever we want to make Collection objects as Read-only.
Also Iterator is more secure and safe as compared to Enumeration because
 it  does not allow other thread to modify the collection object
  while some thread is iterating over it and throws ConcurrentModificationException.
 * */
public class EnumeratorVsIterator {
	 public static void main(String[] args){
	        Vector v=new Vector();
	        Object element;
	        Enumeration<Integer> enumeration;
	        Iterator iter;
	        long start;
	        double itTime,enumTime;
	        
	        for(int i=0; i<1000000; i++){
	            v.add("New Element");
	        }
	        enumeration=v.elements();
	        iter=v.iterator();
	        
	        
	        //*****CODE BLOCK FOR ITERATOR**********************
	        System.gc();
	        start=System.currentTimeMillis();
	        while(iter.hasNext()){
	            element=iter.next();
	        }
	        itTime = System.currentTimeMillis()-start;
	        System.out.println("Iterator took " +itTime);
	        //*************END OF ITERATOR BLOCK************************
	        
	        
	        System.gc();   //request to GC to free up some memory 
	        
	        
	        //*************CODE BLOCK FOR ENUMERATION*******************        
	        start=System.currentTimeMillis();
	        while(enumeration.hasMoreElements()){
	            element=enumeration.nextElement();
	        }
	        enumTime = System.currentTimeMillis()-start;
	        System.out.println("Enumeration took " +enumTime);   
	        //************END OF ENUMERATION BLOCK**********************           
	        
	        System.out.println("Performance  :: " + (enumTime/itTime)*100 +"%");
	    }
}
