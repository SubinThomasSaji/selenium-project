package page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addtocart {
	
	WebDriver driver;
	@FindBy(xpath="//*[@id=\"7497860776184\"]/div/a/div/div/div[1]/img[2]")//*[@id="7497861005560"]/div/a/div/div/div[1]/img[2]
	WebElement item1;
	@FindBy(xpath="//*[@id=\"product_form_7497860776184\"]/div[3]/div[2]/button")//*[@id="product_form_7497861005560"]/div[3]/div[2]/button
	WebElement addcart1;
	@FindBy(xpath="/html/body/div[1]/div[1]/div/div/announcement-bar/div/div[2]/div/div[3]/div/ul/li[1]/a")
	WebElement itemcart;
	@FindBy(xpath="/html/body/div[1]/div[1]/div/div/announcement-bar/div/div[2]/div/div[3]/div/ul/li[1]/a/span[1]")
	WebElement justwatchcart;
	@FindBy(xpath="//*[@id=\"shopify-section-template--16805301420280__main\"]/section/div/div/form/div[2]/div[2]/div[2]/div[2]/a")
	WebElement continueshopping;
	@FindBy(xpath="/html/body/div[1]/div[1]/div/div/announcement-bar/div/div[2]/div/div[3]/div/ul/li[1]/a/span[1]")
	  WebElement cart;
	@FindBy(xpath="//*[@id=\"shopify-section-template--16911356526840__main\"]/section/div/div/form/div[2]/div[1]/div[3]/div/div[3]/a")
	 WebElement remove;
	
	
	
	
	public Addtocart(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void addtitem1()                      //adding first item to cart
	{
		JavascriptExecutor y=(JavascriptExecutor)driver;
		item1.click();
		addcart1.click();
		Actions a=new Actions(driver);
		a.moveToElement(itemcart);
		itemcart.click();
		justwatchcart.click();
		continueshopping.click();
		cart.click();
		remove.click();
		driver.navigate().back();
	}
	
	


	
}



