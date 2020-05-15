package week2.day1;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LaunchDriver {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		WebElement Username = driver.findElementById("username");
		Username.sendKeys("Demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();       
		WebElement Companyname = driver.findElementById("createLeadForm_companyName");
		Companyname.sendKeys("CTS");
		WebElement Firstname = driver.findElementById("createLeadForm_firstName");
		Firstname.sendKeys("Hema");
		WebElement Lastname = driver.findElementById("createLeadForm_lastName");
		Lastname.sendKeys("Priyadarshini");
		 WebElement source = driver.findElementById("createLeadForm_dataSourceId");
         Select dropDown = new Select(source);
        // List <WebElement> options = dropDown.getOptions();
         dropDown.selectByVisibleText("Conference");
         WebElement Industry = driver.findElementById("createLeadForm_industryEnumId");
         Select dropDown1 = new Select(Industry);
		dropDown1.selectByValue("IND_AEROSPACE");
		Thread.sleep(10000);
		dropDown1.selectByValue("IND_HARDWARE");
		Thread.sleep(10000);
		dropDown1.selectByValue("IND_SOFTWARE");
		Thread.sleep(10000);
		dropDown1.selectByValue("IND_DISTRIBUTION");
		Thread.sleep(10000);
		dropDown1.selectByValue("IND_PRESS");
		Thread.sleep(10000);
		WebElement Ownership = driver.findElementById("createLeadForm_ownershipEnumId");
        Select dropDown2 = new Select(Ownership);
		dropDown2.selectByIndex(0);
	    Thread.sleep(10000);
	    dropDown2.selectByIndex(1);
	    Thread.sleep(10000);
	    dropDown2.selectByIndex(2);
	    Thread.sleep(10000);
	    dropDown2.selectByIndex(3);
	    Thread.sleep(10000);
	    dropDown2.selectByIndex(4);
	    Thread.sleep(10000);
	    dropDown2.selectByIndex(5);
	    Thread.sleep(10000);
	    dropDown2.selectByIndex(6);
	    Thread.sleep(10000);
	   
	    //driver.close();

	}


		
	}


