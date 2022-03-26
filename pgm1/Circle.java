package pgm1;

public class Circle {
private int r;



public Circle(int r) {
	
	this.r = r;
}
public int getR() {
	return r;
}
public void setR(int r) {
	this.r = r;
}
public  double findPerimeter()
{
return 2*Math.PI*r*r;
	}
public double findArea()
{return Math.PI*r*r;
	}



}
