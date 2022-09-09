
public class MyText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="My Name is Mradul Katiyar";
		int l=str.length();
		for(int i=0;i<l;i++)
		{
			if(str.charAt(i)==' ')
			{
				continue;
			}
			else
			{
				System.out.print(str.charAt(i));
			}
				
			System.out.println("\n");
			
			
		}
		

	}

}
