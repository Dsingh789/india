package mockquestion;

public class paalindrum_number
{
	public static void main(String[]args)
	{
		String s4="98889";
		String rev="";
		
		for(int i=s4.length()-1;i>=0;i--)
		{
			rev=rev+s4.charAt(i);
		}
		if(s4.equals(rev))
		{
			System.out.println("given no is paalindrum");
			
		}
		else
		{
			System.out.println("given no is not paalindrum");
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	

}
