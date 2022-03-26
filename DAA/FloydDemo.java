package DAA;

import java.util.Scanner;

public class FloydDemo 
{
	private static final int INFINITY = 999;

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no.of vertices");
		int numOfVertices=sc.nextInt();
		int graph[][]=new int[numOfVertices][numOfVertices];
		System.out.println("enter the weighted matrix of d graph:");
		for(int i=0;i<numOfVertices;i++)
			{
			for(int j=0;j<numOfVertices;j++)
				{
				graph[i][j]=sc.nextInt();
				if (i==j)
					{graph[i][j]=0;
				continue;}
		if(graph[i][j]==0)
		{
			graph[i][j]=INFINITY;
		}
	}
}
System.out.println("the shortest path of the  graph");
FloydWarshallShortestPath fwsp=new FloydWarshallShortestPath(numOfVertices);
fwsp.floydwarshall(graph);
sc.close();
}
}
