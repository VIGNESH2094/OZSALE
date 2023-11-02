
package testrunner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(tags = "@url or @Home",features = "src\\test\\resources\\Features",glue = "com.Stepdefinition")
public class testRunner {

}
     