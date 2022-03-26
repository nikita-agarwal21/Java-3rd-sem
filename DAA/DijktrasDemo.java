package DAA;

import java.util.Scanner;

public class DijktrasDemo {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("entet the no.of vrtices");
		int numOfVertices=sc.nextInt();
		int graph[][]=new int[numOfVertices][numOfVertices];
		System.out.println("enter the cost matrix:");
		for(int i=0;i<numOfVertices;i++)
			for(int j=0;j<numOfVertices;j++)
				graph[i][j]=sc.nextInt();
		System.out.println("enter the source matrix:");
				int src=sc.nextInt();
				sc.close();
				Dijkstra dkt=new Dijkstra(graph,src,numOfVertices);
				dkt.process();
				dkt.display();
	}
}
