package testPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String exepath = "./Drivers/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exepath);
		WebDriver driver = new ChromeDriver ();
		
		
		 driver.get("https://www.youtube.com");


	}

}
