package DAA;

import java.util.Scanner;

public class TSPDemo
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("entet the no.of nodes");
		int n=sc.nextInt();
		int weight[][]=new int[n][n];
		System.out.println("enter the weight of edges of d graph:");
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++)
				{
				weight[i][j]=sc.nextInt();
				}
		System.out.println("starting node assumed to be node 1.");
		TSP tsp=new TSP(n,weight);
		tsp.eval(n,weight);
		
				sc.close();
}
}
