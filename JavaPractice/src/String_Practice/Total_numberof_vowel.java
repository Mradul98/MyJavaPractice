package String_Practice;

public class Total_numberof_vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="My name is mradul";
		int v=0;
		int c=0;
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='a' ||str.charAt(i)== 'e'||str.charAt(i)=='i' || str.charAt(i)=='o')
			{
				v=v+1;
			}
			else
			{
				if(str.charAt(i)==' ')
				{
					continue;
				}
				else
				{
				c=c+1;
			}
		}
		
		

	}
		System.out.println(v);
		System.out.println(c);
}
}

