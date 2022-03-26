package exception;

public class NullPointer 
{
	public static void main(String args[])
	{

		String s="I am studying in fourth semester ";
		System.out.println(s.length());
		System.out.println(s.charAt(5));
		String s1="cse";
		String s2="cse";
		System.out.println(s1.equals(s2));
		String s3=null;//gives an exception cause a method is called on null object
		System.out.println(s3.length());
		
	}

}
