package cursoTest;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LojaVirtualTest {
	WebDriver driver;
		
	@Test
	public void abreFechaNavegador() {
		abreNavegador();
		fechaNavegador();
	}
	
	@Test
	public void pesquisaLivro() {
		abreNavegador();
		WebElement pesquisa = driver.findElement(By.id("search"));
		pesquisa.sendKeys("fortaleza digital");
		pesquisa.sendKeys(Keys.ENTER);
		
		fechaNavegador();
	}
	
	public void abreNavegador() {
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://lojaexemplod.lojablindada.com");
		driver.manage().window().maximize();
	}
	
	public void fechaNavegador() {
		driver.quit();
	}
}
