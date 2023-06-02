package maharastra;

public class sample3 
{
	public static void main(String[] args) 
	{
		studentname("dheeraj");
		studentname("nitish");
		
		System.out.println("----------");
		
		studentfullname("abc","xyz");
		studentfullname("abc1","xyz1");
		
		System.out.println("-----------");
		
		sample4.studentinfo("priya", 101, 65.5f, 'A');
		sample4.studentinfo("gabar", 102, 75.5f, 'B');
		}
public static void studentname(String s1)
{
	System.out.println(s1);
}
public static void studentfullname(String fname,String lname)
{
	System.out.println(fname+" "+lname);
}
}