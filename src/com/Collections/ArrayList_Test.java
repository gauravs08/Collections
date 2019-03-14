package com.Collections;
import java.util.*;
public class ArrayList_Test {
   // Statics
   public static void main( String [] args ) {
      System.out.println( "List Test" );
       String [] toys = { "Shoe", "Ball", "Frisbee" };
      // Create a collection
      ArrayList arrlist = new ArrayList(toys);
      // Adding
     
      //list.addAll( Arrays.toList( toys ) );
      // Sizing
      System.out.println( "arrlist created" +
        ", size=" + arrlist.size() +
        ", isEmpty=" + arrlist.isEmpty() );
 
      // Iteration using indexes.
      System.out.println( "arrlist iteration (unsorted):" );
      for ( int i = 0; i < arrlist.size(); i++ )
         System.out.println( "   " + arrlist.get( i ) );
      
      // Reverse Iteration using ListIterator
      System.out.println( "arrlist iteration (reverse):" );
      ListIterator iterator = arrlist.listIterator( arrlist.size() );
      while ( iterator.hasPrevious() ) {
         System.out.println( "   " + iterator.previous() );
         
      }
         // Removing
      
    //  arrlist.remove( 1 );
      //arrlist.clear();
      Collections.shuffle(arrlist, new Random());
      System.out.println(arrlist.get(1).hashCode());
      
   }
}