package pgm1;

public class Promote {
	public static void main(String args[])
	{
		byte b=42;
		char c='a';
		int i=50000;
		short s=1024;
		float f=(float) 5.67;
		double d=0.1234;
		double result=(f*b)+(i/c)-(d*s);
		System.out.println("result="+result);
	}
	

}
