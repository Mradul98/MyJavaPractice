package Collection;

import java.util.List;
import java.util.TreeSet;

public class Tree_Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Character> list=List.of('A','B','D','A','Z','T','L');
		
		TreeSet<Character> treeset=new TreeSet<>(list);
		System.out.println(treeset);

	}

}
