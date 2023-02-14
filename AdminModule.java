package orangehrmLibraries;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import Apputils.Apputils;
import Apputils.Loginpage;

public class AdminModule extends Apputils
{

	String adminuid = "Admin";
	String adminpwd = "Qedge123!@#";
	
	Loginpage lp;
	
	@BeforeTest
	public void adminLogin()
	{
		lp = new Loginpage();
		lp.login(adminuid, adminpwd);
		
	}
	
	@AfterTest
	public void logout()
	{
		lp.logout();
	}

	
	

	
	

}
