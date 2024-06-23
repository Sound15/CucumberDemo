package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="FeatureFiles/Background.feature", 
                 glue={"stepdefnitions","hooks"}
                 //dryRun=true,
                 //plugin= {"pretty","html:report/WebReport","json:report/jsonreport.json","junit:report/xmlreport.xml"}
                 //tags="@DataDriven and @SimpleLogin"
                 //tags="@Hooks"
		        )
public class Runnerclass {

}
