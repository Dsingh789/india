package mockquestion;

public class palindrome_string1 
{
	public static void main(String[] args)
	{
		String s1="aba";
		String rev="";
		
		for(int i=s1.length()-1;i>=0;i--)
		{
			rev=rev+s1.charAt(i);
		}
		System.out.println(rev);
		
		if(s1.equals(rev))
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}
		
		
	}

}
