package org.trello;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import pages.TemplatesPage;


public class StepDefsTemplates {

    TemplatesPage templatesPage = new TemplatesPage();

    @When("I select {string} from the featured categories")
    public void iSelectFromTheFeaturedCategories(String cat) {
        templatesPage.setSelectTemplateFromFeaturedCategories(cat);
    }

    @Then("the template gallery for {string} is displayed")
    public void theTemplateGalleryForIsDisplayed(String template) throws InterruptedException {
        Thread.sleep(5000);
        Assert.assertTrue(Hooks.driver.findElement(By.xpath("//span[contains(text(),'"+template+"')]")).isDisplayed());
    }
}
