package com.Clone;

/*https://dzone.com/articles/java-copy-shallow-vs-deep-in-which-you-will-swim
 * http://www.avajava.com/tutorials/lessons/how-do-i-perform-a-deep-clone-using-serializable.html
 * 
 * A typical way of implementing a deep clone is to go through a class and write code to create new objects and
 *  copy over all of the values to these new objects. This can be a time-consuming process
 *   if the object being cloned is complicated. 
 *   A simple way of performing a deep clone is for all of the classes that make up a class to implement the Serializable interface. 
 *   If this is the case, we can serialize all of the values of the object and then deserialize all of these values to a new object. 
 * This in essence is a shortcut to performing a deep copy, since all of the values get copied over into new objects.
 * */
public class ShallowNDeepClone {

	public static void main(String[] args) {
		CloneExampleDemo ce = new CloneExampleDemo();
		
		ce.setNum(3);
		ce.setThing(new Thing("Fred"));
		System.out.println("Before cloning");
		System.out.println("ce:" + ce);

		CloneExampleDemo ceShallowClone = ce.clone();
		CloneExampleDemo cdDeepClone = ce.deepClone();

		System.out.println("\nAfter cloning, setting ce num to 5");
		ce.setNum(5);
		System.out.println("After cloning, setting ce thing name to Barney");
		Thing thing = ce.getThing();
		thing.setName("Barney");

		System.out.println("1) ce:" + ce);
		System.out.println("2) ceShallowClone:" + ceShallowClone);
		System.out.println("3) cdDeepClone:" + cdDeepClone);

		System.out.println("\nNotice that changing ce thing name to Barney changed ceShallowClone's thing name to Barney.");
		System.out.println("This is because the copy was shallow, and ce's thing and ceShallowClone's thing point to the same Thing.");
		System.out.println("Notice that ceDeepClone's thing name is Fred. This is because the deep copy resulted in ceDeepClone having its own Thing.");

	}


}
