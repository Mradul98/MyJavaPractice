package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListPractice_MradulUpdatedCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<String> list=List.of("Mradul","Amra","GitPractice");
		
		ArrayList<String> arraylist=new ArrayList<String>(list);
		
		Iterator iterator=arraylist.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
		
		

	}

}
