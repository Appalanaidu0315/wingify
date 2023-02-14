package OrangeHRMtestcases;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import Apputils.Apputils;
import orangehrmLibraries.Loginpage;

public class AdminLoginWithValidInputs extends Apputils
{
	
	@Parameters({"admuid","admpwd"})
	@Test
	
	public void Adminlogin(String uid,String pwd) 
	{
		
		Loginpage lp = new Loginpage();
		lp.login(uid,pwd);
		boolean res = lp.isAdminModuleDisplayed();
		Assert.assertTrue(res);
		lp.logout();
		
	}
	

}
