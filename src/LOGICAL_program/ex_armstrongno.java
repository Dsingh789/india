package LOGICAL_program;

public class ex_armstrongno 
{
	public static void main(String[] args)
	{
		int number=154,originalnumber,remainder,finalnumber=0;
		originalnumber=number;
		while(originalnumber>0)
		{
			remainder=originalnumber%10;
			finalnumber+=Math.pow(remainder, 3);
			originalnumber=originalnumber/10;
			
			
		}
		if(number==originalnumber)
		{
			System.out.println(number +"is armstrong");
		}
		else
		{
			System.out.println(number+" is not armstrong");
		}
		
		
	}

	
	

}
