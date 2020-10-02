package com.auspost.pom;

import java.util.Map;

import com.auspost.loc.CalculatePostageLoc;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;

public class CalculatePostagePage extends WebDriverBaseTestPage<WebDriverTestPage> implements CalculatePostageLoc {

	@FindBy(locator = FROM)
	private QAFWebElement from;
	
	@FindBy(locator = TO)
	private QAFWebElement to;
	
	@FindBy(locator = GO)
	private QAFWebElement go;
	
	@FindBy(locator = EXPRESS_POST)
	private QAFWebElement expressPost;
	
	@FindBy(locator = PARCEL_POST)
	private QAFWebElement parcelPost;
	
	@FindBy(locator = EXPRESS_POST_PRICES_FROM)
	private QAFWebElement expressPostPricesFrom;
	
	@FindBy(locator = PARCEL_POST_PRICES_FROM)
	private QAFWebElement parcelPostPricesFrom;

	@Override
	protected void openPage(PageLocator locator, Object... args) {
		driver.get("/");
	}

	public void calculatePostage(Map<String, String> data) {
		getFrom().sendKeys(String.valueOf(data.get("FROM")));
		getTo().sendKeys(String.valueOf(data.get("TO")));
		getGo().click();
	}

	public void validateTypeCost(Map<String, String> data) {
		getExpressPost().assertPresent();
		getParcelPost().assertPresent();

		getExpressPostPricesFrom().assertText(data.get("EXPRESS_POST_PRICES_FROM"));
		getParcelPostPricesFrom().assertText(data.get("PARCEL_POST_PRICES_FROM"));
		
	}
	public QAFWebElement getFrom() {
		return from;
	}


	public QAFWebElement getTo() {
		return to;
	}

	public QAFWebElement getGo() {
		return go;
	}
		
	public QAFWebElement getExpressPost() {
		return expressPost;
	}

	public QAFWebElement getParcelPost() {
		return parcelPost;
	}
	
	public QAFWebElement getExpressPostPricesFrom() {
		return expressPostPricesFrom;
	}
	
	public QAFWebElement getParcelPostPricesFrom() {
		return parcelPostPricesFrom;
	}
	
	
}
