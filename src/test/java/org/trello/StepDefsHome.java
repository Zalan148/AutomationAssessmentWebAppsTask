package org.trello;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.HomePage;


public class StepDefsHome {

    HomePage homePage = new HomePage();

    @Then("A board is created")
    public void aBoardIsCreated() throws InterruptedException {
        Thread.sleep(5000);
        Assert.assertEquals(Hooks.driver.getTitle(), "Test | Trello");

    }

    @When("I click on the Create a board link")
    public void iClickOnTheCreateABoardLink() {
        homePage.clickCreateABoardLink();

    }

    @And("Enter a board title from home page")
    public void enterABoardTitleFromHomePage() {
        homePage.setAddBoardTitle("Test");

    }

    @And("Click Create Board button from home page")
    public void clickCreateBoardButtonFromHomePage() {
        homePage.clickCreateBoardBtn();

    }
}
