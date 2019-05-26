package com.HashCode_Equals.HashCode_Equals2;

import java.util.HashMap;
import java.util.Map;
/*
 *  the output of the above code is null. The reason is that we did not override the equals() method for EmployeeId and Employee classes
 *  because the default implementation of equals() in the Object class considers the new EmployeeId("222") 
 *  in the put statement and new EmployeeId("222") in the get statement as two different instances, 
 *  and hence the call to get() in Line B returns null.
 *  
 *  see correct result by implementing HashCode and equals method in same folder example
 * */
public class HashCodeTest {
    public static void main(String[] args) {
        Map<EmployeeId, Employee> employees = new HashMap<EmployeeId, Employee>();
        employees.put(new EmployeeId("111"), new Employee("Johny"));
        employees.put(new EmployeeId("222"), new Employee("Jeny")); // Line A
        employees.put(new EmployeeId("333"), new Employee("Jessie"));
        Employee emp = employees.get(new EmployeeId("222"));// Line B
        System.out.println(emp); // Line C
    
		/*
		 * Integer i =1; System.out.println(i.hashCode()); //return 1
		 * 
		 * Character c ='a'; System.out.println(c.hashCode()); //return 97
		 * 
		 * String s ="b"; System.out.println(s.hashCode()); //return 98
		 * 
		 * System.out.println("ab".hashCode()); //return 3105
		 * 
		 * 
		 * Float f = 1f; System.out.println(f.hashCode()); //return 1065353216
		 */        
    }
    }



 class Employee {
    private String name;
 
    public Employee(String name) {
        this.name = name;
    }
 
    public String toString() {
        return name;
    }
}


 class EmployeeId {
    private String id;
 
    public EmployeeId(String id) {
        this.id = id;
    }
 
    public String toString() {
        return id;
    }
}