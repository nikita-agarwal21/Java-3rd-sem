package pgm1;

public class BoxDemo2 {
	public static void main(String args[])
	{
		Box box1=new Box();
		Box box2=new Box();
		box1.width=10;
		box1.depth=20;
		box1.height=30;
		double vol1 = box1.width*box1.depth*box1.height;
		System.out.println("volume="+vol1);
		box2.width=40;
		box2.depth=50;
		box2.height=60;
		double vol2 = box2.width*box2.depth*box2.height;
		System.out.println("volume="+vol2);
		
		
		
	}

}
