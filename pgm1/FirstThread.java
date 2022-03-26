package pgm1;

import java.util.Random;

public class FirstThread extends Thread
{
public void run()
{
	int num=0;
	Random r=new Random();
	for(int i=0;i<5;i++)
	{
		num=r.nextInt(100);
		System.out.println(" ");
		System.out.println("number="+num);
		Square square=new Square(num);
		Thread squareThread=new Thread(square);
		squareThread.start();
		Cube cube=new Cube(num);
		Thread cubeThread=new Thread(cube);
		cubeThread.start();
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException ie)
		{
			System.out.println("ie");
		}
	}
}
}
