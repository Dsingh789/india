import java.util.HashSet;
import java.util.Iterator;

public class ex4_hashset 
{
	public static void main(String[] args)
	{
		HashSet hs=new HashSet<>();
		hs.add("ranjit");
		hs.add("ranjit");
		hs.add(null);
		hs.add(null);
		hs.add(101);
		hs.add(101);
		hs.add(98.5f);
		hs.add(98.5f);
		System.out.println(hs);
		hs.remove(null);
		System.out.println(hs);
		System.out.println(hs.size());
		System.out.println(hs.contains(101));
		System.out.println("-----using itrator---");
		Iterator itr=hs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("----foreachloop----");
		for(Object s2:hs)
		{
			System.out.println(s2);
		}
		
		
		
		
		
		
	}

}
