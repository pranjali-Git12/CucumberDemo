package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src\\test\\resources\\Login"},
glue={"StepDefinition"},
monochrome=true//to make the console output in a better format/readable format

)


public class TestRunner {

}
