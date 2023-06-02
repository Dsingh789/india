import java.util.Iterator;
import java.util.TreeSet;

public class ex5_treeset 
{
	public static void main(String[] args)
	{
		TreeSet<String> ts=new TreeSet<String>();
		ts.add("bhushan");
		ts.add("bhushan");
		ts.add("prachhi");
		ts.add("pooja");
		ts.add("hariom");
		ts.add("pratap");
		ts.add("saqnjay");
		System.out.println(ts);
		System.out.println("-----using itrator----");
		Iterator itr=ts.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("-----using foreachloop----");
		for(Object s2:ts)
		{
			System.out.println(s2);
		}
		
		
		
		
		
		
		
		
	}

}
