package Basic_Practice;

public class Palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String number="48982";
		
		String number1="";
		
		for(int i=number.length()-1;i>=0;i--)
		{
			number1=number1+number.charAt(i);
		}
		
		if(number.equalsIgnoreCase(number1))
		{
			System.out.println("yes");
		}
		else
			System.out.println("No");

	}

}
