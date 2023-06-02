package array2a;

import java.util.Arrays;

public class ex3_string_sorting 
{
	public static void main(String[] args)
	{
		
	
	// decleration and intilization in same line
	
	String a2[]= {"gunja","rahul","salman","gyulshan"};

	System.out.println(a2.length);
	System.out.println("------ print in alpha bet order form-----");
	Arrays.sort(a2);//in built class in java
	
	for(int i=0;i<=a2.length-1;i++)
	{
		System.out.println(a2[i]);
	}
	}

}
