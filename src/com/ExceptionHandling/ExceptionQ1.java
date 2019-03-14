package com.ExceptionHandling;
import java.lang.Exception;


/*we can narrow the Exception in derived class method ,but we cann't broader the exception class.
 * or we can remove the throws in derived class overrride method*/
class  ExDerive {
	
	public void method1() throws Exception{
		System.out.println("In ExDerive Class");
	}
}


public class ExceptionQ1 extends ExDerive {

	public static void main(String[] args) throws RuntimeException {

		ExceptionQ1 obj = new ExceptionQ1();
		try {
			obj.method1();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void method1() throws NullPointerException {
		
		System.out.println("In ExceptionQ1 method1");
		NullPointerException exp = new NullPointerException("Exception in method1");
		throw exp ;
	}

}


