package applet;

public class MyThreadDemo 
{
		public static void main(String args[])
		{
			MyThread t1=new MyThread("one");
			MyThread t2=new MyThread("two");
			MyThread t3=new MyThread("three");
			System.out.println("main thread terminating");	
		}
}


