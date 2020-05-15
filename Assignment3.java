package week2day2;


import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {

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
		Thread.sleep(1000);
		driver.findElementByXPath("(//span[@class='x-tab-strip-text '])[2]").click();
		Thread.sleep(1000);
		driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("88");
		driver.findElementByXPath("(//button[@class='x-btn-text']/parent::em)[7]").click();
		Thread.sleep(1000);
	String id = driver.findElementByXPath("(//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ']/div[1]//a)").getText();
	driver.findElementByXPath("(//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ']//a)[1]").click();
	driver.findElementByXPath("//a[@class='subMenuButtonDangerous']").click();
	driver.findElementByXPath("//a[text()='Find Leads']").click();
	Thread.sleep(1000);
	driver.findElementByXPath("//input[@name='id']").sendKeys(id);
	driver.findElementByXPath("(//button[@class='x-btn-text'])[7]").click();
	Thread.sleep(1000);
	String output = driver.findElementByXPath("//div[text()='No records to display']").getText();
	System.out.println(id);
	System.out.println(output);
		

	}

}
