package com.InfosysQuestions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class SubsetAllSumnZero {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(11,16,11,9,7,13,5,3,1,14) ;
		int sum = 10;
		SubsetAllSumnZero ss = new SubsetAllSumnZero();
		
		List<List<Integer>> result = ss.subsetsWithSum(list, 2, 10, 0);
		System.out.println(result);
	}
	/**
	 * Return all k-length subsets of A starting at offset o that sum to s.
	 * @param A - an unordered list of integers.
	 * @param k - the length of the subsets to find.
	 * @param s - the sum of the subsets to find.
	 * @param o - the offset in A at which to search.
	 * @return A list of k-length subsets of A that sum to s.
	 */
	public static List<List<Integer>> subsetsWithSum(
	        List<Integer> A,
	        int k,
	        int s,
	        int o)
	{
	    List<List<Integer>> results = new LinkedList<List<Integer>>();

	    if (k == 1)
	    {
	        if (A.get(o) == s)
	            results.add(Arrays.asList(o));
	    }
	    else
	    {
	        for (List<Integer> sub : subsetsWithSum(A, k-1, s-A.get(o), o+1))
	        {
	            List<Integer> newSub = new LinkedList<Integer>(sub);
	            newSub.add(0, o);
	            results.add(0, newSub);
	        }
	    }

	    if (o < A.size() - k)
	        results.addAll(subsetsWithSum(A, k, s, o+1));

	    return results;
	}
	
	
	
	
	
	public static List<List<Integer>> subsetsWithSum(
	        List<Integer> A,
	        List<Integer> args,
	        Map<List<Integer>, List<List<Integer>>> cache)
	{
	    if (cache.containsKey(args))
	        return cache.get(args);

	    int k = args.get(0), s = args.get(1), o = args.get(2);
	    List<List<Integer>> results = new LinkedList<List<Integer>>();

	    if (k == 1)
	    {
	        if (A.get(o) == s)
	            results.add(Arrays.asList(o));
	    }
	    else
	    {
	        List<Integer> newArgs = Arrays.asList(k-1, s-A.get(o), o+1);

	        for (List<Integer> sub : subsetsWithSum(A, newArgs, cache))
	        {
	            List<Integer> newSub = new LinkedList<Integer>(sub);
	            newSub.add(0, o);
	            results.add(0, newSub);
	        }
	    }

	    if (o < A.size() - k)
	        results.addAll(subsetsWithSum(A, Arrays.asList(k, s, o+1), cache));

	    cache.put(args, results);
	    return results;
	}
	public static List<List<Integer>> subsetsWithZeroSum(List<Integer> A, int k)
	{
	    Map<List<Integer>, List<List<Integer>>> cache =
	            new HashMap<List<Integer>, List<List<Integer>>> ();
	    return subsetsWithSum(A, Arrays.asList(k, 0, 0), cache);
	}
}
