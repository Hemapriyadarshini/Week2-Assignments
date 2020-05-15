package week2day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

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
		driver.findElementByXPath("(//input[@name ='firstName'])[3]").sendKeys("Gopi");
		driver.findElementByXPath("(//button[@class ='x-btn-text'])[7]").click();
		Thread.sleep(10000);
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[2]").click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElementByXPath("(//div[@class='frameSectionExtra']/a)[3]").click();
		driver.findElementByXPath("(//input[@name ='companyName'])[2]").clear();
		driver.findElementByXPath("(//input[@name ='companyName'])[2]").sendKeys("IBM");
		driver.findElementByXPath("(//input[@name ='submitButton'])[1]").click();
		driver.close();
		//Thread.sleep(10000);
	}

}