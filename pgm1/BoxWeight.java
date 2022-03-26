package pgm1;

public class BoxWeight extends Box
{
	double weight;
	public BoxWeight(double w,double h,double d,double m )
	{
		width =w;
		height=h;
		depth=d;
		weight=m;
		
	}
	public double volume()
	{
		return width*height*depth;
	}
}
