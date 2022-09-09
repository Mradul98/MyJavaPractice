
public class MyNumber {
	
	private int a;
	
	MyNumber(int a)
	{
		this.a=a;
	}
	
	void CheckNumber()
	{
		if(a%2==0)
		{
			System.out.println("Even Number"); 
		}
		else
		{
			System.out.println("Odd number");
		}
	}

}
