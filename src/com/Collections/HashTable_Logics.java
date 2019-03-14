package com.Collections;
/*Read more: http://javarevisited.blogspot.com/2012/01/java-hashtable-example-tutorial-code.html#ixzz2M8FejjOx
*/
import java.util.Collection;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashTable_Logics {

public static void main(String args[]) {

	
	
	String str[] = { "japan",
            "usa",
            "japan",
            "russia",
            "usa",
            "japan",
            "japan",
            "australia"};
    int len = 8;
    Hashtable ht = new Hashtable();
    int i = 0;
    while (i < len) {

        String c = str[i];
        System.out.println("c :" + c);
        Integer intg = (Integer) ht.get(c);

        if (intg == null)
            ht.put(c, new Integer(1));
        else
            ht.put(c, new Integer(intg.intValue() + 1));

        i++;
    }

    Enumeration k = ht.keys();
    //hashTable order is not particular wrt order of insertion
    while (k.hasMoreElements()) {
        String key = (String) k.nextElement();
        System.out.println(key + " > " + ht.get(key));
    }

	   System.out.println("-HashTable--No Ordered--------------"); 
	
// Creating Hashtable for example
Hashtable companies = new Hashtable();


// Java Hashtable example to put object into Hashtable
// put(key, value) is used to insert object into map
companies.put("Google", "United States");
companies.put("Nokia", "Finland");
companies.put("Sony", "Japan");


// Java Hashtable example to get Object from Hashtable
// get(key) method is used to retrieve Objects from Hashtable
companies.get("Google");


// Hashtable containsKey Example
// Use containsKey(Object) method to check if an Object exits as key in
// hashtable
System.out.println("Does hashtable contains Google as key: "
+ companies.containsKey("Google"));


// Hashtable containsValue Example
// just like containsKey(), containsValue returns true if hashtable
// contains specified object as value
System.out.println("Does hashtable contains Japan as value: "
+ companies.containsValue("Japan"));


// Hashtable enumeration Example
// hashtabl.elements() return enumeration of all hashtable values
Enumeration enumeration = companies.elements();
System.out.println("Enumeration of HashTable companies:: "+enumeration);

while (enumeration.hasMoreElements()) {
System.out.println("hashtable values: " + enumeration.nextElement());
}


// How to check if Hashtable is empty in Java
// use isEmpty method of hashtable to check emptiness of hashtable in
// Java
System.out.println("Is companies hashtable empty: "+ companies.isEmpty());


// How to find size of Hashtable in Java
// use hashtable.size() method to find size of hashtable in Java
System.out.println("Size of hashtable in Java: " + companies.size());


// How to get all values form hashtable in Java
// you can use keySet() method to get a Set of all the keys of hashtable
// in Java
Set hashtableKeys = companies.keySet();
System.out.println("Companies.keySet() = "+hashtableKeys);

Set hashtableEntrySet = companies.entrySet();
System.out.println("Companies.entrySet() = "+hashtableEntrySet);

// you can also get enumeration of all keys by using method keys()
Enumeration hashtableKeysEnum = companies.keys();
System.out.println("Companies.keys() = "+hashtableKeysEnum);

// How to get all keys from hashtable in Java
// There are two ways to get all values form hashtalbe first by using
// Enumeration and second getting values ad Collection

Enumeration hashtableValuesEnum = companies.elements();
System.out.println("Companies.elements() = "+hashtableValuesEnum);

Collection hashtableValues = companies.values();
System.out.println("Companies.values() = "+hashtableValues);

// Hashtable clear example
// by using clear() we can reuse an existing hashtable, it clears all
// mappings.
companies.clear();
}
}


