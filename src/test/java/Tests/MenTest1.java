package Tests;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.relevantcodes.extentreports.LogStatus;

import Generics.Base;
import Pages.MenFootware;
import Pages.TravelUtilityBags;
import Pages.WomenFahonBag;
import Pages.WomenFootwear;

public class MenTest1 extends Base {

	MenFootware MF1;
	WomenFootwear WF;
	WomenFahonBag WFB;
	TravelUtilityBags TUB;

	@Test(priority = 1)
	public void FootBags1() throws InterruptedException, IOException {

		MF1 = new MenFootware(driver);

//		Footwear Combos
		MF1.Test1();
		MF1.CheckTest(txtTo, txtForm);
		// SoftAssert
		String actualTitle = driver.getTitle();
		System.out.print(actualTitle);
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(actualTitle.contains(
				" Footwear Combos Online Store in India - Buy Footwear Combos at Best Price on Naaptol Online Shopping"),
				"Title does not match!");

		MF1.Product();

//		Boots+-+-+-+-+-+-+-+
		MF1.Test2();
		MF1.CheckTest(txtTo, txtForm);
		// SoftAssert
		String actualTitle1 = driver.getTitle();
		System.out.print(actualTitle1);
		SoftAssert softAssert1 = new SoftAssert();
		softAssert1.assertTrue(
				actualTitle1.contains(
						" Mens Boots - Buy Boots for Men's in India at Best Price on Naaptol Online Shopping"),
				"Title does not match!");
		MF1.Product2();

//		Sports Shoes-+-+-+-+-+
		MF1.Test3();
		MF1.CheckTest(txtTo, txtForm);

		// SoftAssert
		String actualTitle11 = driver.getTitle();
		System.out.print(actualTitle11);
		SoftAssert softAssert11 = new SoftAssert();
		softAssert11.assertTrue(actualTitle11.contains(
				" Mens Sports Shoes - Buy Sports Shoes for Men's in India at Best Price on Naaptol Online Shopping"),
				"Title does not match!");

		MF1.Product3();

//		Formal Shoes-+-+-+-+-+-+
		MF1.Test4();
		MF1.CheckTest(txtTo, txtForm);

		// SoftAssert
		String actualTitle111 = driver.getTitle();
		System.out.print(actualTitle111);
		SoftAssert softAssert111 = new SoftAssert();
		softAssert111.assertTrue(actualTitle111.contains(
				" Formal Shoes Online Store in India - Buy Formal Shoes at Best Price on Naaptol Online Shopping"),
				"Title does not match!");

		MF1.Product2();

//		Sandals & Slippers+-+-+-+-+-+-+
		MF1.Test5();
		MF1.CheckTest2(txtTo, txtForm);

		// SoftAssert
		String actualTitle1111 = driver.getTitle();
		System.out.print(actualTitle1111);
		SoftAssert softAssert1111 = new SoftAssert();
		softAssert1111.assertTrue(
				actualTitle1111.contains(
						" Sandals Online Store in India - Buy Sandals at Best Price on Naaptol Online Shopping"),
				"Title does not match!");

		MF1.Product2();

		test.log(LogStatus.PASS, "Mensware Navigation");
	}

	@Test(priority = 2)
	public void FootBag2() throws InterruptedException {

		WF = new WomenFootwear(driver);
		WF.Test();
		WF.CheckTest(txtTo, txtForm);

		// SoftAssert
		String actualTitle = driver.getTitle();
		System.out.print(actualTitle);
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(
				actualTitle.contains(
						"Womens Sandals - Buy Ladies Sandals Online in India at Best Price on Naaptol Online Shopping"),
				"Title does not match!");

		WF.Product();
		test.log(LogStatus.PASS, "WomensWare Navigation");
	}

	@Test(priority = 3)
	public void FootBag3() throws InterruptedException {

		WFB = new WomenFahonBag(driver);
		WFB.Test();
		WFB.CheckTest(txtTo, txtForm);

		// SoftAssert
		String actualTitle = driver.getTitle();
		System.out.print(actualTitle);
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(actualTitle.contains(
				" Handbags Slingbags Online Store in India - Buy Handbags Slingbags at Best Price on Naaptol Online Shopping"),
				"Title does not match!");

		WFB.Product();
		test.log(LogStatus.PASS, "Women Fashon Bag Navigation");
	}

	@Test(priority = 4)
	public void FootBag4() throws InterruptedException {

//		Backpack+-+-+-+-+-+-+-+
		TUB = new TravelUtilityBags(driver);
		TUB.Test1();
		TUB.CheckTest(txtTo, txtForm);

		// SoftAssert
		String actualTitle = driver.getTitle();
		System.out.print(actualTitle);
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(
				actualTitle.contains(
						" Backpacks Online Store in India - Buy Backpacks at Best Price on Naaptol Online Shopping"),
				"Title does not match!");

		TUB.Product();
		test.log(LogStatus.PASS, "Travels Utility bags Navigation");

//		Duffle Bag & Strolleys-+-+-+-+-+-+-+-+

		TUB.Test2();
		TUB.CheckTest(txtTo, txtForm);

		// SoftAssert
		String actualTitle1 = driver.getTitle();
		System.out.print(actualTitle1);
		SoftAssert softAssert1 = new SoftAssert();
		softAssert1.assertTrue(actualTitle1.contains(
				" Duffle Bags Online Store in India - Buy Duffle Bags at Best Price on Naaptol Online Shopping"),
				"Title does not match!");

		TUB.Product();
		test.log(LogStatus.PASS, "Travels Utility bags Navigation");

	}

}
