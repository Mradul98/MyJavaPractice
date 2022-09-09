package String_Practice;

public class TotalCharacter_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str="Hello Mradul";
		//System.out.println(str.length());
		int count =0;
		
		for(int i=0;i<str.length();i++)
		{
			if((str.charAt(i))!=' ')
					{
				 count=count+1;
				
					}
		}
		System.out.println(count);

	}

}
