import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ex1_itratorlist
{
	public static void main(String[] args) 
	{
		ArrayList a1=new ArrayList(8);
		a1.add("kuldeep");
		a1.add("mp");
		a1.add("mechanical engg");
		a1.add('A');
		a1.add(102);
		a1.add(null);
		a1.add(null);
		a1.add('B');
		a1.add(87.5f);
		a1.add("kuldeep");
		a1.add(102);
		System.out.println(a1);
		a1.remove(0);
		System.out.println(a1);
		System.out.println("---using itrator cursor---");
		Iterator itr=a1.iterator();
		while(itr.hasNext())
		{
			System.out.print(" "+itr.next());
		}
		System.out.println();
		System.out.println("--list itrator---");
		ListIterator lst=a1.listIterator();
		while(lst.hasNext())
		{
			System.out.print(" "+lst.next());
		}
		//forloop
		System.out.println("---------forloop-----");
		for(int i=0;i<=a1.size()-1;i++)
		{
			System.out.println(a1.get(i));
		}
		System.out.println("---foreachloop---");
		for(Object s1:a1)
		{
			System.out.println(s1);
		}
		
		
		
	}

}
