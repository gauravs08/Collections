package com.Collections;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Set_List {

    public static void main(String args[]) {
        int count[] = {34, 22, 10, 60, 30, 22, 60, 54, 10, 0};
        Set<Integer> set = new HashSet<Integer>();
        try {
            System.out.println("Count are::");
            System.out.print("[");
            for (int i = 0; i < count.length; i++) {
            	System.out.print(count[i]+" ,");
                set.add(count[i]);
            }
            
            Set<Integer> setJava9 = Set.of(1,2,3,4,5);
            //setnew.add(6); // java.lang.UnsupportedOperationException
            System.out.println(setJava9);        //Set is unordered
              
           // set.add(null);
            System.out.println("]");
            System.out.println("---------SET------------");
            //Set
            System.out.println("HashSet is::[No Duplicate][No Order]");
            System.out.println(set);        //Set is unordered
            
            //TreeSet
            TreeSet<Integer> sortedSet = new TreeSet<Integer>(set);System.out.println("");
            
            System.out.println("The sorted set is:TreeSet[No Duplicate][Order]");  //TreeSet are Ordered
            System.out.println(sortedSet);
            System.out.println("The First element of the Treeset is: "
                    + (Integer) sortedSet.first());
            System.out.println("The last element of the Treeset is: "
                    + (Integer) sortedSet.last());
            
            //HashSet
            HashSet hSet = new HashSet<Integer>(set);System.out.println("");
            hSet.add(null);
            System.out.println("The sorted set is:HashSet[No Duplicate][No Order][Null Allow]");  
            System.out.println(hSet);
            
            //List<Integer>
            System.out.println("---------LIST------------");
            System.out.println("inserting an element in the middle of the list is relatively slow on ArrayList,"
            		+ " but fast on LinkedList. And looking up a random element in the list is fast on ArrayList,"
            		+ " but slow on LinkedList. ");
            List<Integer> list = new java.util.ArrayList<Integer>();
                for (int i = 0; i < count.length; i++) {
                    list.add(count[i]);
                }
                System.out.println("the ArrayList is::[Duplicates][Fast Get & Set][Random Access] & -ve[Bad Add and Remove] ");
                System.out.println(list);
                System.out.println("The ArrayList.get(\"7\")  element of the List is: "
                        + (Integer) list.get(7)); 
                
            //LinkedList    
            LinkedList<Integer> queue = new LinkedList<Integer>();
            for (int i = 0; i < count.length; i++) {
                queue.addFirst(count[i]);
            }
            System.out.println("The Linkedlist is:[Duplicates][Fast Add & Remove][Traverse Whole] &-ve[[Bad Get & Set]] ");
            System.out.println(queue);
            queue.removeLast();
            System.out.println("After removing last element the LinkedList is: " + queue);
            queue.removeFirst();
            System.out.println("After removing First element the LinkedList is: " + queue);

               
                
            } catch (Exception e) {
            	System.out.println(e);
            }
        /*
Count are::
[34 ,22 ,10 ,60 ,30 ,22 ,60 ,54 ,10 ,]
---------SET------------
HashSet is::[No Duplicate]
[34, 54, 22, 10, 30, 60]
The sorted set is:TreeSet
[10, 22, 30, 34, 54, 60]
The First element of the Treeset is: 10
The last element of the Treeset is: 60
---------LIST------------
the ArrayList is::[Duplicates] 
[34, 22, 10, 60, 30, 22, 60, 54, 10]
The ArrayList.get("7")  element of the List is: 54
The Linkedlist is:[Duplicates] 
[10, 54, 60, 22, 30, 60, 10, 22, 34]
After removing last element the LinkedList is: [10, 54, 60, 22, 30, 60, 10, 22]
After removing First element the LinkedList is: [54, 60, 22, 30, 60, 10, 22]
*/
    }

  }
