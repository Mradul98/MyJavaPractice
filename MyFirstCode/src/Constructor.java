
public class Constructor {
	
	int id;
	String name;
	int age;
	
//	Constructor(int id,String name,int age) //Constructor is a special type of method with same name as class name .
	                                        //Constructor is called as constructor bcz it's construct value for obj.
//	{
//		this.id=id;
//		this.name=name;
//		this.age=age;
//	}
//	
	void display()
	{
		System.out.println(id+"  "+name+"  "+age);
	}
	

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		Constructor obj=new Constructor();
		
		obj.display();
		

	}

}
