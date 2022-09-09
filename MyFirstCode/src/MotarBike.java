
public class MotarBike {
	
	void Hero()
	{
		int price=200;
		String clour="red";
		System.out.println("Bike speed is 100");
	}
	
	void Activa()
	{
		int price=300;
		String clour="Yellow";
		System.out.println("Bike speed is 200");		
	}
	
	public static void main(String []args)
	{
		MotarBike obj=new MotarBike();
		
		obj.Activa();
		obj.Hero();
		
	}

}
