package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	By btnRender = By.xpath("//span[contains(text(),'Render the Challenge')]");
	By row1 = By.xpath("//section[@id=\"challenge\"]/div/div/div[1]/div/div[2]/table/tbody/tr[1]");
	By row2 = By.xpath("//section[@id=\"challenge\"]/div/div/div[1]/div/div[2]/table/tbody/tr[2]");
	By row3 = By.xpath("//section[@id=\"challenge\"]/div/div/div[1]/div/div[2]/table/tbody/tr[3]");
	
	By inputChallage1 = By.xpath("/html[1]/body[1]/div[1]/div[1]/section[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/input[1]");
	By inputChallage2 = By.xpath("/html[1]/body[1]/div[1]/div[1]/section[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/input[1]");
	By inputChallage3 = By.xpath("/html[1]/body[1]/div[1]/div[1]/section[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/input[1]");
	By inputName = By.xpath("/html[1]/body[1]/div[1]/div[1]/section[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/input[1]");
	
	By btnSubmit = By.xpath("//span[contains(text(),'Submit Answers')]");
	
	By resultText = By.xpath("//div[contains(text(),'Congratulations you have succeeded. Please submit')]");
	By btnResultClose = By.xpath("//span[contains(text(),'Close')]");
	
	public void clickRender() {
		driver.findElement(btnRender).click();
	}
	
	public WebElement getRow1() {
		return driver.findElement(row1);
	}
	
	public WebElement getRow2() {
		return driver.findElement(row2);
	}
	
	public WebElement getRow3() {
		return driver.findElement(row3);
	}
	
	public void enterChallange1(String data) {
		driver.findElement(inputChallage1).sendKeys(data);
	}
	
	public void enterChallange2(String data) {
		driver.findElement(inputChallage2).sendKeys(data);
	}
	
	public void enterChallange3(String data) {
		driver.findElement(inputChallage3).sendKeys(data);
	}
	
	public void enterName(String data) {
		driver.findElement(inputName).sendKeys(data);
	}
	
	public void clickSubmit() {
		driver.findElement(btnSubmit).click();
	}
	
	public boolean testResult() {
		return driver.findElement(resultText).isDisplayed();
	}
	
	public void clickCloseButton() {
		driver.findElement(btnResultClose).click();
	}

}
