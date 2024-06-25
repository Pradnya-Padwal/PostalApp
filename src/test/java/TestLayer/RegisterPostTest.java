package TestLayer;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.RegisterPost;

public class RegisterPostTest extends BaseClass{
	
	protected static RegisterPost reg;
	
	@BeforeTest
	public void setUp()
	{
		BaseClass.initialization();
	}
	
	@Test
	public void registerpageFunctionality()
	{
		RegisterPost reg = new RegisterPost();
		reg.registerFunctionality("123", "Mrs.", "Pradnya", "Padwal", "What is your Birth Place?", "Junnar", "MG Road", "Laxmi Road", "Pune", "India", "Maharashtra", "PUNE", "411038", "pradnya@gmail.com", "897676767");
	}

}
