package pgm1;

public class BoxDemo {
	public static void main(String args[])
	{
		Box box=new Box();
		double vol;
		box.width=10;
		box.depth=20;
		box.height=30;
		vol=box.width*box.depth*box.height;
		System.out.println("volume="+vol);
		
	}
}
