package week2day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/radio.html");
		driver.manage().window().maximize();
		driver.findElementByXPath("//input[@id='yes']").click();
		driver.findElementByXPath("(//input[@name='news'])[1]").click();
		driver.findElementByXPath("(//input[@name='age'])[3]").click();

	}

}
