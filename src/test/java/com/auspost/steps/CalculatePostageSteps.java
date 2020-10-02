package com.auspost.steps;

import java.util.Map;

import org.openqa.selenium.Alert;
import org.testng.Assert;

import com.auspost.pom.CalculatePostagePage;
import com.qmetry.qaf.automation.step.QAFTestStep;
import com.qmetry.qaf.automation.ui.WebDriverTestBase;

public class CalculatePostageSteps {
	
	CalculatePostagePage calculatePostagePage = new CalculatePostagePage();
	@QAFTestStep(description="Launch the Calculate postage & delivery times page")
	public void launchTheCalculatePostageDeliveryTimesPage(){
		calculatePostagePage.launchPage(null);
	}
	
	@QAFTestStep(description="Enter source, destination postcodes and hit Go button {0}")
	public void enterSourceDestinationPostcodesAndHitGoButton(Map<String, String> data){
		calculatePostagePage.calculatePostage(data);
		
	}
	
	@QAFTestStep(description="Validate cost and post types {0}")
	public void validateCostAndPostTypes(Map<String, String> data){
		calculatePostagePage.validateTypeCost(data);
	}
	
	
}
