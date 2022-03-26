package pgm1;

import java.util.Scanner;

public class CircleDemo {
public static void main(String args[])
{
	int r;
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter the radius");
	r=scanner.nextInt();
	Circle circle=new Circle(r);
	System.out.println("perimeter="+circle.findPerimeter());
	System.out.println("Area="+circle.findArea());
	
}

}
