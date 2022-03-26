package DAA;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfSubsetDemo
{
	public static void main(String [] args)
	{
		int [] a;
		int count;
		int desiredSum;
		int ElementsinSet;
		int i;
		int totalSum=0;
		int[] visited;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of elements in d set:");
		ElementsinSet=sc.nextInt();
		a=new int[ElementsinSet];
		visited=new int[a.length];
		for(i=0;i<a.length;i++)
		{
			System.out.println("enter the"+(i+1)+"Element");
			a[i]=sc.nextInt();
		}
		System.out.println("enter the desired sum:");
		desiredSum=sc.nextInt();
		Arrays.sort(a);
		System.out.println("elements in d set after sorting:");
		for(i=0;i<a.length;i++)
		{
			System.out.println(""+a[i]);
		}
		for(int item:a)
			totalSum+=item;
		if(totalSum<desiredSum ||a[0]>desiredSum)
		{
			System.out.println("no solution");
		}
		else
		{
			SumOfSubsets SumObj=new SumOfSubsets(a,visited,desiredSum,totalSum);
			count=0;
			SumObj.sumOfSubsets(0, 0, totalSum);
		}
	}	
}
