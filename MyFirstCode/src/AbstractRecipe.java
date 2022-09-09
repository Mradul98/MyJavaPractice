
public abstract class AbstractRecipe {
	
	public void execute()
	{
		GetStratForRecipe();
		PrepareRecipe();
		CleanUp();
	}
	
	 abstract void GetStratForRecipe();
	 abstract void PrepareRecipe();
	 abstract void CleanUp();
	

}
