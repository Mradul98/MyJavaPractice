package Basic_Practice;

public class Reverse_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int number=124765;
		int revers=0;
		while(number!=0)
		{
			int reminder=number%10;
			revers=revers*10+reminder;
			number=number/10;
			
		}
		System.out.println(revers);

	}

}
