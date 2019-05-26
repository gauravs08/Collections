package com.Collections;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorAll {

	public static void main(String[] args) {
		int[] intarr = { 7, 2, 8, 10, 30, 12, 23, 1, 4, 6, 2, 8, 10 };
		Collection<Integer> coll = null;
		List<Integer> intList = Arrays.asList(new Integer[] { 1, 2, 3 });
		// intList = Arrays.asList(intarr);

		System.out.println(intList);

		Iterator<Integer> it = intList.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

		ListIterator<Integer> listIt = intList.listIterator();

		while (listIt.hasNext()) {
			System.out.println(listIt.next());

		}

	}

}
