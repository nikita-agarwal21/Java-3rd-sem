package pgm1;

import java.util.Scanner;

public class MaxMin {
	public static void main(String args[])
	{

		double a,b;
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter two numbers: ");
		a=scanner.nextDouble();
		b=scanner.nextDouble();
		System.out.println("max="+Math.max(a, b));
		System.out.println("min="+Math.min(a, b));
	}

}
