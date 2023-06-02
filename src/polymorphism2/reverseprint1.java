package polymorphism2;

public class reverseprint1
{
	public static void main(String[] args) 
	{
		int i;
		String line="AIDNI";
		String reverse="";
		for(i=line.length()-1; i>=0; i--)
		{
			reverse=reverse+line.charAt(i);
			
		}
		System.out.println(reverse);
	}

}
