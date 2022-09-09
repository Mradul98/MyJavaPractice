package Collection;

import java.util.HashMap;

public class NumberOfWordsInstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str="my name is mradul and mradul love java";
		
		HashMap<String,Integer> hasmap=new HashMap<>();
		
		String [] words=str.split(" ");
		
		for(String word:words)
		{
			Integer integer=hasmap.get(word);
			
			if(integer==null)
			{
				hasmap.put(word,1);
			}
			
			else
			{
				hasmap.put(word,integer+1);
			}
		}
		System.out.println(hasmap);
		

	}

}
