package testRunner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/features"},
        glue = {"stepDefinitions"},
         //tags = "@smoketest",
        monochrome = true,
        plugin = {"pretty", "html:target/cucumber-html-report.html", "json:target/cucumber-reports/cucumber.json",
                "junit:target/cucumber-reports/cucumber.xml"}
)

public class TestRunnerTestNG extends AbstractTestNGCucumberTests {
}
