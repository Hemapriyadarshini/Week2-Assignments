package week2day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class MergeLead {

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
		driver.findElementByXPath("//a[text()='Merge Leads']").click();
		driver.findElementByXPath("//input[@name='ComboBox_partyIdFrom']").click();
		Thread.sleep(1000);
//		driver.findElementByXPath("(//a[@class='linktext'])[text()='10005'][2]").click();
		driver.findElementByXPath("//input[@name='ComboBox_partyIdTo']").click();
		Thread.sleep(1000);
	}

}