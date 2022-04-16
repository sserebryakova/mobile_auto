package gb.cucumber.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/test/resources/features"},
        glue = {"src/test/java/gb/cucumber/steps", "src/test/java/gb/cucumber/hooks"}
)
public class RunnerTest extends AbstractTestNGCucumberTests {
}

