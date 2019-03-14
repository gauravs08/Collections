package com.HashCode_Equals.HashCode_Equals2;

import java.util.HashMap;
import java.util.Map;

public class HashCodeWithEquals {

	public static void main(String[] args) {
        Map<EmployeeIdNew, EmployeeNew> employees = new HashMap<EmployeeIdNew, EmployeeNew>();
        employees.put(new EmployeeIdNew("111"), new EmployeeNew("Johny"));
        employees.put(new EmployeeIdNew("222"), new EmployeeNew("Jeny")); // Line A
        employees.put(new EmployeeIdNew("333"), new EmployeeNew("Jessie"));
        EmployeeNew emp = employees.get(new EmployeeIdNew("222"));// Line B
        System.out.println(emp); // Line C
        }
    }

 class EmployeeNew {
    private String name;
  
    public EmployeeNew(String name) {
        this.name = name;
    }
 
    public String toString() {
        return name;
    }
 
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj.getClass() != getClass()) {
            return false;
        }
        EmployeeNew emp = (EmployeeNew) obj;
        if (this.name == emp.name) {
            return true;
        }
        return false;
    }
 
    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
 
  class EmployeeIdNew {
	    private String id;
	 
	    public EmployeeIdNew(String id) {
	        this.id = id;
	    }
	 
	    public String toString() {
	        return id;
	    }
	 
	    public boolean equals(Object obj) {
	        if (obj == null)
	            return false;
	        if (obj.getClass() != getClass()) {
	            return false;
	        }
	        EmployeeIdNew empId = (EmployeeIdNew) obj;
	        if (this.id == empId.id) {
	            return true;
	        }
	        return false;
	    }
	 
	    @Override
	    public int hashCode() {
	        return id.hashCode();
	    }
	}
