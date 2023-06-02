package madhyapradesh;

public class fabnocci
{
	public static void main(String[] args)
	{
		int a=0;
		int b=1;
		int c;
		for(int i=0;i<5;i++)//  row
		{
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
	}

}
