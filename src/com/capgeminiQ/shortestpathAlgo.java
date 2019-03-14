package com.capgeminiQ;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;


public class shortestpathAlgo {

	
	public static void main(String[] args) {

		String[] input1 = {"A","B","C","D"};
		int[] input2 = {2,1,3,2,4,3};//{2,3,1,5,4,3};
		System.out.println((minimum_cost(input1, input2)));
	}

	public static int minimum_cost(String[] input1,int[] input2)
    {
		int cost = 0;
		int i = 0;
		int len = input1.length;
		VertexA[] node = {};
		//while(i>=len){
		    
			VertexA V = new VertexA(input1[i]);
			
			//i++;
		//}
			VertexA A = new VertexA(input1[i]);
			VertexA B = new VertexA(input1[i+1]);
			VertexA C = new VertexA(input1[i+2]);
			VertexA D = new VertexA(input1[i+3]);
			//VertexA E = new VertexA(input1[i+4]);
			
A.adjacencies = new Edge[]{ new Edge(B, input2[i]),
                    new Edge(C, input2[i+1]),
                    new Edge(D, input2[i+2]) };
					//,new Edge(E, input2[i+3])};

B.adjacencies = new Edge[]{ new Edge(A, input2[i]),
                    new Edge(C, input2[i+3]),
                    new Edge(D, input2[i+4]) };
                    //,new Edge(E, input2[i+5]) };

C.adjacencies = new Edge[]{ new Edge(A, input2[i+2]),
					 new Edge(B, input2[i+3]),
					 new Edge(D, input2[i+5])
					 //,new Edge(E, input2[i+6]) 
					  };

D.adjacencies = new Edge[]{  	new Edge(A,input2[i+2] ),
						new Edge(B, input2[i+4]),
						new Edge(C, input2[i+5])};
						//,new Edge(E, 1) };

/*E.adjacencies = new Edge[]{ 	new Edge(A, 1),
						new Edge(B, 3),
						new Edge(C, 5),
						new Edge(D, 1)};*/
			
		VertexA[] vertices = { A, B, C, D };
        computePaths(A);
        for (VertexA v : vertices)
	{
	    //System.out.println("Distance to " + v + ": " + v.minDistance);
	    List<VertexA> path = getShortestPathTo(v);
	    //System.out.println("Path: " + path);
	    cost +=v.minDistance;
	    //System.out.println(cost);
	}
        
		return cost;
       
    }
	
	public static void computePaths(VertexA source)
    {
        source.minDistance = 0.;
        PriorityQueue<VertexA> VertexAQueue = new PriorityQueue<VertexA>();
      	VertexAQueue.add(source);

	while (!VertexAQueue.isEmpty()) {
	    VertexA u = VertexAQueue.poll();

            // Visit each edge exiting u
            for (Edge e : u.adjacencies)
            {
                VertexA v = e.target;
                double weight = e.weight;
                double distanceThroughU = u.minDistance + weight;
		if (distanceThroughU < v.minDistance) {
		    VertexAQueue.remove(v);
		    v.minDistance = distanceThroughU ;
		    v.previous = u;
		    VertexAQueue.add(v);
		}
            }
        }
    }
	 public static List<VertexA> getShortestPathTo(VertexA target)
	    {
	        List<VertexA> path = new ArrayList<VertexA>();
	        for (VertexA VertexA = target; VertexA != null; VertexA = VertexA.previous)
	            path.add(VertexA);
	        Collections.reverse(path);
	        return path;
	    }
	 
}

class VertexA implements Comparable<VertexA>
{
    public final String name;
    public Edge[] adjacencies;
    public double minDistance = Double.POSITIVE_INFINITY;
    public VertexA previous;
    public VertexA(String argName) { name = argName; }
    public String toString() { return name; }
    
    public int compareTo(VertexA other)
    {
        return Double.compare(minDistance, other.minDistance);
    }
}

class Edge
{
    public final VertexA target;
    public final double weight;
    
    public Edge(VertexA argTarget, double argWeight)
    { target = argTarget; weight = argWeight; }
}