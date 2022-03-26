package pgm1;

public class CalculatorImpl implements Calculator1//for interface add implements
{

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public int sub(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public int multiply(int a, int b) {
		// TODO Auto-generated method stub
		return a*b;
	}

	@Override
	public int divide(int a, int b) {
		// TODO Auto-generated method stub
		return a/b;
	}

	@Override
	public int modulo(int a, int b) {
		// TODO Auto-generated method stub
		return a%b;
	}
	
}
