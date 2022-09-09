
public class IsAWeekDay {
	int day;
	
	public static boolean WeekDay(int day)
	{
		boolean value=true;
		switch(day)
		{
		case 0:
			return true;
		case 1:
			return false;
		case 2:
			return false;
		case 3:
			return false;
		case 4:
			return false;
		case 5:
			return false;
		case 6:
			return true;
		}
		return value;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(WeekDay(1));

	}

}
