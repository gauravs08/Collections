package com.ExceptionHandling;

import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;
import java.lang.management.MemoryUsage;
/*
 * Demonstration that OutOfMemoryError does not mean that the JVM is out of memory in the catch block:
 * */
public class RunOutOfmemoryErrorTest {

	public static void main(String[] args) {
		runOutOfMemory();
	}
	
	private static final int MEGABYTE = (2024*1024);
	public static void runOutOfMemory() {
	    MemoryMXBean memoryBean = ManagementFactory.getMemoryMXBean();
	    for (int i=1; i <= 100; i++) {
	        try {
	            byte[] bytes = new byte[MEGABYTE*500];
	        } catch (Exception e) {
	            e.printStackTrace();
	        } catch (OutOfMemoryError e) {
	            MemoryUsage heapUsage = memoryBean.getHeapMemoryUsage();
	            long maxMemory = heapUsage.getMax() / MEGABYTE;
	            long usedMemory = heapUsage.getUsed() / MEGABYTE;
	            System.out.println(i+ " : Memory Use :" + usedMemory + "M/" + maxMemory + "M");
	        }
	    }
	}
}
