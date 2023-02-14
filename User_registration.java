package OrangeHRMtestcases;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Apputils.Apputils;
import Apputils.Loginpage;
import orangehrmLibraries.AdminModule;
import orangehrmLibraries.User;

public class User_registration extends AdminModule

{
	@Parameters({"role","empname","uname","pword"})
	@Test
	public void checkuser(String role, String empname,String uname,String pword) throws InterruptedException
	{
		User us = new User();
		boolean res = us.addUser(role,empname,uname,pword);
		Assert.assertTrue(res);
		
		
	}
	
	

}
