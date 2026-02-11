package runner;

import io.cucumber.testng.CucumberOptions;
import steps.CommonBase;


@CucumberOptions(features = {"src/test/java/features/FN003_DeleteLead.feature"},
glue = {"steps"}, dryRun = false,publish=true)
public class TC003_DeleteLead extends CommonBase{
	

}