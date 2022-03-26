package DAA;

import java.util.Scanner;

public class DyanamicKnapsackDemo {
	public static void main(String args[])
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the number of items:");
		int n=scanner.nextInt();
		System.out.println("enter weight for"+ n +"elements");
		int wt[]=new int[n+1];
		for(int i=1;i<=n;i++)
			wt[i]=scanner.nextInt();
		System.out.println("enter values for"+ n +"elements");
		int val[]=new int[n+1];
		for(int i=1;i<=n;i++)
			val[i]=scanner.nextInt();
		System.out.println("enter the maximum capacity of the knapsack:");
		int m=scanner.nextInt();
		DyanamicKnapsack dsk=new DyanamicKnapsack(n,wt,val,m);
		dsk.process();
		scanner.close();
		
	}
}
