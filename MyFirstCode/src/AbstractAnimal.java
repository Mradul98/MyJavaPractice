
public abstract class AbstractAnimal {
	abstract public void bark();
	

}

class DOG extends  AbstractAnimal
{
	public void bark()
	{
		System.out.println("Bow-------Bow");
	}
	
	public static void main(String []args)
	{
		DOG obj=new DOG();
		obj.bark();
	}
}
