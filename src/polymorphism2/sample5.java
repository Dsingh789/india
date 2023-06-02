package polymorphism2;

public class sample5
{
	//ex compiletimepolymorphism
	
	public void m2(int n1,int n2)
	{
		System.out.println(n1+n2);
	}
	public void m2(int n3,int n4,int n5)
	{
		System.out.println(n3+n4+n5);
		
	}
	public static void main(String[] args)
	{
		sample5 s5=new sample5();            //same class
		s5.m2(10, 20);
		s5.m2(2, 25, 23);
	}

}
