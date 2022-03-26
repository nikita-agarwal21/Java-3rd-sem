package DAA;

import java.util.Scanner;

public class GreedyKnapsackDemo {
public static void main(String args[])
{
	int i,max_qty,m,n;
	Scanner sc=new Scanner(System.in);
	int arrItems[][]=new int[2][20];
	System.out.println("enter number of items(<=20)");
	n=sc.nextInt();
	System.out.println("enter the weight of each item:");
	for(i=0;i<n;i++)
		arrItems[0][i]=sc.nextInt();
	System.out.println("enter the profit values of each item:");
	for(i=0;i<n;i++)
		arrItems[1][i]=sc.nextInt();
	System.out.println("enter maximum volume of knapsack:");
	max_qty=sc.nextInt();
	m=max_qty;
			GreedyKnapsack gks=new GreedyKnapsack(n,m,arrItems);
			gks.greedy();
			sc.close();
			
	}
}
