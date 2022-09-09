
public class SumNumber {
	
	private int number;
	
	SumNumber(int number)
	{
		this.number=number;
	}
	
	public int sumofnumbers()
	{
		int sum=0;
		for(int i=1;i<=number;i++)
		{
			/*sum=sum+i;*/ sum+=i;
			
		}
		return sum;
	}
	

}
