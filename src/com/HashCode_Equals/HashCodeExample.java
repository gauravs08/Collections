package com.HashCode_Equals;

public class HashCodeExample {
/*
hashCode() :
As you know this method provides the hash code of an object.
 Basically the default implementation of hashCode() provided by Object is derived by mapping the memory address to an integer value. 
 If look into the source of Object class , you will find the following code for the hashCode.
public native int hashCode();
It indicates that hashCode is the native implementation which provides the memory address to a certain extent. 
However it is possible to override the hashCode method in your implementation class.

equals() :
This particular method is used to make equal comparison between two objects.
 There are two types of comparisons in Java. One is using “= =” operator and another is “equals()”.
  I hope that you know the difference between this two.
   More specifically the “.equals()” refers to equivalence relations.
    So in broad sense you say that two objects are equivalent they satisfy the “equals()” condition.
     If you look into the source code of Object class you will find the following code for the equals() method.
public boolean equals(Object obj) 
{
	return (this == obj);
}
 * 
 * */
	public static void main(String args[])
	{
		Integer age = 20;
		System.out.println("Hash Code::"+age.hashCode());
		int originalHashCode = System.identityHashCode(age);
		System.out.println("orignal hash code::" +originalHashCode);
	}
}
