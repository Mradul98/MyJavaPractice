package Collection;

import java.util.Iterator;
import java.util.List;

import java.util.TreeSet;

public class TreeSet_Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = List.of(120, 99, 78, 45, 6, 70, 23, 4, 67);

		TreeSet<Integer> treelist = new TreeSet<>(list);
		
//		System.out.println(treelist);
//		
//		Iterator iterator=treelist.iterator();
//		while(iterator.hasNext())
//		{
//			System.out.println(iterator.next());
//		}
		
		System.out.println(treelist.lower(78));

	}

}
