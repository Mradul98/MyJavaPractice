package Basic_Practice;

import java.util.Scanner;

public class Number_Palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner obj=new Scanner(System.in);
		
		System.out.println("Enter the number");
		int number=obj.nextInt();
		int reverseNumber=0;
		while(number!=0)
		{
			int reminder=number%10;
			reverseNumber=reverseNumber*10+reminder;
			number=number/10;
		}
		
		System.out.println(reverseNumber);
		
		if(number==reverseNumber)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
		

	}

}
