package mockquestion;

public class REVERSE2 
{
	public static void main(String[] args) 
	{
		String s1="DHEERAJ";
		String rev="";// not inside space
		for(int i=s1.length()-1;i>=0;i--)
		{
			rev=rev+s1.charAt(i);
		}
		System.out.println(rev);
	}

}
