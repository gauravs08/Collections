
package com.Collections;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class List_Sorting_args {
  public static void main(String[] args) {
  try{
      String args2[]={"hi","how","r","abc"};

          //  args2.add("hi");
  List<String> list = Arrays.asList(args2);

  Collections.sort(list);
  System.out.println("The sorted list is: "+list);
  int pos = Collections.binarySearch(list, list.get(2));
  System.out.println("The position of the searched element is : "+pos
   +" and the element is:"+list.get(2));
  }
  catch(Exception e){}

  }
}