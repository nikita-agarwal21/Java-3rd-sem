package pgm1;

public class BoxWeightDemo {
	public static void main(String args[])
	{
		BoxWeight box1=new BoxWeight(5,6,7,8);
		BoxWeight box2=new BoxWeight(10,20,30,40);
		double vol;
		vol=box1.volume();
		
		System.out.println("volume of the box1="+vol);
		System.out.println("weight of the box1="+box1.weight);
		vol=box2.volume();
		System.out.println("volume of the box2="+vol);
		System.out.println("weight of the box2="+box2.weight);
		
		
	}

}
