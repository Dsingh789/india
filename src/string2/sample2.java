package string2;

public class sample2 
{
	public static void main(String[] args) 
	{
		String s1="i am from india";
		String s2="";
		String s3="mango";
		String s4="MANGO";
		String s5="hindustan";
		String s6="bababa";
		
		
		//15.split
		String ar[]=s1.split("");
		
		System.out.println("---");
		
		for(int i=0;i<=ar.length-1;i++)
		{
			System.out.println(ar[i]);
		}
		
		
		
		
		
		
		System.out.println("------15-----");
		//14.replace
		System.out.println(s3.replace("ngo", "ja"));
		System.out.println(s1.replace("india", "AMERICA"));
		System.out.println(s5.replace("hindu", "paki"));
		System.out.println("----14----");
		//13.substring
		System.out.println(s1.substring(2));
		System.out.println(s3.substring(2));
		System.out.println(s6.substring(2));
		System.out.println("----13-----");
		//12.empty
		System.out.println(s1.isEmpty());
		System.out.println(s2.isEmpty());
		System.out.println(s2.isBlank());
		System.out.println("----12-----");
		
		//11.startswith
		System.out.println(s3.startsWith("m"));
		System.out.println(s1.startsWith("am"));
		System.out.println("----11----");
		
		//10.endswith
		System.out.println(s3.endsWith("go"));
		System.out.println(s6.endsWith("ba"));
		System.out.println(s5.endsWith("na"));
		System.out.println("----10----");
		
		//9.charat
		System.out.println(s4.charAt(4));
		System.out.println(s5.charAt(7));
		System.out.println("----9----");
		//8.lastindexof
		System.out.println(s1.lastIndexOf('a'));
		System.out.println(s6.lastIndexOf('a'));
		System.out.println("-----8-----");
		//7.indexof
		System.out.println(s1.indexOf('a'));
		System.out.println(s4.indexOf('A'));
		System.out.println("-----7----");
		//6.equalsignore
		System.out.println(s3.equalsIgnoreCase(s4));
		System.out.println(s1.equalsIgnoreCase(s5));
		System.out.println(s2.equalsIgnoreCase(s3));
		
		System.out.println("----6----");
		//5.equals
		System.out.println(s3.equals(s4));
		System.out.println(s1.equals(s3));
		System.out.println(s4.equals(s5));
		
		System.out.println("------5-----");
		//4.tolowercase
		System.out.println(s4.toLowerCase());
		System.out.println(s3.toUpperCase());
		System.out.println(s1.toUpperCase());
		System.out.println("----4----");
		
		
		//3.concat
		System.out.println(s1.concat(" "+s3));
		System.out.println(s5.concat(s4));
		System.out.println("----3------");
		// 2.length
		System.out.println(s1.length());
		System.out.println(s2.length());
		System.out.println(s3.length());
		System.out.println("-----2-----");
		//1.contains
		System.out.println(s1.contains("from"));
		System.out.println(s2.contains("a"));
		System.out.println(s3.contains("o"));
		System.out.println("-----1----");
		
			
		
	}

}
