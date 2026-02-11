package runner;

import io.cucumber.testng.CucumberOptions;
import steps.CommonBase;


@CucumberOptions(features = {"src/test/java/features/FN002_CreateLead.feature"}, glue = {"steps"}, dryRun = false,publish=true)
public class TC002_CreateLead extends CommonBase{
	

}