package RunnerClass;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features= {"./src/test/java/Featurefile/login.feature"},glue= {"stepDefination"},
plugin= {"html:Reports/HTMLReport.html",
         "json:Reports/JSONReport.html",
         "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class RunnerClass extends AbstractTestNGCucumberTests {
	private void Sysout() {
		// TODO Auto-generated method stub

	}

}
