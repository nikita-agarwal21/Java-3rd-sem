package pgm1;

public class Cube implements Runnable
{
private int x;
public Cube(int x)
{
	this.x=x;
	}
public void run()
{
	System.out.println("cube of"+x+"="+x*x*x);
	}
}
