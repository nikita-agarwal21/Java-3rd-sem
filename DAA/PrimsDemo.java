package DAA;

import java.util.Scanner;

public class PrimsDemo 
{
	public static void main(String [] args)
	{
		int n;
		int graph[][];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of noes: ");
		n=sc.nextInt();
		graph=new int[n][n];
		System.out.println("enter the weighted graph:");
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++)
				graph[i][j]=sc.nextInt();
		Prims prims=new Prims(n,graph);
		prims.primMST();
		System.out.println("edge weight");
		System.out.println(prims);
	}

}
