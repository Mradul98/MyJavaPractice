package Test_Package;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Module_2 {

	@Test

	public void Module2_tc1() {
		System.out.println("I am 1st  test case from module two ");
	}

	@Test(groups= {"Smoke"})

	public void Module2_tc2() {
		System.out.println("I am 2nd test case from module two ");
	}
	
	@DataProvider
	
	public void getData()
	{
		Object[][] data=new Object[3][2];
		data[0][0]="UserName";
		data[0][1]="Password";
	}

}
