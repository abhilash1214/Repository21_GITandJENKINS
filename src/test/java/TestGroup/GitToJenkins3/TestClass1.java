package TestGroup.GitToJenkins3;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class TestClass1 {
	@Test
	public void met1() {
		System.out.println("...........Hello......");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Abilash PL\\Desktop\\SeleniumProjects\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://www.javatpoint.com/");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scrollBy(0, 5000)");
		System.out.println("...........Hello2......");
	}

}
