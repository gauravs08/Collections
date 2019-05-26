package com.Collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet_Test {
   // Statics
   public static void main( String [] args ) {
      System.out.println( "------------HashSet Test------------" );
      // Create a collection
      HashSet<String> hs = new HashSet<String>();
      // Adding
      String dog1 = "Max", dog2 = "Bailey", dog3 = "Harriet" , dog4 = null;
      hs.add( dog1 );
      hs.add( dog2 );
      hs.add( dog3 );
      hs.add( dog4 );
      hs.add(null);
      hs.add(null);
      // Sizing
      System.out.println( "HashSet [No Duplicates][null allow]::" + hs);
      System.out.println( "HashSet created" +
        ", size=" + hs.size() +
        ", isEmpty=" + hs.isEmpty() );
      
      // Containment
      System.out.println( "HashSet contains " + dog3 +": " + hs.contains( dog3 ) );
      // Iteration. Iterator supports hasNext, next, remove
      System.out.println( "HashSet iteration (unsorted):" );
      Iterator iterator = hs.iterator();
      while ( iterator.hasNext() )
         System.out.println( "   " + iterator.next() );
      // Removing
      hs.remove( dog1 );
      hs.clear();
   }
}