import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class ex3_linkedlist
{
	public static void main(String[] args) 
	{
		LinkedList ll=new LinkedList<>();
		ll.add("saras");
		ll.add("saras");
		ll.add(null);
		ll.add(null);
		ll.add(986);
		ll.add(985);
		ll.add(12.5f);
		ll.add(12.5f);
		System.out.println(ll);
		ll.remove("saras");
		System.out.println(ll);
		System.out.println(ll.set(1, "hari"));
		System.out.println(ll.size());
		System.out.println("----using itrator----");
		Iterator itr=ll.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("----foreachloop----");
		for(Object s2:ll)
		{
			System.out.println(s2);
		}
		System.out.println("----forloop----");
		for(int i=0;i<=ll.size()-1;i++)
		{
			System.out.println(ll.get(i));
		}
		System.out.println("----listitrator---");
		ListIterator lst=ll.listIterator();
		while(lst.hasNext())
		{
			System.out.println(lst.next());
		}
		System.out.println("----foreachloop----");
		for(Object s2:ll)
		{
			System.out.println(s2);
		}
		System.out.println("----forloop----");
		for(int i=0;i<=ll.size()-1;i++)
		{
			System.out.println(ll.get(i));
		}
	}

}
