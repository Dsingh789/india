package maharastra;

public class mumbai 
{
	public static void main(String[]args)
	{
		m1(10,20);
		m1(5,6);
		m1(50,3);
		
		System.out.println("------"); 
		
		mumbai d1=new mumbai();
		d1.m2(12,6);//42
		d1.m2(23,3);//12
		d1.m2(144,12);
	}
	//md with integer,integer parameter
	public static void m1(int n1,int n2)
	{
		System.out.println(n1+n2);
	}
	public void m2(int n3,int n4)
	{
		System.out.println(n3/n4);
		
	}

}
