package Test_Package;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class Module_1 {
	@Parameter(names={"URL"})

	@Test(groups= {"Smoke"})
	public void Module1_tc1(String url) {
		System.out.println("I am 1st test case from module one");
	}

	@Test
	public void Module1_tc2() {
		System.out.println("I am 2nd test case from module one ");
	}
	
	@BeforeSuite
	
	public void Module1_tc3()
	{
		System.out.println("I am the first who ll get executed");
	}
	
	@AfterSuite
	
	public void Module1_tc4()
	{
		System.out.println("I am the last who ll get executed");
	}

}
