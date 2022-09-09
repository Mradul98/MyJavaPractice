package Test_Package;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Module_3 {
	
	@BeforeMethod
	public void Module3tc_4()
	{
		System.out.println("I will get executed after each and every test method in module 3");
	}

	@Test(groups= {"Smoke"})
	public void Module3_tc1() {
		System.out.println("I am 1st test case from module 3");
	}

	@Test(enabled=false)
	public void Module3_Tc2() {
		System.out.println("I am 2nd test case from module 3");
	}

	@Test
	public void Module3_Tc3() {
		System.out.println("I am 3rd test case from module 3");
	}

}
