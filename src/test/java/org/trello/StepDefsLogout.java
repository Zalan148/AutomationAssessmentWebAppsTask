package org.trello;

import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.testng.Assert;

public class StepDefsLogout {
    @Then("I am logged out of Trello and log out of your Atlassian account page is displayed")
    public void iAmLoggedOutOfTrelloAndLogOutOfYourAtlassianAccountPageIsDisplayed() throws InterruptedException {
        Thread.sleep(5000);
        Assert.assertTrue(Hooks.driver.findElement(By.xpath("//h5[contains(text(),'Log out of your Atlassian account')]")).isDisplayed());
    }
}
