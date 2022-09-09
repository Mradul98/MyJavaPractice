
public class Address {
	
	private String Line1;
	private String city;
	private String zip;
	
	
	Address(String Line1,String city,String zip)
	{
		this.Line1=Line1;
		this.city=city;
		this.zip=zip;
	}
	
	public String toString()
	{
		return String.format("Line1- %s, city- %s, zip- %s",Line1,city,zip);
	}
	

}
