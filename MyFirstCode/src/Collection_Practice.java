import java.util.ArrayList;

public class Collection_Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Array list is dynamic is size , we can add or remove anything from array list very easly.
		
		
		ArrayList<String> arraylist=new ArrayList<String>();
		arraylist.add("Mradul");
		arraylist.add("Niket");
		arraylist.add("Rajesh");
		arraylist.add("Meena");
		arraylist.add("Himanshu");
		
		System.out.println(arraylist);
		
		
		arraylist.remove(0);
		
		System.out.println(arraylist);
		
		
		

	}
}


