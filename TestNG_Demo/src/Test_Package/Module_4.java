package Test_Package;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Module_4 {
	
	@Test
	
	public void Module4_tc1()
	{
		System.out.println("I am 1st testcase from module 4");
	}
	
	@Test
	
	public void Module4_tc2()
	{
		System.out.println("I am 2nd testcase from module 4");
	}
	
	@BeforeTest(groups= {"Smoke"})
	public void Module4_tc3()
	{
		System.out.println("I am the first scenario to clear the data base from module 4");
	}

}
