
public class MyChar {
	
	private char c;
	
	MyChar(char c)
	{
		this.c=c;
	}
	
	public boolean IsVowel()
	{
		if(c=='a' ||c=='e' ||c=='i' ||c=='o' ||c=='u' ||c=='A' ||c=='E' ||c=='I' ||c=='O' ||c=='U' )
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
	public boolean IsConsonant()
	{
		if(c=='a' ||c=='e' ||c=='i' ||c=='o' ||c=='u' ||c=='A' ||c=='E' ||c=='I' ||c=='O' ||c=='U' )
		{
			return false;
		}
		else
		{
			return true;
		}
	}

}
