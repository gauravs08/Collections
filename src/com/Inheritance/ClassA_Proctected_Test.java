
package com.Inheritance;

public class ClassA_Proctected_Test {

	protected int x = 32;  // only visible under com.Inheritance package | Not visible in com.protected package

	protected void display() {  // same protected method and variable is visible only in same package 
		System.out.println("A.dispaly.x::" + x);
	}

}
