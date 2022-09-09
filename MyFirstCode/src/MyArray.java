import java.util.Scanner;

public class MyArray {
	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the number of students in the class?");
		int NumberOfStudents = obj.nextInt();
		int[] marks = new int[NumberOfStudents];
		System.out.println("Enter the marks of each student?");
		for (int i = 0; i <= NumberOfStudents - 1; i++) {
			marks[i] = obj.nextInt();
		}
		int sum = 0;
		for (int i = 0; i <= NumberOfStudents - 1; i++) {
			sum = sum + marks[i];
		}
		float average = 1.0f;
		average = sum / NumberOfStudents;
		System.out.println("Avarage of the marks is :" + average);

	}

}
