package OrangeHRMtestcases;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Apputils.Apputils;
import Apputils.Loginpage;

public class AdminLoginWithInvalidInputs extends Apputils
{
	
	@Parameters({"admuid","admpwd"})
	@Test
	public void AdminloginwithInvalid(String uid, String pwd)
	{
		Loginpage lp = new Loginpage();
		lp.login(uid, pwd);
		boolean res = lp.isErrMsgDisplayed();
		Assert.assertTrue(res);
		
	}
	

}
