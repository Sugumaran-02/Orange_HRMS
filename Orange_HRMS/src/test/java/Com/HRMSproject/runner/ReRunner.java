package Com.HRMSproject.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "@failedscenarios/failed_scearios.txt",
		glue ="Step_definitions",
		monochrome =true
		)

public class ReRunner {

}
