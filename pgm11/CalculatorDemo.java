package pgm11;

public class CalculatorDemo {
	public static void main(String args[])
	{
		/*Calculator c=new Calculator(); cant be created as its an abstract class*/
		Calculator c=new AdvancedCalculator();
		System.out.println(c.max(10,20));
		System.out.println(c.min(15,20));
		System.out.println(c.max(60,20,30));
		System.out.println(c.min(60,20,30));
	}
}
