package org.trello;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import sections.LeftSection;

public class StepDefsLeftSection {

    LeftSection leftSection = new LeftSection();

    @And("I am on the Home page")
    public void iAmOnTheHomePage() {
        leftSection.navigateToHomePage();
    }

    @When("I select {string} from the left hand side menu")
    public void iSelectFromTheLeftHandSideMenu(String temp) {
        leftSection.setSelectTemplateFromLeftMenu(temp);
    }

    @And("I am on the Templates page")
    public void iAmOnTheTemplatesPage() {
        leftSection.navigateToTempPage();
    }
}
