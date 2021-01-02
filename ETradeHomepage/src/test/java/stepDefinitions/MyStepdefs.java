package stepDefinitions;

import common.WebAPI;
import homepage.Homepage;
import io.cucumber.java.After;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class MyStepdefs extends WebAPI {

    static Homepage homepage;
    @BeforeStep
    public static void getInIt(){
        homepage = PageFactory.initElements(driver, Homepage.class);
    }


    @Given("user is in homepage")
    public void userIsInHomepage() {
        try {
            setUp(false, "browserstack", "OS X", "Catalina", "Chrome", "87",
                    "https://us.etrade.com/bank");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @When("user mouse hover on Account Types menu")
    public void userMouseHoverOnAccountTypesMenu() {
        homepage.mouseHooverOnAccountTypes();
    }

    @And("user clicks on Core Portfolios link")
    public void userClicksOnCorePortfoliosLink() {
        homepage.clickOnCorePortfolios();
    }

    @Then("user should see Meet Core Portfolios text")
    public void userShouldSeeMeetCorePortfoliosText() {
        String actualText = homepage.meetCorePortfoliosText();
        Assert.assertEquals(actualText,"Meet Core Portfolios");
    }

//    @AfterClass
//    public void tearDown(Scenario scenario) {
//        if (scenario.isFailed()) {
//            // Take a screenshot...
//            Date currentDate = new Date();
//            String screenshotFile = currentDate.toString().replace(" ","-").replace(":","-");
//            File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//            try {
//                FileUtils.copyFile(screenshot, new File("./screenshot/"+screenshotFile+".png"));
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
   // }
    @After
    public static void cleanUp(){
        driver.quit();
    }

    @When("User clicks on logon")
    public void userClicksOnLogon() {
        homepage.clickOnLogon();

    }

    @Then("user enters username {string}")
    public void userEntersUsername(String username) {
        homepage.enterUserName(username);
    }

    @And("user enters password {string}")
    public void userEntersPassword(String password) {
        homepage.enterPassword(password);
    }
    @And("user see the page title")
    public void userSeeThePageTitle() {
        String actualTitle = homepage.logonPageTitle();
        Assert.assertEquals(actualTitle,"Log On to E*TRADE | E*TRADE Financial");
    }
}
