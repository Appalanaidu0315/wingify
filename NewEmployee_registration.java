package OrangeHRMtestcases;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Apputils.Apputils;
import Apputils.Loginpage;
import orangehrmLibraries.AdminModule;
import orangehrmLibraries.Employeemodule;

public class NewEmployee_registration extends AdminModule

{
	@Parameters({"fname","lname"})
	@Test
	public void checkEmployee(String fname, String lname) 
	{
		Employeemodule emp = new Employeemodule();
		boolean  res = emp.addEmployee(fname,lname);
		Assert.assertTrue(res);
		
		
		
		
	}

}
