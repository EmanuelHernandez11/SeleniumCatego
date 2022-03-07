package lala;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Categoria {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Seleniun\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		try {
			driver.get("https://www.mercadolibre.com.ar/");
			WebElement catego= driver.findElement(By.className("nav-menu-categories-link"));
			catego.click();
			Thread.sleep(10000);
			

	}
		finally {
			driver.quit();
		}

}
}