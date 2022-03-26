package pgm12;

public class Stack {
	private int n;
	private int[] a;
	private int top;
	public Stack(int n, int[] a, int top) {
		this.n = n;
		this.a = a;
		this.top = top;
	}
	
	
	public void push(int pushedElement)throws StackOverflowException
	{
		if(top<n-1)
		{
			top++;
			a[top]=pushedElement;
		}
		else
			throw  new StackOverflowException();
	}

	public void pop() throws StackUnderflowException
	{	
		if (top>=0)
			top--;
		else
			throw new StackUnderflowException();
	}
	
	public void display() throws StackEmptyException
	{
		if(top>=0)
		{
			System.out.println("elements in stack:");
			for(int i=0;i<=top;i++)
				System.out.println(a[i]);
		}
		else 
			throw new StackEmptyException();		
	}
	
}



