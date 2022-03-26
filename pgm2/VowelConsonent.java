package pgm1;

import java.util.Scanner;

public class VowelConsonent {
	
public static void main(String args[]) {
	String s;
	Scanner scanner=new Scanner(System.in);
			System.out.println("enter the character:");
	s=scanner.next();
	boolean flag=false;
	switch(s)
	{
	case :"a"; case :"A";
	case :"e"; case :"E";
	case :"i"; case :"I";
	case :"o"; case :"O";
	flag=true;
	break;
	
	}
	if(flag==true)
	 System.out.println("vowel");
	else
		System.out.println("consonent");
	
}
}
