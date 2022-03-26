package pgm2;

import java.util.Scanner;

public class MaxMinimumDemo {
public static void main(String args[])
{
	int n;
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter thenumber of elements:");
	n=scanner.nextInt();
	int[] a=new int[10];
	System.out.println("enter the elements:");
	for(int i=0;i<=n-1;i++)
		a[i]=scanner.nextInt();
	int max = MaxMinimum.big(a, n);
			System.out.println(max);
	int min =  MaxMinimum.small(a,n);
	System.out.println(min);
			
}
}
