package week2day2;


import org.openqa.selenium.chrome.ChromeDriver;

public class Assign1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/checkbox.html");
		driver.manage().window().maximize();
		driver.findElementByXPath("//input[@type='checkbox']").click();
		driver.findElementByXPath("(//input[@type='checkbox'])[2]").click();
		driver.findElementByXPath("(//input[@type='checkbox'])[3]").click();
		driver.findElementByXPath("(//input[@type='checkbox'])[4]").click();
		driver.findElementByXPath("(//input[@type='checkbox'])[5]").click();
		driver.findElementByXPath("(//input[@type='checkbox'])[6]").click();
		Thread.sleep(1000);
		driver.findElementByXPath("(//input[@type='checkbox'])[6]").click();
		driver.findElementByXPath("(//input[@type='checkbox'])[7]").click();
		driver.findElementByXPath("(//input[@type='checkbox'])[8]").click();
		Thread.sleep(1000);
		driver.findElementByXPath("(//input[@type='checkbox'])[8]").click();
		driver.findElementByXPath("(//input[@type='checkbox'])[9]").click();
		driver.findElementByXPath("(//input[@type='checkbox'])[10]").click();
		driver.findElementByXPath("(//input[@type='checkbox'])[11]").click();
		driver.findElementByXPath("(//input[@type='checkbox'])[12]").click();
		driver.findElementByXPath("(//input[@type='checkbox'])[13]").click();
		Thread.sleep(1000);
		driver.close();
	}

}
