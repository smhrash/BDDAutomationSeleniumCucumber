package testRunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src/test/java/features",
        glue = "stepDefinitions",
        monochrome = true,
        plugin = {"pretty","junit:target/JUnitReports/report.xml",
                "json:target/JSONReport/report.json",
        "html:target/HTMLReports"},
        tags = "@logonPage"
)

public class TestRunner {
}
