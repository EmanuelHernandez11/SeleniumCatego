package lala;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Asasa {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Seleniun\\Drivers\\chromedriver95.exe");
		WebDriver driver = new ChromeDriver();
		try {
			driver.get("https://blazedemo.com/");
		
		Select pais = new Select (driver.findElement(By.xpath("//body/div[3]/form[1]/select[1]")));
		pais.selectByVisibleText("Mexico City");
		Thread.sleep(5000);
		Thread.sleep(5000);
		
		}
		finally {
			driver.quit();
		}
}
}