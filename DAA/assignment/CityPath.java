package assignment;

import java.util.Scanner;

public class CityPath {
	public static void main(String args[])
	{
		int n,k,x,count=0,i,j,s,d;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number of cities:");
		n=sc.nextInt();
		System.out.println("enter the number of cities routes: ");
		x=sc.nextInt();
		System.out.println("amount earned per hour:");
		k=sc.nextInt();

		int cost[][]=new int[n][n] ;int time[][]=new int[n][n];
		System.out.println("the cost matrix");
		for( i=0;i<n;i++)
			for( j=0;j<n;j++)
				cost[i][j]=sc.nextInt();
		System.out.println("th time for the delay:");
		for( i=0;i<n;i++)
			for(j=0;j<n;j++)
					time[i][j]=sc.nextInt();
		
	}

}
