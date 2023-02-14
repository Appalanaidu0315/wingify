package OrangeHRMtestcases;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Apputils.Apputils;
import Apputils.Loginpage;

public class Employee_login_Testcase extends Apputils

{
	@Parameters({"uid","pwd"})
	@Test
	public void checkUserLogin(String uid, String pwd)
	{
		
		Loginpage lp = new Loginpage();
		lp.login(uid, pwd);
		boolean res = lp.isEmpModuleDisplayed();
		Assert.assertTrue(res);
		lp.logout();
		
	}
	
	

}
