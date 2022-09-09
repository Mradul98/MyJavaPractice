
public class NameOfTheMonth {
	int month;
	public String month(int month )
	{
		String value="";
		switch(month)
		{
		case 1:
			value="January";
			break;
		case 2:
			value="Feburary";
			break;
		case 3:
			value="March";
			break;
		case 4:
			value="April";
			break;
		case 5:
			value="May";
			break;
		case 6:
			value="June";
			break;
		case 7:
			value="July";
			break;
		case 8:
			value="August";
			break;
		case 9:
			value="September";
			break;
		case 10:
			value="October";
			break;
		case 11:
			value="November";
			break;
		case 12:
			value="December";
			break;
		default:
			System.out.println("Invalid Entry !");
		}
		return value;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NameOfTheMonth obj=new NameOfTheMonth();
		System.out.println(obj.month(5));

	}

}
