import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayToArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] arr= {"a","b","c","d"};
		
		List<String> list=new ArrayList<String>();
		Collections.addAll(list,arr);
		System.out.println(list);
		

	}

}
