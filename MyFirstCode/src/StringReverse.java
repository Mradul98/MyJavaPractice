
public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text="Mradul is a good boy";
		//String [] arr=new String[text.length()];
		String text2="";
		
		for(int i=text.length()-1;i>=0;i--)
		{
			text2=text2+text.charAt(i);
		}
		
		System.out.println(text2);
		

	}

}
