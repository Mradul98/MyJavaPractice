
public class DayInWeek {
	int n;

	public static String Day(int n) {
		String result = " ";
		switch (n) {
		case 0:
			result = "Sunday";
			break;
		case 1:
			result = "Monday";
			break;
		case 2:
			result = "Tuesday";
			break;
		case 3:
			result = "Wednusday";
			break;
		case 4:
			result = "Thursday";
			break;
		case 5:
			result = "Friday";
			break;
		case 6:
			result = "Saturday";
			break;
		default:
			System.out.println("Inavalid");
		}
		return result;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Day(7));
		

	}

}
