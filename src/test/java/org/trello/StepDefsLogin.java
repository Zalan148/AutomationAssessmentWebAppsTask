package org.trello;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import pages.LoginPage;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class StepDefsLogin {

    LoginPage loginPage = new LoginPage();

    @Given("I am on the Trello login page")
    public void iAmOnTheTrelloLoginPage() {
        loginPage.onTheTrelloLoginPage();
    }

    @When("I enter valid login credentials")
    public void iEnterValidLoginCredentials() throws IOException {
        InputStream input = new FileInputStream( System.getProperty("user.dir") + "/src/test/resources/config.properties");
        Properties prop = new Properties();

        // load a properties file
        prop.load(input);
        loginPage.enterUserName(prop.getProperty("db.user"));
        loginPage.clickLoginWithAltassian();
        loginPage.enterPassword(prop.getProperty("db.password"));
    }

    @And("submit the details")
    public void submitTheDetails() {
        loginPage.clickLogin();
    }

    @Then("an error message will be displayed")
    public void anErrorMessageWillBeDisplayed() throws InterruptedException {
        Thread.sleep(5000);
        loginPage.displayErrorMess();
    }

    @When("I enter no Username")
    public void iEnterNoUsername() {
        loginPage.enterUsername("");
    }

    @And("Click the Continue button")
    public void clickTheContinueButton() {
        loginPage.clickLoginWithAltassian();
    }

    @Then("Continue button remains displayed")
    public void continueButtonRemainsDisplayed() {
        Assert.assertTrue(Hooks.driver.findElement(By.id("login-submit")).isDisplayed());
    }

    @And("submit the invalid details")
    public void submitTheInvalidDetails() {
        loginPage.clickLoginInvalidDetails();
    }

    @Given("I have logged in successfully")
    public void iHaveLoggedInSuccessfully() throws IOException, InterruptedException {
        InputStream input = new FileInputStream( System.getProperty("user.dir") + "/src/test/resources/config.properties");
        Properties prop = new Properties();

        // load a properties file
        prop.load(input);

        loginPage.enterUserName(prop.getProperty("db.user"));
        loginPage.clickLoginWithAltassian();
        loginPage.enterPassword(prop.getProperty("db.password"));
        loginPage.clickLogin();
    }
}
