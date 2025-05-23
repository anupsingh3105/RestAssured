package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features/city.feature",
        glue = {"steps.StepDefinitions"},
        plugin = {"pretty"},
        tags = "@Test"
)
public class Runner {

}
