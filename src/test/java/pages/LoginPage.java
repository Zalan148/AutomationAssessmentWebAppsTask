package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.trello.Hooks;
import common.ElementPresenceWait;

public class LoginPage {

    public void onTheTrelloLoginPage() {
        ElementPresenceWait.waitUntilTitleVisible(Hooks.driver, "Log in to continue");
    }

    public void enterUserName(String user){
        ElementPresenceWait.waitUntilTitleVisible(Hooks.driver, "Log in to continue");
        WebElement userName = ElementPresenceWait.waitUntilClickable(Hooks.driver, Hooks.driver.findElement(By.id("username")));
        userName.sendKeys(user);
    }

    public void clickLoginWithAltassian() {
        WebElement loginButton = ElementPresenceWait.waitUntilClickable(Hooks.driver, Hooks.driver.findElement(By.id("login-submit")));
        loginButton.click();
    }

    public void enterPassword(String pwd) {
        ElementPresenceWait.waitUntilTitleVisible(Hooks.driver, "Log in to continue");
        WebElement pwdBox = ElementPresenceWait.waitUntilClickable(Hooks.driver, Hooks.driver.findElement(By.id("password")));
        pwdBox.click();
        pwdBox.sendKeys(pwd);
    }

    public void clickLogin() {
        Hooks.driver.findElement(By.id("login-submit")).click();
    }

    public void displayErrorMess() {
        Hooks.driver.findElement(By.className("error-message")).isDisplayed();
    }

    public void enterUsername(String user) {
        Hooks.driver.findElement(By.id("username")).sendKeys(user);
    }


    public void clickLoginInvalidDetails() {
        Hooks.driver.findElement(By.id("login-submit")).click();
    }
}
