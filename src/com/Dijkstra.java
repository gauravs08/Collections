package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

class Vertex implements Comparable<Vertex>
{
    public final String name;
    public Edge[] adjacencies;
    public double minDistance = Double.POSITIVE_INFINITY;
    public Vertex previous;
    public Vertex(String argName) { name = argName; }
    public String toString() { return name; }
    
    public int compareTo(Vertex other)
    {
        return Double.compare(minDistance, other.minDistance);
    }
}

class Edge
{
    public final Vertex target;
    public final double weight;
    
    public Edge(Vertex argTarget, double argWeight)
    { target = argTarget; weight = argWeight; }
}

public class Dijkstra
{
    public static void computePaths(Vertex source)
    {
        source.minDistance = 0.;
        PriorityQueue<Vertex> vertexQueue = new PriorityQueue<Vertex>();
      	vertexQueue.add(source);

	while (!vertexQueue.isEmpty()) {
	    Vertex u = vertexQueue.poll();

            // Visit each edge exiting u
            for (Edge e : u.adjacencies)
            {
                Vertex v = e.target;
                double weight = e.weight;
                double distanceThroughU = u.minDistance + weight;
		if (distanceThroughU < v.minDistance) {
		    vertexQueue.remove(v);
		    v.minDistance = distanceThroughU ;
		    v.previous = u;
		    vertexQueue.add(v);
		}
            }
        }
    }

    public static List<Vertex> getShortestPathTo(Vertex target)
    {
        List<Vertex> path = new ArrayList<Vertex>();
        for (Vertex vertex = target; vertex != null; vertex = vertex.previous)
            path.add(vertex);
        Collections.reverse(path);
        return path;
    }

    public static void main(String[] args)
    {
    
    	int cost = 0 ;
    Vertex A = new Vertex("A");
	Vertex B = new Vertex("B");
	Vertex C = new Vertex("C");
	Vertex D = new Vertex("D");
	Vertex E = new Vertex("E");

	A.adjacencies = new Edge[]{ new Edge(B, 2),
	                             new Edge(C, 2),
	                             new Edge(D, 4),
	                             new Edge(E, 1)};
	
	B.adjacencies = new Edge[]{ new Edge(A, 2),
	                             new Edge(C, 3),
	                             new Edge(D, 2),
	                             new Edge(E, 3) };
	
	C.adjacencies = new Edge[]{ new Edge(A, 2),
								 new Edge(B, 3),
			 					 new Edge(D, 3),
			 					 new Edge(E, 5) 
			 					  };
	
	D.adjacencies = new Edge[]{  	new Edge(A, 4),
									new Edge(B, 2),
									new Edge(C, 3),
									new Edge(E, 1) };
	
	E.adjacencies = new Edge[]{ 	new Edge(A, 1),
									new Edge(B, 3),
									new Edge(C, 5),
									new Edge(D, 1)};
	
	Vertex[] vertices = { A, B, C, D, E };
        computePaths(A);
        for (Vertex v : vertices)
	{
	    System.out.println("Distance to " + v + ": " + v.minDistance);
	    List<Vertex> path = getShortestPathTo(v);
	    System.out.println("Path: " + path);
	    cost +=v.minDistance;
	    System.out.println(cost);
	}
    }
}
