package orangehrmLibraries;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Apputils.Apputils;

public class Employeemodule extends Apputils
{
	
	public boolean addEmployee(String fname,String lname)
	{
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		
		driver.findElement(By.id("firstName")).sendKeys(fname);
		driver.findElement(By.id("lastName")).sendKeys(lname);
		
		String empno = driver.findElement(By.id("employeeId")).getAttribute("value");
		driver.findElement(By.id("btnSave")).click();
		
		driver.findElement(By.linkText("Employee List")).click();
		driver.findElement(By.id("empsearch_id")).sendKeys(empno);
		driver.findElement(By.id("searchBtn")).click();
		
		WebElement emptable = driver.findElement(By.id("resultTable"));
		
		java.util.List<WebElement> rows = emptable.findElements(By.tagName("tr"));
	
		
		boolean res = false;
		for(int i=1;i<rows.size();i++)
		{
			java.util.List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
			if(cols.get(1).getText().equalsIgnoreCase(empno))
			{
				res =  true;
				break;
			}
		}
	
		return res;
		
	}
	
	
	public boolean addEmployee(String fname,String mname,String lname)
	{
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		
		driver.findElement(By.id("firstName")).sendKeys(fname);
		driver.findElement(By.id("middleName")).sendKeys(mname);
		driver.findElement(By.id("lastName")).sendKeys(lname);
		
		String empno = driver.findElement(By.id("employeeId")).getAttribute("value");
		driver.findElement(By.id("btnSave")).click();
		
		driver.findElement(By.linkText("Employee List")).click();
		driver.findElement(By.id("empsearch_id")).sendKeys(empno);
		driver.findElement(By.id("searchBtn")).click();
		
		WebElement emptable = driver.findElement(By.id("resultTable"));
		
		java.util.List<WebElement> rows = emptable.findElements(By.tagName("tr"));
	
		
		boolean res = false;
		for(int i=1;i<rows.size();i++)
		{
			java.util.List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
			if(cols.get(1).getText().equalsIgnoreCase(empno))
			{
				res =  true;
				break;
			}
		}
	
		return res;
	}
	
}

	
	
	
	


