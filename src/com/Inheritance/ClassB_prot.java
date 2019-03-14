/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.Inheritance;

/**
 *
 * @author gaurav.sharma
 */
public class ClassB_prot extends ClassA_Proctected_Test {
	
	public void testit() {
		System.out.println("variable x is ::" + x);
		
		ClassA_Proctected_Test obja = new ClassA_Proctected_Test();
		System.out.println("obja.x = " + obja.x);
		obja.display();
	}

	public static void main(String args[]) {
		ClassB_prot b = new ClassB_prot();
		b.testit();

	}

}
