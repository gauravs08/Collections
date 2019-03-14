/*
 * Overloading a constructor is typically used to provide alternate ways for clients
to instantiate objects of your class. For example, if a client knows the animal name,
they can pass that to an Animal constructor that takes a string. But if they don't
know the name, the client can call the no-arg constructor and that constructor can
supply a default name. Here's what it looks like:

 * Overloading: Overloading is nothing but passing the different parameters to the method. 
 * Here method name is same but parameters are different.
v/s
Overriding: Overriding is nothing but giving the implementation to the method in the derived class.
Here method signature is same.
 * 
 * 
 */

package com.overloadoverride;

public class Animal {
	String name;
	static int x2 = 2;

	Animal(String name) // constructor with argument
	{
		this.name = name;
	}

	Animal() { // constructor without argument
		this(makeRandomName());
	}

	static String makeRandomName() {

		int x = (int) (Math.random() * 5);
		String name = new String[] { "Fluffy", "Fido", "Rover", "Spike", "Gugi" }[x];
		return name;
	}

	public static void main(String[] args) {

		System.out.println(x2);
		Animal a = new Animal();
		System.out.println(a.name);
		Animal b = new Animal("Zeus");
		System.out.println(b.name);

		/*
		 * String str="abcd"; String str2="abcd";
		 * System.out.println("STR1==Str2:::"+(str==str2)); //it checks whether
		 * references are same
		 * System.out.println("str.equals(str2)::"+str.equals(str2)); //it check
		 * whether strings values are same
		 */
	}
}