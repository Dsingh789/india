package madhyapradesh;

public class demo2
{
	public static void main(String[] args)
	{
		String s1="abcd";//0123
		try
		{
		
		System.out.println(s1.charAt(4));//risky code
		}
		catch(StringIndexOutOfBoundsException a1)
		{
		System.out.println("hello");
	}
		System.out.println(s1.length());
		System.out.println(s1.isEmpty());
		System.out.println(s1.toUpperCase());
		
	}
}
