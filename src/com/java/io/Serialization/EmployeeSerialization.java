package com.java.io.Serialization;

import java.io.Serializable;

/*
 * Java provides a mechanism, called object serialization where an object can be represented as a 
 * sequence of bytes that includes the object's data as well as information about the object's type 
 * and the types of data stored in the object.

After a serialized object has been written into a file, it can be read from the file and deserialized that is,
  the type information and bytes that represent the object and its data can be used to recreate the object in memory.
********
Most impressive is that the entire process is JVM independent, 
meaning an object can be serialized on one platform  and deserialized on an entirely different platform.
************
Classes ObjectInputStream and ObjectOutputStream are 
high-level streams that contain the methods for serializing and deserializing an object.


The transient----- modifier tells the Java object serialization subsystem to exclude the field 
when serializing an instance of the class. When the object is then deserialized, 
the field will be initialized to the default value; i.e. null for a reference type, 
and zero or false for a primitive type. Note that the JLS (see 8.3.1.3) 
does not say what transient means, but defers to the Java Object Serialization Specification.
 Other non-standard serialization mechanisms may also pay attention to a field's transient-ness.

The volatile---- modifier tells the JVM that writes to the field should always be synchronously 
flushed to memory, and that reads of the field should always read from memory. 
This means that fields marked as volatile can be safely accessed and updated in a 
multi-thread application without using native or standard library-based synchronization. 
(This does not apply to long or double fields, which may be non-atomic on some JVMs. 
However, it always applies to reference-typed fields.) The relevant parts of the JLS are 8.3.1.4, 17.4 and 17.7.
 * */
public class EmployeeSerialization implements Serializable {

	public String name;
	public String address;
	public transient int SSN;
	public int number;

	public void mailCheck() {
		System.out.println("Mailing a check to " + name + " " + address);
	}

}
