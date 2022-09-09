package Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedList_Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list=List.of("Mrdaul","Shikhar","Arjit","Adarash","Amardeep","Amandeep");
		LinkedList<String> linkedlist=new LinkedList<>(list);
		System.out.println(linkedlist);
		
		linkedlist.add(1,"Atul");
		System.out.println(linkedlist);
		
		Iterator iterator=linkedlist.iterator();
		
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		

	}

}
