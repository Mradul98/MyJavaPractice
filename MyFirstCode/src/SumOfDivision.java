
public class SumOfDivision {
	
	int number;
	SumOfDivision(int number)
	{
		this.number=number;
	}
	
	
	public int sumofdivisionofnumber()
	{
		int sum=0;
		for(int i=1;i<=number;i++)
			if(number%i==0)
			{
				 sum=sum+i;
			}
		return sum;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumOfDivision sc=new SumOfDivision(8);
		System.out.println(sc.sumofdivisionofnumber());
		

	}

}
