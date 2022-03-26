package pgm1;

import java.util.Scanner;

public class CostumerDemo {
	public static void main(String args[])
	{

		String name;String dateOfBirth;
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter name and date of birth");
		name=scanner.next();
		dateOfBirth=scanner.next();
		Costumer costumer=new Costumer(name, dateOfBirth);
		System.out.println(costumer);
		
		
	}

}
