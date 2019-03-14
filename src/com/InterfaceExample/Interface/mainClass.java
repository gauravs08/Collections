package com.InterfaceExample.Interface;

public abstract class mainClass implements Shape,Shape2{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		mainClass mc = new mainClass() {
		} ;
		mc.draw();

	}

	@Override
	public
	void draw() {
		System.out.println("mainClass :: draw()");
		
	}

	

}
