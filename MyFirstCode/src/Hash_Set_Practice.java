import java.util.HashSet;
import java.util.Iterator;

public class Hash_Set_Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> hastset=new HashSet<String>(); // Will use for unique data
		
		hastset.add("Himanshu");
		hastset.add("Priyanshu");
		hastset.add("Mradul");
		hastset.add("Niket");
		Iterator<String> it=hastset.iterator();
		String firstvalue=it.next();

		
		
		System.out.println(firstvalue);

	}

}
