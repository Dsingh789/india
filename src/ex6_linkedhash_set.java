import java.util.Iterator;
import java.util.LinkedHashSet;

public class ex6_linkedhash_set
{
	public static void main(String[] args)
	{
		LinkedHashSet<String> lh=new LinkedHashSet<String>();
		
		lh.add("amar");
		lh.add("akbar");
		lh.add("sarukhan");
		lh.add(null);
		lh.add(null);
		lh.add("amar");
		lh.add("bushan");
		lh.add("dheeraj");
		
		System.out.println(lh);
		lh.remove(null);
		System.out.println(lh);
		System.out.println(lh.size());
		System.out.println("------itratorcursor----");
		Iterator itr=lh.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("---using foreachloop----");
		for(Object s1:lh)
		{
			System.out.println(s1);
		}
		
		
		
	}

}
