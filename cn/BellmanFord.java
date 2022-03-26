package cn;

public class BellmanFord {
	  private int distances[];
	    private int numberofvertices;
	    public static final int MAX_VALUE = 999;
	public BellmanFord(int numberofvertices)
	    {
	        this.numberofvertices = numberofvertices;
	        distances = new int[numberofvertices + 1];
	    }
	public void BellmanFordEvaluation(int source, int adjacencymatrix[][])
	    {
	        for (int node = 1; node <= numberofvertices; node++)
	        {
	            distances[node] = MAX_VALUE;
	        }
	        distances[source] = 0;
	        for (int node = 1; node <= numberofvertices - 1; node++)
	        {
	         System.out.println("\nIteration" + node);
	            for (int sourcenode = 1; sourcenode <= numberofvertices; sourcenode++)
	            {
	                for (int destinationnode = 1; destinationnode<= numberofvertices; destinationnode++)
	                {
	                    if (adjacencymatrix[sourcenode][destinationnode] != MAX_VALUE)
	                    {
	                        if (distances[destinationnode] > distances[sourcenode] + adjacencymatrix[sourcenode][destinationnode]) {
	                            
	System.out.println(distances[destinationnode] + "is greater than" + distances[sourcenode] + "+" + adjacencymatrix[sourcenode][destinationnode] + "=" + (distances[sourcenode] + adjacencymatrix[sourcenode][destinationnode]));
	distances[destinationnode] = distances[sourcenode] + adjacencymatrix[sourcenode][destinationnode];                         
			                        }
			                    }
			                }
			             }
			            System.out.println("\nThe Distances... After Iteration " + node + " ....");
			                for (int node1 = 1; node1 <= numberofvertices; node1++)
			             {
			                 System.out.print(distances[node1] + "\t");
			             }
			        }
			        for (int sourcenode = 1; sourcenode <= numberofvertices; sourcenode++)
			        {
			            for (int destinationnode = 1; destinationnode <= numberofvertices; destinationnode++)
			            {
			                if (adjacencymatrix[sourcenode][destinationnode] != MAX_VALUE)
			                {
			                    if (distances[destinationnode] > distances[sourcenode] + adjacencymatrix[sourcenode][destinationnode]) {
			                     System.out.println("The Graph contains negative egde cycle");
			                    
			System.out.println(distances[destinationnode] + "is greater than" + distances[sourcenode] + "+" + adjacencymatrix[sourcenode][destinationnode] + "=" + (distances[sourcenode] + adjacencymatrix[sourcenode][destinationnode]));
			                    }
			                        
			                }
			            }
			        }
			    }
			public void printDistances(int source) {
				for (int vertex = 1; vertex <= numberofvertices; vertex++)
						        {
						            System.out.println("\ndistance of source  " +source + " to "  + vertex + " is " + distances[vertex]);
						        }
						}
						    

			}

