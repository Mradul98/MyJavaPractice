
public class ConstructorOverloading {
	
	int id;
	int age;
	String name;
	
	ConstructorOverloading(int id,int age) // With two arguments
	{
		this.id=id;
		this.age=age;                                       //Constructor overloading:Two constructors with different argument is known as constructor overloading 
	}
	
	ConstructorOverloading(int id,int age,String name) // With three arguments
	{
		this.id=id;
		this.age=age;
		this.name=name;
	}
	
	void display()
	{
		System.out.println(id+  "  " +age+ "  "+name);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConstructorOverloading obj1=new ConstructorOverloading(5,25);
		ConstructorOverloading obj2=new ConstructorOverloading(10,30,"Mradul");
		obj1.display();
		obj2.display();

	}

}
