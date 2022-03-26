package exception;

import java.util.Scanner;

public class ArthmeticException //when ever the denominator is 0 it throws an exception
{

	public static void main(String args[])
	{

		int a,b,c;
		Scanner scanner=new Scanner(System.in);
				System.out.println("enter two integers");
		a=scanner.nextInt();
		b=scanner.nextInt();
		c=a/b;
		System.out.println("value of c="+c);
	}
}
