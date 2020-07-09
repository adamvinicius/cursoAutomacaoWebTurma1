package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import enums.ByValue;

public class Element {
	ByValue by;
	String map;
	
	public Element(ByValue by, String _map) {
		this.by = by;
		map = _map;
	}
	
	public WebElement getElement() {
		WebElement element = null;
		switch (by) {
		case ID:
			element = Driver.getDriver().findElement(By.id(map));
			break;
		case XPATH:
			element = Driver.getDriver().findElement(By.xpath(map));
			break;
		case CSS:
			element = Driver.getDriver().findElement(By.cssSelector(map));
			break;
		case LINKTEXT:
			element = Driver.getDriver().findElement(By.linkText(map));
			break;
		case NAME:
			element = Driver.getDriver().findElement(By.name(map));
			break;
		default:
			break;
		}
		return element;
	}
	
	public void sendKeys(CharSequence... value) {
		getElement().sendKeys(value);
	}
	
	public String getText() {
		return getElement().getText();
	}
	
	public void click() {
		getElement().click();
	}
}
