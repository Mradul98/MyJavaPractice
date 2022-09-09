import java.util.Scanner;

public class CalculationMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter Number1:");
		int Number1 = obj.nextInt();
		System.out.println("Enter Number2:");
		int Number2 = obj.nextInt();
		System.out.println("Choose the below number for operation");
		System.out.println("1-For Addition");
		System.out.println("2-For Substraction");
		System.out.println("3-For Multiplication");
		System.out.println("4-For Division");

		int choice = obj.nextInt();
		switch (choice) {
		case 1:
			System.out.println("Your choice is addition.");
			System.out.println("Your result is :" + (Number1 + Number2));
			break;

		case 2:
			System.out.println("Your choice is substraction.");
			System.out.println("Your result is:" + (Number1 - Number2));
			break;
		case 3:
			System.out.println("Your choice is multiplication.");
			System.out.println("Your result is :" + (Number1 * Number2));
			break;
		case 4:
			System.out.println("Your choice is divisoion.");
			System.out.println("Your result is :" + (Number1 / Number2));
			break;
		default:
			System.out.println("Invalid selection.");
		}

	}

}
