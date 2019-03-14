
package com.Protected;
import com.Inheritance.ClassA_Proctected_Test;


public class ClassB_Protected_Test extends ClassA_Proctected_Test{
    public void testit()
    {
        System.out.println("variable x is ::"+x);
        ClassA_Proctected_Test obja=new ClassA_Proctected_Test();
        //System.out.println("obja.x"+obja.x);//cannot use protected superclass variable or method using reference
        //obja.display();//""
        display();
    }
    public static void main(String args[])
    {
        ClassB_Protected_Test b=new ClassB_Protected_Test();
         b.testit();

    }
}
