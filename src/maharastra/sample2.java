package maharastra;

public class sample2
{
	public static void main(String[] args)
	{
		m1(27,25);
		
		System.out.println("------");
		
		sample2 a2=new sample2();
		a2.m2(45,42);
		a2.m2(12,10);
		
	}
	public static void m1(int n1,int n2)
	{
		System.out.println(n1/n2);
	}
	public void m2(int n3,int n4)
	{
		System.out.println(n3-n4);
	}
}
