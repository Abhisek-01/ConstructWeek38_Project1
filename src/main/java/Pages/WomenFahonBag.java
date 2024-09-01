package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WomenFahonBag {

	WebDriver driver;

	public WomenFahonBag(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "div[id='cate_head']")
	private WebElement shopingCategoryElement;

	@FindBy(linkText = "Footwear & Bags")
	private WebElement footBagsElement;

	@FindBy(linkText = "Handbag & Clutches")
	private WebElement womenBagElement;

	@FindBy(css = "input[id='iscod']")
	private WebElement caseOnElement;

	@FindBy(css = "a[class='button_1']")
	private WebElement setElement;

	@FindBy(css = "input[id='fromPriceRange']")
	private WebElement manualPriceElement;

	@FindBy(css = "input[id='toPriceRange']")
	private WebElement manualPriceElement2;

	@FindBy(xpath = "(//a[@class='button_1'])[2]")
	private WebElement manualGoElement;

	@FindBy(xpath = "(//div[@class='item_image'])[1]")
	private WebElement prodImgElement;

	@FindBy(css = "a[id='quickViewId1']")
	private WebElement quickViewElement;

//	@FindBy(linkText = "8")
//	private WebElement sizElement;

	@FindBy(linkText = "Click here to Buy")
	private WebElement buyElement;

	@FindBy(linkText = "Proceed to Checkout")
	private WebElement procedElement;

	@FindBy(css = "img[alt='Online Shopping in India']")
	private WebElement HomeElement;

	public WebElement getShopingCategoryElement() {
		return shopingCategoryElement;
	}

	public WebElement getFootBagsElement() {
		return footBagsElement;
	}

	public WebElement getWomenElement() {
		return womenBagElement;
	}

	public WebElement getCaseOnElement() {
		return caseOnElement;
	}

	public WebElement getSetElement() {
		return setElement;
	}

	public WebElement getManualPriceElement() {
		return manualPriceElement;
	}

	public WebElement getManualPriceElement2() {
		return manualPriceElement2;
	}

	public WebElement getManualGoElement() {
		return manualGoElement;
	}

	public WebElement getProdImgElement() {
		return prodImgElement;
	}

	public WebElement getQuickViewElement() {
		return quickViewElement;
	}

	public WebElement getBuyElement() {
		return buyElement;
	}

	public WebElement getProcedElement() {
		return procedElement;
	}

	public WebElement getHomeElement() {
		return HomeElement;
	}

	public void Test() {

		Actions actions = new Actions(driver);
		actions.moveToElement(shopingCategoryElement).perform();
		actions.moveToElement(footBagsElement).perform();
		actions.moveToElement(womenBagElement).click().perform();

	}

	public void CheckTest(String First, String Sec) throws InterruptedException {
		caseOnElement.click();
		Thread.sleep(2000);
		setElement.click();
		Thread.sleep(2000);
		manualPriceElement.sendKeys(First);
		manualPriceElement2.sendKeys(Sec);
		manualGoElement.click();
	}

	public void Product() throws InterruptedException {
		Actions actions = new Actions(driver);
		actions.moveToElement(prodImgElement).perform();
		Thread.sleep(2000);
		quickViewElement.click();
		buyElement.click();
		procedElement.click();
		HomeElement.click();
	}

}
