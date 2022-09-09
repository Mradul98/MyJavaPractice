package Basic_Practice;

public class Factorial_Java {
	
	int n;
	int a=1;
	
	public int factorial(int n)
	{
		for(int i=1;i<=n;i++)
		{
			a=a*i;
		}
		return a;
	}

	
}
