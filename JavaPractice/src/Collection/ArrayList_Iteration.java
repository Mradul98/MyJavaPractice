package Collection;

import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;

public class ArrayList_Iteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<String> arraylist=new ArrayList<String>();
		arraylist.add("Anjali");
		arraylist.add("Monika");
		arraylist.add("Nikita");
		arraylist.add("Priyanka");
		arraylist.add("Rani");
		arraylist.add("Aarti");
		arraylist.add("Sheema");
		//System.out.println(arraylist);
		
		
//		for(int i=0;i<arraylist.size();i++) //first way of iteration
//		{
//			System.out.println(arraylist.get(i));
//		}
//		
		for(String word:arraylist)
		{
			System.out.println(word);
		}
		
		
		
		

	}

}
