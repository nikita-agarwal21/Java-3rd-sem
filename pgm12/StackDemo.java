package pgm12;

import java.util.Scanner;

public class StackDemo 
{
public static void main(String args[])
	{
		int choice=4,element = 0,top=-1,n;
		int[] a;
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter size:");
		n=scanner.nextInt();
		a=new int[n];
		Stack stack=new Stack(n,a,top);
			System.out.printf("1.enter the elements \t 2.pop the elements \t 3.display the stack \t 4.exit \n ");
			do
			{
				System.out.println("enter your option: ");
			choice=scanner.nextInt();
			switch(choice)
			{
				case 1:System.out.println("enter the elements:");
				  element =scanner.nextInt();
				try
				{
					stack.push(element);
				}
				catch(StackOverflowException sofe)
				{
					System.out.println("stack overflow.....");
				}
			break;
				case 2:try
				{
					stack.pop();
				}
				catch(StackUnderflowException sufe)
				{
					System.out.println("stack underflow....");
				}
			break;
				case 3:try
				{
					stack.display();			
				}
				catch(StackEmptyException see)
				{
					System.out.println("stack empty....");
				}
				break;
				case 4:
					System.exit(0);
			}
		}while(choice!=4);
	}
}
