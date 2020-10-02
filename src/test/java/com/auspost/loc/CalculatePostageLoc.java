package com.auspost.loc;

public interface CalculatePostageLoc {
	
	static final String FROM = "{'locator':'id=domFrom_value';'desc':'From'}";
	static final String TO = "{'locator':'id=domTo_value';'desc':'From'}";
	static final String GO = "{'locator':'id=submit-domestic';'desc':'GO'}";
	
	static final String EXPRESS_POST = "{'locator':'xpath=.//div[@id=\\'postage-options\\']//span[contains(text(),\\'Express Post\\')]';'desc':'Express Post'}";
	static final String PARCEL_POST = "{'locator':'xpath=.//div[@id=\\'postage-options\\']//span[contains(text(),\\'Parcel Post\\')]';'desc':'Parcel Post'}";
	static final String EXPRESS_POST_PRICES_FROM = "{'locator':'xpath=.//div[@id=\\'postage-options\\']//div[@class=\\'postage-service__header--domestic_parcel-express\\']//span[@class=\\'postage-service__section__price ng-binding\\']';'desc':'Express Post Prices From'}";
    static final String PARCEL_POST_PRICES_FROM = "{'locator':'xpath=.//div[@id=\\'postage-options\\']//div[@class=\\'postage-service__header--domestic_parcel-regular\\']//span[@class=\\'postage-service__section__price ng-binding\\']';'desc':'Parcel Post Prices From'}";

}
