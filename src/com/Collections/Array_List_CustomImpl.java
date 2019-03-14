/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.Collections;

import java.util.*;


/**
 * 
 * @author gaurav.sharma
 */
public class Array_List_CustomImpl {

	public static void main(String[] args) {
		try {
			String s[] = { "My", "Custom", "Implementation" };
			Object o;
			int i = 0;
			ArrayList_Custom a = new ArrayList_Custom();
			List lst = a.ArrayList_Custom(s);
			
			System.out.println("The list is: " + lst);
			ArrayList al = new ArrayList(s);
			o = al.get(1);
			
			System.out.println("The retrieved element is: " + o);
			String s1 = "Collection";
			o = al.set(2, s1);
			
			System.out.println("The set element in place of Implementation is: "+ s1);
			System.out.println("Now the new list is: " + lst);
			
			i = al.size();
			
			System.out.println("The size of the array list is: " + i);
		} catch (Exception e) {
		}
	}
}
