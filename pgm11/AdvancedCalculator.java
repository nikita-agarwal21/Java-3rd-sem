package pgm11;

public class AdvancedCalculator extends Calculator 
{

	@Override
	public int max(int a, int b, int c) {
		// TODO Auto-generated method stub
		if (a>b&&a>c)
			return a;
		else if(b>a&&b>c)
			return b;
		else
			return c;
	}

	@Override
	public int min(int a, int b, int c) {
		// TODO Auto-generated method stub
		if (a<b&&a<c)
			return a;
		else if(b<a&&b<c)
			return b;
		else
			return c;
	}
	
}
