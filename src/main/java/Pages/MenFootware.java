package Pages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenFootware {
	WebDriver driver;

	public MenFootware(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(css = "div[id='cate_head']")
	private WebElement shopingCategoryElement;

	@FindBy(linkText = "Footwear & Bags")
	private WebElement footBagsElement;

	@FindBy(linkText = "Footwear Combos")
	private WebElement men1Element;

	@FindBy(linkText = "Boots")
	private WebElement men2Element;

	@FindBy(linkText = "Sports Shoes")
	private WebElement men3Element;

	@FindBy(linkText = "Formal Shoes")
	private WebElement men4Element;

	@FindBy(linkText = "Sandals & Slippers")
	private WebElement men5Element;

	@FindBy(css = "input[id='iscod']")
	private WebElement caseOnElement;

	@FindBy(css = "a[class='button_1']")
	private WebElement setElement;

	@FindBy(css = "input[id='priceFilterBox1']")
	private WebElement priceSetElement;

	@FindBy(css = "input[id='priceFilterBox2']")
	private WebElement priceSetElement2;

	@FindBy(css = "input[id='fromPriceRange']")
	private WebElement manualPriceElement;

	@FindBy(css = "input[id='toPriceRange']")
	private WebElement manualPriceElement2;

	@FindBy(xpath = "(//a[@class='button_1'])[2]")
	private WebElement manualGoElement;

	@FindBy(css = "input[name=' Upto 10%']")
	private WebElement tenPercentElement;

	@FindBy(xpath = "(//div[@class='item_image'])[1]")
	private WebElement prodImgElement;

	@FindBy(css = "a[id='quickViewId1']")
	private WebElement quickViewElement;

	@FindBy(linkText = "8")
	private WebElement sizElement;

	@FindBy(linkText = "Click here to Buy")
	private WebElement buyElement;

	@FindBy(linkText = "Proceed to Checkout")
	private WebElement procedElement;

	@FindBy(css = "img[alt='Online Shopping in India']")
	private WebElement HomeElement;

	@FindBy(xpath = "(//img[@title='Online Shopping in India'])[2]")
	private WebElement HomeElement2;

	@FindBy(linkText = "See More Details »")
	private WebElement seeMoreElement;

	@FindBy(linkText = "Blue")
	private WebElement blueColorElement;

//	@FindBy(xpath = "(//h1)[3]")
//	private WebElement expctElement;
//
//	String actualElement = "Scottish Club Backpack with Reflective Strip + Free Bag Protector";

	public WebElement getBlueColorElement() {
		return blueColorElement;
	}

	public WebElement getSeeMoreElement() {
		return seeMoreElement;
	}

	public WebElement getTenPercentElement() {
		return tenPercentElement;
	}

	public WebElement getShopingCategoryElement() {
		return shopingCategoryElement;
	}

	public WebElement getFootBagsElement() {
		return footBagsElement;
	}

	public WebElement getMen1Element() {
		return men1Element;
	}

	public WebElement getMen2Element() {
		return men2Element;
	}

	public WebElement getMen3Element() {
		return men3Element;
	}

	public WebElement getMen4Element() {
		return men4Element;
	}

	public WebElement getMen5Element() {
		return men5Element;
	}

	public WebElement getCaseOnElement() {
		return caseOnElement;
	}

	public WebElement getSetElement() {
		return setElement;
	}

	public WebElement getPriceSetElement() {
		return priceSetElement;
	}

	public WebElement getPriceSetElement2() {
		return priceSetElement2;
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

	public WebElement getSizElement() {
		return sizElement;
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

	public WebElement getHomeElement2() {
		return HomeElement2;
	}

	public static void capture(WebDriver driver, int n) throws IOException {
		// Step 1 : Calling takescreenshot interface and casting it to driver
		TakesScreenshot ts = (TakesScreenshot) driver;
		// Step 2 : Using getscreenshotAs() to take screenshot
		File image = ts.getScreenshotAs(OutputType.FILE);
		// Step 3 : We have to create a new File in our local machine using File class
		// by creating object.
		File img = new File("C:\\Users\\Abhisek Baral\\OneDrive\\Pictures\\Screenshots\\Screenshot3\\sc1" + n + ".png");
		FileUtils.copyFile(image, img);

	}

	public void Test1() throws IOException {

		capture(driver, 0); // Screenshoot
		Actions actions = new Actions(driver);
		actions.moveToElement(shopingCategoryElement).perform();
		actions.moveToElement(footBagsElement).perform();
		actions.moveToElement(men1Element).click().perform();
//		caseOnElement.click();
//		setElement.click();
//		priceSetElement.click();

	}

	public void Test2() throws IOException {

		capture(driver, 1); // Screenshoot
		Actions actions = new Actions(driver);
		actions.moveToElement(shopingCategoryElement).perform();
		actions.moveToElement(footBagsElement).perform();
		actions.moveToElement(men2Element).click().perform();

	}

	public void Test3() throws IOException {

		capture(driver, 2); // Screenshoot
		Actions actions = new Actions(driver);
		actions.moveToElement(shopingCategoryElement).perform();
		actions.moveToElement(footBagsElement).perform();
		actions.moveToElement(men3Element).click().perform();

	}

	public void Test4() throws IOException {

		capture(driver, 3); // Screenshoot
		Actions actions = new Actions(driver);
		actions.moveToElement(shopingCategoryElement).perform();
		actions.moveToElement(footBagsElement).perform();
		actions.moveToElement(men4Element).click().perform();

	}

	public void Test5() throws IOException {

		capture(driver, 4); // Screenshoot
		Actions actions = new Actions(driver);
		actions.moveToElement(shopingCategoryElement).perform();
		actions.moveToElement(footBagsElement).perform();
		actions.moveToElement(men5Element).click().perform();

	}

	public void CheckTest(String First, String Sec) throws InterruptedException {
		caseOnElement.click();
		Thread.sleep(2000);
		setElement.click();
		Thread.sleep(2000);
		manualPriceElement.sendKeys(First);
		manualPriceElement2.sendKeys(Sec);
		manualGoElement.click();
//		priceSetElement.click();
//		Thread.sleep(2000);
//		priceSetElement2.click();
//		Thread.sleep(2000);
//		tenPercentElement.click();

	}

	public void CheckTest2(String First, String Sec) throws InterruptedException {
		setElement.click();
		Thread.sleep(2000);
		manualPriceElement.sendKeys(First);
		manualPriceElement2.sendKeys(Sec);
		manualGoElement.click();
//		priceSetElement.click();
//		Thread.sleep(2000);
//		priceSetElement2.click();
//		Thread.sleep(2000);
//		tenPercentElement.click();

	}

	public void Product() throws InterruptedException, IOException {
		Actions actions = new Actions(driver);
		actions.moveToElement(prodImgElement).perform();
		Thread.sleep(2000);
		quickViewElement.click();
//		sizElement.click();
		/*
		 * String actualString = driver.findElement(By.xpath("(//h1)[3]")).getText();
		 * String expectString =
		 * "Scottish Club Backpack with Reflective Strip + Free Bag Protector";
		 * Assert().assertEquals(actualString, expectString,
		 * "The actual string does not match the expected string.");
		 */

		buyElement.click();
		procedElement.click();
		capture(driver, 5); // Screenshoot
		HomeElement.click();
	}

	public void Product2() throws InterruptedException, IOException {
		Actions actions = new Actions(driver);
		actions.moveToElement(prodImgElement).perform();
		Thread.sleep(2000);
		quickViewElement.click();
		seeMoreElement.click();
		capture(driver, 6); // Screenshoot
		HomeElement2.click();
	}

	public void Product3() throws InterruptedException, IOException {
		Actions actions = new Actions(driver);
		actions.moveToElement(prodImgElement).perform();
		Thread.sleep(2000);
		quickViewElement.click();
		blueColorElement.click();
		sizElement.click();
		buyElement.click();
		procedElement.click();
		capture(driver, 7); // Screenshoot
		HomeElement.click();
	}

}
