package maharastra;

public class sample1 
{
	public static void main(String[] args) 
	{
		a1(9,8);
		a1(6,8);
		
		System.out.println("-----");
		
		sample1 b1=new sample1();
		
		b1.a2(6,2);
		b1.a2(63,7);
		
		}
	public static void a1(int n1,int n2)
	{
		System.out.println(n1-n2);
	}
	public void a2(int n3,int n4)
	{
		System.out.println(n3/n4);
	}
	

}
