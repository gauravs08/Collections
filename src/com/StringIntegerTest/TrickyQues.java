package com.StringIntegerTest;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TrickyQues {

	 static int i=0;
	public void A(){i=8;}
	
	public static void main(String... args) {

		int a=5,b=7;
		int c =a+=2*3+--b;
		System.out.println(c);

		//-------
		List mylist = new ArrayList();
		mylist = Collections.synchronizedList(mylist);
		//-------
		int i1 =2;
		int i2 = 5;
		double d = 3+i1/i2+2;
		System.out.println(d);
		
		int i=0;
		TrickyQues h = new TrickyQues();
		//while(i<=10)h.doIt();
		
		h.display();
		
		/*List <Double> doubles = new LinkedList<>();
		List <Integer> integers = new LinkedList<Integer>();

		List<String> doubleValues = getValues(doubles);
		List<String> intValues = getValues(integers);*/
	}
	public static void doIt(){
		i++;
		System.out.println("Hello.");
		
	}
	
	public void display(){
		try{
			//perm = new java.io.FilePermission("d:/out.txt", "read");
			//ProcessBuilder builder= new ProcessBuilder(javaBin, "-cp", classpath, className, args);;
			throw new Exception();
		}catch (Exception e) {
			if(e instanceof Exception){
				System.out.println(e);
			}
		}
	}
	//public static List<String> getValues(List<? extends Number> list)(){}
	//public List <String> getValues(getlist)(){}
	//public static List<String> getValues(List <String> list)(){}
	//public static List<String> getValues(List list)(){}
	//public List<String> getNumbers(List<Value> list){}
}
@Target(ElementType.ANNOTATION_TYPE)
@Retention(RetentionPolicy.SOURCE)
 @interface example{
	String newValue();
	String oldValue();
}
//------------------------
class Brain{
	Brain(int a, int b){
		int c = a+b;
		System.out.println(c);
	}
	void display(){
		System.out.println("Brain");
	}
}
class Bench extends Brain{

	Bench(int a, int b) {
		super(a, b);
		int c= a - b;
		System.out.println(c);
	}
	
}
//--------------------------
