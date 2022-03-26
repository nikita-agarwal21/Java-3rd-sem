package pgm1;

public class RefDemo {
	public static void main(String args[])
	{
		Box planBox=new Box();
		Box weight =new BoxWeight(5,6,7,8);
		double vol;
		BoxWeight b;
		vol=b.volume();
		System.out.println(vol);
		planBox =b;
		vol=planBox.volume();//error can accaess only its class but not ht esubclass property
		System.out.println(planBox.weight);
	}

}
