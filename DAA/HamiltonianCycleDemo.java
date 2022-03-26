package DAA;

import java.util.Scanner;

public class HamiltonianCycleDemo 
{
	public static void main(String args[])
	{
		int n;
		int [][] graph;
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the no.of vertices");
		n=sc.nextInt();
		graph=new int[n][n];
		System.out.println("enter d elements of adjacency matrix:");
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++)
				graph[i][j]=sc.nextInt();
		Hamiltoniancycle hamiltonian=new Hamiltoniancycle(n,graph);
		hamiltonian.hamCycle();
		sc.close();
	}
}
