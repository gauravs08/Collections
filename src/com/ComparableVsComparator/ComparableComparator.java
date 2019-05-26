package com.ComparableVsComparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class ComparableComparator  {

	public static void main(String args[]){
		String s1 = "Comparable";
		String s2 = "Comparable";
		
		System.out.println("==========Comparable==========");
		System.out.println("s1.compareTo(s2) == " + s1.compareTo(s2));
		
		
		      // Takes a list o Dog objects
		      List<Dog> list = new ArrayList<Dog>();

		      list.add(new Dog("Shaggy",3));
		      list.add(new Dog("Lacy",2));
		      list.add(new Dog("Roger",10));
		      list.add(new Dog("Tommy",4));
		      list.add(new Dog("Tammy",1));
		      
		      Collections.sort(list);// Sorts the array list
		      
		      System.out.println("-----------printing the sorted list of names---------");
		      for(Dog a: list)//printing the sorted list of names
		         System.out.print(a.getDogName() + ", ");

		      System.out.println(" ");
		      System.out.println("-----------Sorts the array list using comparator----");
		      // Sorts the array list using comparator
		      
		      Collections.sort(list, new Dog());
		      
		      
		      for(Dog a: list)//printing the sorted list of ages
		         System.out.print(a.getDogName() +"  : "+
				 a.getDogAge() + ", ");
		   }
		}

