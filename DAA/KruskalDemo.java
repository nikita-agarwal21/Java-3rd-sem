package DAA;

import java.util.Scanner;

public class KruskalDemo {
	public static void main(String ars[])
	{
		int a[][]=new int[10][10];
		int i,j;
		System.out.println("enter the number of vertices of the kruskal graph:");
		Scanner sc=new Scanner(System.in);
		int n;
		n=sc.nextInt();
		System.out.println("enter the weighted matrix :");
		for(i=1;i<=n;i++)
			for(j=1;j<=n;j++)
				a[i][j]=sc.nextInt();
		
	Kruskal k=new Kruskal();
	k.krkl(a,n);
	sc.close();
	}

}
