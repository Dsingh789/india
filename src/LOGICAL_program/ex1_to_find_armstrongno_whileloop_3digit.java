package LOGICAL_program;

public class ex1_to_find_armstrongno_whileloop_3digit 
{
	public static void main(String[] args)
	{
		
		int number=153,originalnumber,remainder,finalnumber=0;
		originalnumber=number;
		while(originalnumber>0)//153>0;15>0;1.0;0>0=looop break
		{
			remainder=originalnumber%10;//153/10=remainder is 3
			finalnumber+=Math.pow(remainder, 3);//3is no of digit present in int
			originalnumber=originalnumber/10;//153/10=15,1
		}
		if(finalnumber==number)
		{
			System.out.println(number +" is an armstrong number.");
		}
		else
		{
			System.out.println(number +" is not an armstrong number.");
		}
		
	}

}
