package cn;

import java.util.Scanner;

public class BellmanFordDemo {
	static Scanner scanner = new Scanner(System.in);
	static int MAX_VALUE = 999;
	public static void main(String[] args) {
	     int numberofvertices = 0;
	        int source;
	        int adjacencymatrix[][];        
	        
	        System.out.println("Enter the number of vertices");
	        numberofvertices = scanner.nextInt();
	        adjacencymatrix = readAdjacencyMatrix(numberofvertices);
	        
	        System.out.println("Enter the source vertex");
	        source = scanner.nextInt();
	        BellmanFord bellmanford = new BellmanFord(numberofvertices);
	        bellmanford.BellmanFordEvaluation(source, adjacencymatrix);
	        bellmanford.printDistances(source);
	        scanner.close();
	    
	}
	static int[][] readAdjacencyMatrix(int numberofvertices) {
	int adjacencymatrix[][] = new int[numberofvertices + 1][numberofvertices + 1];
	        System.out.println("Enter the adjacency matrix");
	        
	        for (int sourcenode = 1; sourcenode <= numberofvertices; sourcenode++)
	        {
	            for (int destinationnode = 1; destinationnode <= numberofvertices; destinationnode++)
	            {
	                adjacencymatrix[sourcenode][destinationnode] = scanner.nextInt();
	        if (sourcenode == destinationnode)
	                {
	        	adjacencymatrix[sourcenode][destinationnode] =0;
	        			                    continue;
	        			                }
	        			                if (adjacencymatrix[sourcenode][destinationnode] == 0)
	        			                {
	        			                    adjacencymatrix[sourcenode][destinationnode] =MAX_VALUE;
	        			                }
	        			            }
	        			        }        return adjacencymatrix;   } 
	                }
