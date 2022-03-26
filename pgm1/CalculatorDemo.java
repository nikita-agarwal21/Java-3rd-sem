package pgm1;

import java.util.Scanner;

public class CalculatorDemo {
	public static void main(String args[])
	{
		int m=0,n=0;int option;int result=0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the 2 numbers:");
		m=scanner.nextInt();
		n=scanner.nextInt();
		System.out.println("1.add 2.sub 3.mul 4.div 5.mod");
		System.out.println("enter your option");
		option=scanner.nextInt();
		switch(option)
		{
		case 1:result=Calculator.add(m,n);
		break;
		case 2:result=Calculator.sub(m,n);
		break;
		case 3:result=Calculator.mul(m,n);
		break;
		case 4:result=Calculator.div(m,n);
		break;
		case 5:result=Calculator.mod(m,n);
		break;
		}
		System.out.println("result="+result);
		
	}

}
