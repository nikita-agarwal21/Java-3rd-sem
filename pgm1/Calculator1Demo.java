package pgm1;

import java.util.Scanner;

public class Calculator1Demo
{
	public static void main(String args[])
	{
		int m=0,n=0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the 2 numbers:");
		m=scanner.nextInt();
		n=scanner.nextInt();
	CalculatorImpl c1=new CalculatorImpl();
	System.out.println("1.add="+c1.add(m,n));
	System.out.println("2.sub="+c1.sub(m,n));
	System.out.println("3.mul="+c1.multiply(m,n));
	System.out.println("4.div="+c1.divide(m,n));
	System.out.println("5.mod="+c1.modulo(m,n));
	
	
	}
	}
