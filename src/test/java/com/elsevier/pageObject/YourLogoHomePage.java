package com.elsevier.pageObject;

import static io.cucumber.spring.CucumberTestContext.SCOPE_CUCUMBER_GLUE;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(SCOPE_CUCUMBER_GLUE)
public class YourLogoHomePage extends AbstractPage {

	@Autowired
	EventFiringWebDriver driver;

	@Autowired
	AssessmentPageObjectFactory assessmentPageObjectFactory;

	@FindBy(css = "div[class='header_user_info'] > a[class='login']")
	private WebElement signInLink;

	@FindBy(css = ".product-image-container")
	private WebElement productContainer;

	@FindAll(@FindBy(css = ".product-image-container"))
	private List<WebElement> productContainerList;

	@FindBy(css = ".product-image-container .price-percent-reduction")
	private WebElement saleProductContainer;

	@FindAll(@FindBy(xpath = "//span[@class='price-percent-reduction']/ancestor::div[@class='content_price']/preceding-sibling::a[@class='product_img_link']"))
	private List<WebElement> saleProductContainerList;

	public YourLogoHomePage(EventFiringWebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public ProductPage clickReducedItem(String itemTitle) {

		for (WebElement element : saleProductContainerList) {
			if (element.getAttribute("title").equals(itemTitle)) {

				element.findElement(By.xpath("./ancestor::div[@class='product-container']")).click();
				break;
			}

		}

		return assessmentPageObjectFactory.getProductPage();

	}

	public LogInMyStorePage clickSignInButton() {
		waitForElement(signInLink);
		signInLink.click();
		return assessmentPageObjectFactory.getLogInMyStorePage();
	}

}
