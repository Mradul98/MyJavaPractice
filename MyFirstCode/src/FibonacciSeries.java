import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner obj=new Scanner(System.in);
		System.out.println("Upto what you wants to print series?");
		int n=obj.nextInt();
		int a=0;
		int b=1;
		System.out.print(a+ " " +b);
		for(int i=2;i<=n;i++)
		{
			int c=a+b;
			a=b;
			b=c;
			System.out.print(" " +c);
		}
				

	}

}
