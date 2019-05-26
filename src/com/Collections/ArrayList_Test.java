package com.Collections;
import java.util.Collections;
import java.util.ListIterator;
import java.util.Random;
public class ArrayList_Test {
   // Statics
   public static void main( String [] args ) {
       String [] toys = { "Shoe", "Ball", "Frisbee","Toy" };
     
      ArrayList arrlist = new ArrayList(toys);
     
      //list.addAll( Arrays.toList( toys ) );
      System.out.println( "arrlist created" +
        ", size=" + arrlist.size() +
        ", isEmpty=" + arrlist.isEmpty() );
 
      
      System.out.println( "--------------Iteration using indexes (Unsorted)-----------------" );
      
      for ( int i = 0; i < arrlist.size(); i++ )
         System.out.println( "   " + arrlist.get( i ) );
      
      
      System.out.println( "------------- Reverse Iteration using ListIterator----------------" );
     
      ListIterator iterator = arrlist.listIterator(arrlist.size() );
      while ( iterator.hasPrevious() ) {
         System.out.println( "   " + iterator.previous() );
         
      }
         // Removing
      
    //  arrlist.remove( 1 );
      //arrlist.clear();
      System.out.println( "------------- Shuffle using Collections.shuffle(arr,new Random())----------------" );
      Collections.shuffle(arrlist, new Random());
      System.out.println(arrlist);
      
      System.out.println(arrlist.get(1).hashCode());
      Collections.sort(arrlist);
      System.out.println(arrlist);
      
   }
}