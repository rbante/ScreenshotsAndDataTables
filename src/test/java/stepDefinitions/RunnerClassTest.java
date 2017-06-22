package stepDefinitions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
			features = "src/test/resource",
			glue = "classpath:stepDefinitions",
			plugin = {"pretty", "html:target/html", "json:target/jsonreport.json"},
			monochrome = true
		)
public class RunnerClassTest {

}
