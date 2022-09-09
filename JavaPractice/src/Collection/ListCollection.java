package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list=List.of("Dog","Cat","Bat","elephant","aunt","fox","buffalow");
		
		ArrayList<String> arraylist=new ArrayList<String>(list);
		
//		for(String word:arraylist)
//		{
//			if(word.endsWith("at"))
//			{
//				System.out.println(word);
//			}
//		}
		
		Iterator<String> iterator=arraylist.iterator();
		
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
		arraylist.remove(2);
		
		System.out.println(arraylist);

	}

}
