/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.Inheritance;

/**
 *
 * @author gaurav.sharma
 */
public class Inheritance_TestB extends Inheritance_Test {
	int a1 = 10;

	void display() {
		System.out.println("DISPLAY B ::" + a1++);

		System.out.println("DISPLAY B ::" + a1);
		super.display();
	}

	public Inheritance_TestB() {

		System.out.println("Const B " + super.a1);

	}

	public static void main(String args[]) {
		Inheritance_Test a = new Inheritance_TestB(); // obj of class B but reference of parent 
		//when object a is created it will call the constructor of Super first then child class constructor will be called.

		//Inheritance_TestB a = new Inheritance_TestB(); // try this also still super constructor will be called first. 
		a.display();

	}

}