package com.Clone;

class Employee implements Cloneable{

	private String name;
	private String designation;

	public Employee() {
		this.setDesignation("Programmer");
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Object clone() throws CloneNotSupportedException {

		
		/*  Employee copyObj = new Employee();
		  copyObj.setDesignation(this.designation); copyObj.setName(this.name);
		  return copyObj;
		*/ 
		return super.clone();
	}
}

public class CloneExample {
	public static void main(String arg[]) {
		Employee obj1 = new Employee();
		obj1.setName("Jamie Zawinski");
		Employee obj2 = null;
		try {
			obj2 = (Employee) obj1.clone();
			System.out.println(obj2.getName());
			System.out.println(obj2.getDesignation());
		} catch (CloneNotSupportedException cfnse) {
			System.out.println("Cloneable should be implemented. " + cfnse);
		}
		
		Employee obj3 = obj1;
			System.out.println("obj1.equals(obj3) = " +obj1.equals(obj3) );
			System.out.println("obj1==obj3 = " +( obj1==obj3) +"" );

	}
}