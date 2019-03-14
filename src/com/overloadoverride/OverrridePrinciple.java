package com.overloadoverride;
/*
 * 
 * only depends upon signature(name, plus the number and the type of its parameters) AND RETURN TYPE
 * An overriding method can also return a subtype of the type returned by the overridden method. 
 * This is called a covariant return type.
 * 
 * */


class A {
}
class B extends A {
}

class Car {
  public void getObject() {
    System.out.println("CAR:: getObject");
    //return new A();
  }
  public void getAObj(){
	  System.out.println("CAR::getAObj");
	  //return new A();
  }
}

class Audi extends Car {
  public void getObject() {
    System.out.println("AUDI:: is running at 100km");
    //return new B();
  }

  public static void main(String[] args) {
    Car s = new Audi();  // Sub class obj  reference Super class. //Upcasting 
    s.getObject();
    
    s.getAObj();
  }
}



/*
 * The output of the above code is:

AUDI::getObject
Because AUDI class has the method getObject().
 if it does not have this method in Sub class then only it will search the method in super class
 
 see s.getAObj() - since Sub does not have the defination it will return from Super
 */