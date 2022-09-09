package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IncreaseSizeOfArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> arraylist=new ArrayList<String>(4);
		arraylist.add("java");
		arraylist.add("Python");
		arraylist.add("C");
		arraylist.add("C++");
		arraylist.add("JavaScript");
		
		System.out.println(arraylist);
		
		arraylist.set(2,"SQL");
		System.out.println(arraylist);
		System.out.println(arraylist.size());
		
//		for(int i=0;i<arraylist.size();i++)
//		{
//			System.out.println(arraylist.get(i));
//		}
		
//		for(String word:arraylist)
//		{
//			System.out.println(word);
//		}
//		
		
		Iterator iterator=arraylist.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
		

	}

}
