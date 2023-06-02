package string2;

public class sample1
{
	public static void main(String[] args)
	{
		String s1="himalaya";
		String s2="my name is india";
		String s3="HEENA";//uppercase
		String s4="heena";  //lower case
		String s5="";
		//
		System.out.println(s1.length());
		System.out.println(s1.charAt(1));
		System.out.println(s2.equalsIgnoreCase(s5));
		System.out.println(s1.contains("h"));
		System.out.println(s2.toUpperCase());
		System.out.println(s1.isEmpty());
		System.out.println("-----1-----");
		//
		System.out.println(s3.toLowerCase());
		System.out.println(s4.toUpperCase());
		System.out.println(s1.toUpperCase());
		
		//
		System.out.println("-------2-----");
		System.out.println(s2.length());
		System.out.println(s2.contains("india"));
		System.out.println(s2.isEmpty());
		System.out.println(s2.charAt(5));
		System.out.println(s3.equalsIgnoreCase(s4));
		System.err.println(s2.equalsIgnoreCase(s1));
		//
		System.out.println("------3------");
		System.out.println(s1.equals(s2));
		System.out.println(s3.equals(s4));
		System.out.println(s3.equalsIgnoreCase(s4));
		System.out.println(s5.isBlank());
		System.out.println(s5.isEmpty());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
