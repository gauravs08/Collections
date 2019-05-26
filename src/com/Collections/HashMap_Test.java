package com.Collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class HashMap_Test {
    // Statics

    public static void main(String[] args) {
        System.out.println("Collection HashMap Test");
        HashMap<String, String> hmap = new HashMap<String, String>(); 
      
        System.out.println("HashMap [UnOrdered], size=" + hmap.size()
                + ", isEmpty=" + hmap.isEmpty());
        // Adding
        hmap.put(new String("1"), new String("Orange"));
        hmap.put(new String("2"), new String("Blue"));
        hmap.put(new String("3"), new String("Red"));
        System.out.println("HashMap Collection 1 populated, size=" + hmap.size()
                + ", isEmpty=" + hmap.isEmpty());

        // Test Containment/Access
        String key = new String("1");
        if (hmap.containsKey(key)) {
            System.out.println("HashMap Collection 1 access, key=" + key + ", value="
                    + (String) hmap.get(key));
        }

        
        System.out.println("---------------HashMap iteration of keys and values-----------");
 
        Set<String> keys = hmap.keySet();    //keys will have only key
       
        System.out.println("HashMap Collection 1 iteration (unsorted), collection contains keys:");
        Iterator iterator = keys.iterator();
        while (iterator.hasNext()) {
            System.out.println("   " + iterator.next());
        }
        
      //values()
        for(String val:hmap.values()) {
        	System.out.println(val);
        }
        //		OR
        Collection<String> val  = hmap.values(); 
        System.out.println("collection contains values:");
        iterator = val.iterator();
       while (iterator.hasNext()) {
           System.out.println("   " + iterator.next());
       }
       
       System.out.println("---------------Entry Set [key = value]-----------");
        Set<Entry<String, String>> entry  = hmap.entrySet();  //entry will have [ key = value ]
        System.out.println("HashMap Collection 1 iteration (unsorted), collection contains entrykeys:");
         iterator = entry.iterator();
        while (iterator.hasNext()) {
            System.out.println("   " + iterator.next());
        }
        
        System.out.println("---------------Reverse Sorting HashMap using Value-----------");
        hmap.entrySet().stream()
        .sorted((k1, k2) -> -k1.getValue().compareTo(k2.getValue()))
        .forEach(k -> System.out.println(k.getKey() + ": " + k.getValue()));
        
       
        System.out.println("---------------Tree Map-----------");
         TreeMap<String, String> Tmap = new TreeMap<String, String>();
         Tmap.putAll(hmap);
         System.out.println("TreeMap [sorted by key]::\n"+Tmap);
         
        hmap.clear();
        System.out.println("HashMap Collection 1 cleared, size=" + hmap.size()
                + ", isEmpty=" + hmap.isEmpty());
    }
    
    
}
