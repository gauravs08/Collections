package com.Collections;

import java.util.*;
import java.util.Map.Entry;

public class HashMap_Test {
    // Statics

    public static void main(String[] args) {
        System.out.println("Collection HashMap Test");
        HashMap<String, String> hmap = new HashMap<String, String>(); 
        // Test the Collection interface
        System.out.println("HashMap [UnOrdered], size=" + hmap.size()
                + ", isEmpty=" + hmap.isEmpty());
        // Adding
        hmap.put(new String("Harriet"), new String("Bone"));
        hmap.put(new String("Bailey"), new String("Big Chair"));
        hmap.put(new String("Max"), new String("Tennis Ball"));
       // hmap.put(null,null);
        System.out.println("HashMap Collection 1 populated, size=" + hmap.size()
                + ", isEmpty=" + hmap.isEmpty());

        // Test Containment/Access
        String key = new String("Harriet");
        if (hmap.containsKey(key)) {
            System.out.println("HashMap Collection 1 access, key=" + key + ", value="
                    + (String) hmap.get(key));
        }

        // Test iteration of keys and values
 
        Set<String> keys = hmap.keySet();    //keys will have only key
       
        System.out.println("HashMap Collection 1 iteration (unsorted), collection contains keys:");
        Iterator iterator = keys.iterator();
        while (iterator.hasNext()) {
            System.out.println("   " + iterator.next());
        }
        
      //values()
        Collection<String> val  = hmap.values(); 
        System.out.println("collection contains values:");
        iterator = val.iterator();
       while (iterator.hasNext()) {
           System.out.println("   " + iterator.next());
       }
        //entryset
        Set<Entry<String, String>> entry  =hmap.entrySet();  //entry will have [ key = value ]
        System.out.println("HashMap Collection 1 iteration (unsorted), collection contains entrykeys:");
         iterator = entry.iterator();
        while (iterator.hasNext()) {
            System.out.println("   " + iterator.next());
        }
        
        
       
        //TreeMap
         TreeMap<String, String> Tmap =new TreeMap<String, String>();
         Tmap.putAll(hmap);
         System.out.println("TreeMap [sorted by key]::\n"+Tmap);
         
        hmap.clear();
        System.out.println("HashMap Collection 1 cleared, size=" + hmap.size()
                + ", isEmpty=" + hmap.isEmpty());
    }
}
