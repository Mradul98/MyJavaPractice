package Collection;

import java.util.ArrayList;
import java.util.List;

public class arrayList_Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<String> fruits=List.of("Apple","Banana","Orange","Mango");
		
		List<String> vegitable=List.of("Potato","tomato","Chilli");
		
		
		ArrayList<String> list=new ArrayList<String>(fruits);
		
		list.add(2, "Grapes");
		System.out.println(list);
		
		list.addAll(vegitable);// If we want to add the list interface in the arraylist
		System.out.println(list);
		
		list.set(7,"Onion");
		System.out.println(list);
		
		list.remove(3);
		System.out.println(list);


	}

}
