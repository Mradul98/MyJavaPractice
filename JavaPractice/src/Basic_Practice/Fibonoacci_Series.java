package Basic_Practice;

import java.util.Scanner;

public class Fibonoacci_Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number ");
		int n=sc.nextInt();
		int a=0;
		int b=1;
		int c;
		System.out.print(a+ "," +b);
		
		for(int i=2;i<n;i++)
		{
			c=a+b;
			System.out.print(","+ c);
			a=b;
			b=c;
		}

	}

}
