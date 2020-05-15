package week2day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElementByXPath("//input[@id='username']").sendKeys("Demosalesmanager");
		driver.findElementByXPath("//input[@id='password']").sendKeys("crmsfa");
		driver.findElementByXPath("//input[@value='Login']").click();
		driver.findElementByXPath("(//a)[2]").click();
		driver.findElementByXPath("//a[text()='Leads']").click();
		driver.findElementByXPath("//a[text()='Find Leads']").click();		
		driver.findElementByXPath("(//span[@class='x-tab-strip-text '])[3]").click();		
		driver.findElementByXPath("//input[@name='emailAddress']").sendKeys("Hemapriyadarshini@gmail.com");		
		driver.findElementByXPath("(//button[@class='x-btn-text']/parent::em)[7]").click();
		
		Thread.sleep(2000);		
		String FirstName = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a)").getText();
		System.out.println(FirstName);		
		String email = driver.findElementByXPath("(//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ']/div[1]//a)").getText();
		System.out.println(email);
		driver.findElementByXPath("(//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ']/div[1]//a)").click();
		driver.findElementByXPath("//a[contains(text(),'Duplicate Lead')]").click();
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.findElementByXPath("//input[@value='Create Lead']").click();
		String Name = driver.findElementByXPath("//span[@id='viewLead_firstName_sp']").getText();
		
		if(Name.equals(FirstName))
		{
			System.out.println("The duplicated lead name is same as captured name");
		}
		else
		{
			System.out.println("The duplicated lead name is not same as captured name");
		}
		
		driver.close();

	}

}
