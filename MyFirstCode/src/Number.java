
public class Number {

	int number;

	Number(int number) {
		this.number = number;

	}

	public boolean IsAPrimeNumber() {
		boolean value = false;
		if (number <= 1)
			return false;
		for (int i = 2; i < number; i++)
			if (number % i == 0)
				return false;
			else
				return true;
		return value;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Number obj = new Number(2);
		System.out.println(obj.IsAPrimeNumber());

	}

}
