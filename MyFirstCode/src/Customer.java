
public class Customer {
	
	private String name;
	private Address homeaddress;;
	private Address workaddress;
	
	
	
	Customer(String name,Address homeaddress)
	{
		this.name=name;
		this.homeaddress=homeaddress;
	}
	
	public String toString()
	{
		return String.format("name- %s, Address- %s",name,homeaddress  );
	}
	
	

}
