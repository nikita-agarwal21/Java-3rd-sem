package pgm11;

public abstract class Calculator {
	public int max(int a,int b)
	{
		if (a>b)
			return a;
		else 
			return b;
		}
	public int min(int a,int b)
	{
		if (a<b)
			return a;
		else
			return b;
	}
	public abstract int max(int a,int b,int c);
	public abstract int min(int a,int b,int c);
}
