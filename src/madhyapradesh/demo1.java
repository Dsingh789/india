package madhyapradesh;

public class demo1
{
	public static void main(String[] args) 
	{
		int a1=12;
		int a2=0;
		int c;
		
		try
		{
			c=a1/a2;
			System.out.println(c);  //risky code
		}
		catch(ArithmeticException b1)// exception msg enter and object name
		{
			System.out.println("asd");
		}
		
		System.out.println("hi");//2
		System.out.println("hello");///3
		
		
		
	}
}
