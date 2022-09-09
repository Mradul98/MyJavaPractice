
public class BiNumber {
	int a;
	int b;
	
	BiNumber(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	
	int add()
	{
		return a+b;
		
	}
	int multiply()
	{
		return a*b;
	}
	void doublevalue()
	{
		this.a*=2;
		this.b*=2;
	}
	

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BiNumber obj=new BiNumber(5,4);
		
		System.out.println(obj.add());
		System.out.println(obj.multiply());
		System.out.println(obj.getA());
		System.out.println(obj.getB());
		

	}

}
