# Prerequisite
The system requirements information are below:
- BDD
- Java 8+
- Maven (prefer latest version)
- Selenium
- Eclipse (prefer latest version)

# Instructions
Maven directory structure:
 
- The 'config' directory contains testng.xml file, and is a place holder for configuration files.

- The 'resources' directory contains all required resources including properties files and data files, and is a place holder for other resources.

- The 'src' directory contains all java files and is a place holder for other java files.

- The 'test-results' directory contains result files.

- The 'scenarios' directory is the default place holder for all the scenario files (bdd files). 

To change/modify dependencies, check pom.xml

To run the project, from command prompt go to project home and run mvn. Open test-results/emailable-report.html to view results.
# Assumption
- Restricted to domestic postage only

# Note 
This project uses Chrome driver and it requires Chrome driver binary. You need to download and set webdriver.chrome.driver property in application.properties file with driver binary path.

Locators are separated from code (com.auspost.loc). This approach has two benefits:
- First of all, you don’t need to hardcode or fix strategy for locator in code. With qaf locator strategy you can easily switch from one locator to another locator either strategy or locator value.
- Secondly, you can separate out locator outside your code by using locator repository, where you can maintain locator without code change 

There is one POM (Page Object Model): CalculatePostagePage located at com.aupost.pom and the project uses excel file as data driven test. 

BDD are located at scenarios.com.auspost.features

Steps are located at com.auspost.steps

This is the test report https://drive.google.com/file/d/18C7soXufggmjVwhJj3UsNOpYWMShjOOO/view?usp=sharing

Due to limitted timeline, (Optional) Bonus points with entering size, weight, delivery date feature, has not been implemented yet

Please refer https://qmetry.github.io/qaf/ for more information

Thanks,

Thu



