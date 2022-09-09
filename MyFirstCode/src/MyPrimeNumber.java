import java.util.Scanner;

public class MyPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = obj.nextInt();
		if (n == 0 || n == 1) {
			System.out.println("No");
		} else {
			for (int i = 2; i <= n-1; i++) {
				if (n % i == 0) {
					System.out.println("No");
				} 
				else
					System.out.println("Yes");
				break;
			}

		}

	}

}
