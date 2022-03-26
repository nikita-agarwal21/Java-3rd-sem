package exception;

import java.util.Scanner;

public class Exception {
	public static void main(String args[])
	{
		int a;
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the integer:");
		a=scanner.nextInt();//input mismatch exception where in we give an integer as declaration but try to access string
		System.out.println(a);
		
	}

}
