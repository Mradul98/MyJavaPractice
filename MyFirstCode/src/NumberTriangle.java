import java.util.Scanner;

public class NumberTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");

		int number = sc.nextInt();
		for(int i=1;i<=number;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*  ");
			}
			System.out.println("\n");
		}
				
			
		
		
	}

}
