package Com.HRMSproject.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources",
		glue ="Step_definitions",
		monochrome =true,
		publish=true,
		//plugin= {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", "rerun:failedscenarios/failed_scearios.txt", "html: target/cucumber-report/report.html", "json: target/cucumber-report/report.json", "junit: target/cucumber-report/report.xml"}
				plugin= {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", "rerun:failedscenarios/failed_scearios.txt", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"}
		)



public class runner_class {

}
