
public class MyStudent {

	String name;
	int[] marks;

	public MyStudent(String name, int[] marks) {
		this.name = name;
		this.marks = marks;

	}

	public int getNumberOfMarks() {

		return marks.length;
	}

	int l = marks.length;

	int TotalSumOfMarks() {
		int sum = 0;
		for (int i = 0; i <= l - 1; i++) {
			sum = sum + marks[i];
		}
		return sum;
	}

	int max = marks[0];

	int getMaxMarks() {
		for (int i = 0; i < l; i++) {
			if (max < marks[i]) {
				max = marks[i];
			}
		}
		return max;
	}

	int min = marks[0];

	int getMinMarks()

	{
		for (int i = 0; i < l; i++) {
			if (min > marks[i]) {
				min = marks[i];
			}
		}
		return min;
	}

}
