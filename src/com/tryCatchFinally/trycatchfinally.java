package com.tryCatchFinally;

import java.io.FileReader;
import java.io.IOException;

public class trycatchfinally {

	public static void main(String[] args) {

		 FileReader reader = null;
	        try {
	        	System.out.println("--- File 1 ---");
	        	//System.exit(0);
	            reader = new FileReader("someFile");
	            int i=0;
	            while(i != -1){
	                i = reader.read();
	                System.out.println((char) i );
	            }
	        } catch (IOException e) {
	        	System.out.println("--- File catch 2 ---");
	        	if(e instanceof IOException){
	        		System.out.println(e);
	        	}else if(e instanceof Exception){
	        		System.out.println(e);
	        	}
	        } finally {
	            if(reader != null){
	                try {
	                    reader.close();
	                } catch (IOException e) {
	                    //do something clever with the exception
	                }
	            }
	           System.out.println("--- File End ---");
	        }
		
	}

}
