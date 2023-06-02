package array2a;

public class ex1_array 
{
	public static void main(String[] args)
	{
		int ar1[]= {25,45,23,2,5};
		
		System.out.println(ar1.length);
		
		System.out.println("---print same info---");
		for(int i=0;i<=ar1.length-1;i++)
		{
			System.out.println(ar1[i]);
		}
		System.out.println("-----print in reverse order---");
		
		for(int i=ar1.length-1;i>=0;i--)
		{
			System.out.println(ar1[i]);
		}
	}

}
