package org.trello;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import sections.HeaderSection;

import static org.openqa.selenium.Keys.ARROW_DOWN;
import static org.openqa.selenium.Keys.ENTER;

public class StepDefsHeaderSection {

    HeaderSection headerSection = new HeaderSection();

    @When("I click on the Account icon")
    public void iClickOnTheAccountIcon() {
        headerSection.clickAccountIcon();
    }

    @And("Click on the Logout link")
    public void clickOnTheLogoutLink() {
        headerSection.clickLogoutLink();
    }

    @When("I click the dots icon from the top navigation bar")
    public void iClickTheDotsIconFromTheTopNavigationBar() {
        headerSection.clickDotsTopNavBar();
    }

    @Then("the More from Atlassian menu options are displayed")
    public void theMoreFromAtlassianMenuOptionsAreDisplayed() throws InterruptedException {
        Thread.sleep(5000);
        Assert.assertTrue(Hooks.driver.findElement(By.xpath("//span[contains(text(),'More Atlassian products')]")).isDisplayed());
    }

    @When("I enter search criteria into the search box")
    public void iEnterSearchCriteriaIntoTheSearchBox() {
        headerSection.enterSearchCriteria("Test");
    }

    @Then("able to select a search result")
    public void ableToSelectASearchResult() throws InterruptedException {
        Thread.sleep(5000);
        WebElement searchresults = Hooks.driver.findElement(By.xpath("//*[@data-test-id='search-dialog-input']"));
        searchresults.sendKeys(ARROW_DOWN);
        searchresults.sendKeys(ENTER);
        Thread.sleep(5000);
        Assert.assertEquals(Hooks.driver.getTitle(), "Test | Trello");
    }

    @When("I click on the information icon")
    public void iClickOnTheInformationIcon() {
        headerSection.setInformationIconNavBar();
    }

    @Then("information menu options are displayed")
    public void informationMenuOptionsAreDisplayed() throws InterruptedException {
        Thread.sleep(5000);
        Assert.assertTrue(Hooks.driver.findElement(By.xpath("//a[text()='Pricing']")).isDisplayed());
    }

    @Then("account menu options are displayed")
    public void accountMenuOptionsAreDisplayed() throws InterruptedException {
        Thread.sleep(5000);
        Assert.assertTrue(Hooks.driver.findElement(By.xpath("//h2[text()='Account']")).isDisplayed());
    }

    @When("I click on the Workspaces dropdown")
    public void iClickOnTheWorkspacesDropdown() {
        headerSection.clickWorkspacesDropdown();
    }

    @Then("my workspaces are displayed")
    public void myWorkspacesAreDisplayed() throws InterruptedException {
        Thread.sleep(5000);
        Assert.assertTrue(Hooks.driver.findElement(By.xpath("//h2[@class='HvHJoWyfA49Zz5'][contains(text(),'Your Workspaces')]")).isDisplayed());
    }

    @When("I click on the Notifications icon")
    public void iClickOnTheNotificationsIcon() {
        headerSection.setNotificationsIconNavBar();
    }

    @Then("notification menu options are displayed")
    public void notificationMenuOptionsAreDisplayed() throws InterruptedException {
        Thread.sleep(5000);
        Assert.assertTrue(Hooks.driver.findElement(By.xpath("//h2[text()='Notifications']")).isDisplayed());
    }
}
