package up;

public class paalindrome2 
{
	
	
	
	public static void main(String[] args)
	{
		String s1="madam";
		String rev="";  // not inside space
		
		for(int i=s1.length()-1;i>=0;i--)
		{
			rev=rev+s1.charAt(i);
		}
		
		System.out.println(rev);
		
		if(s1.equals(rev))
		{
			System.out.println("palindrum");
		}
		else
		{
			System.out.println("not paalindrum");
		}
		
	
	
	
	
	
	
	
	
	}	
	
	

}
