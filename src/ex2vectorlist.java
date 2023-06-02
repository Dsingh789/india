import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class ex2vectorlist 
{
	public static void main(String[] args)
	{
		
		Vector v1=new Vector<>();
		v1.add("divyanshu");
		v1.add("divyanshu");
		v1.add(null);
		v1.add(null);
		v1.add('A');
		v1.add('A');
		v1.add(1010);
		v1.add(1010);
		v1.add(89.5f);
		v1.add(89.5f);
		System.out.println(v1);
		System.out.println(v1.size());
		v1.remove(1);
		System.out.println(v1);
		
		System.out.println(v1.subList(3, 5));
		
		System.out.println(v1.isEmpty());
		System.out.println(v1.size());
		System.out.println(v1.lastElement());
		v1.set(0, "kgf");
		System.out.println(v1);
		//using itrator
		Iterator itr=v1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("-----using forloop----");
		for(int i=0;i<=v1.size()-1;i++)
		{
			System.out.println(v1.get(i));
		}
		System.out.println("-----using eachloop-----");
		for(Object s2:v1)
		{
			System.out.println(s2);
		}
		//using listitrator
		ListIterator lst=v1.listIterator();
		System.out.println("----using listitrator---");
		while(lst.hasNext())
		{
			System.out.println(lst.next());
		}
		System.out.println("-----usingfor-----");
		for(int i=0;i<=v1.size()-1;i++)
		{
			System.out.println(v1.get(i));
		}
		System.out.println("-----using eachloop-----");
		for(Object s2:v1)
		{
			System.out.println(s2);
		}
		System.out.println("----using enumeration----");
		
		Enumeration enu=v1.elements();
		while(enu.hasMoreElements())
		{
			System.out.println(enu.nextElement());
		}
		
		System.out.println("-----using eachloop-----");
		for(Object s2:v1)
		{
			System.out.println(s2);
		}
		
	}

}
