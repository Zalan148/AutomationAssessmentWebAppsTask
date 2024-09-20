package sections;

import common.ElementPresenceWait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.trello.Hooks;

public class HeaderSection {
    public void clickAccountIcon() {
        ElementPresenceWait.waitUntilTitleVisible(Hooks.driver,"Home | Trello");
        WebElement setLink = ElementPresenceWait.waitUntilClickable(Hooks.driver, Hooks.driver.findElement(By.xpath("//Span[contains(text(), 'Settings')]")));
        setLink.click();
        WebElement acctIcn = ElementPresenceWait.waitUntilClickable(Hooks.driver, Hooks.driver.findElement(By.xpath("//span[@title='zalan.wadood (zalanwadood1)']")));
        acctIcn.click();
    }

    public void clickLogoutLink() {
        ElementPresenceWait.waitUntilTitleVisible(Hooks.driver,"Zalan Wadood's workspace");
        WebElement logoutLk = ElementPresenceWait.waitUntilClickable(Hooks.driver, Hooks.driver.findElement(By.xpath("//span[contains(text(),'Log out')]")));
        logoutLk.click();
    }

    public void clickDotsTopNavBar() {
        ElementPresenceWait.waitUntilTitleVisible(Hooks.driver,"Home | Trello");
        WebElement clickDots = ElementPresenceWait.waitUntilClickable(Hooks.driver, Hooks.driver.findElement(By.xpath("//span[@data-testid='ApplicationSwitcherIcon']")));
        clickDots.click();
    }

    public void enterSearchCriteria(String search) {
        By header = By.xpath("//h1[text()='Featured categories']");
        ElementPresenceWait.waitUntilVisibilityLocated(Hooks.driver, header);
        WebElement enterSearch = ElementPresenceWait.waitUntilClickable(Hooks.driver, Hooks.driver.findElement(By.xpath("//*[@placeholder='Search']")));
        enterSearch.click();
        enterSearch.sendKeys(search);
    }

    public void setInformationIconNavBar() {
        ElementPresenceWait.waitUntilTitleVisible(Hooks.driver,"Boards | Trello");
        WebElement setInfoIcon = ElementPresenceWait.waitUntilClickable(Hooks.driver, Hooks.driver.findElement(By.xpath("//span[@data-testid='HelpIcon']")));
        setInfoIcon.click();
    }

    public void clickWorkspacesDropdown() {
        By header = By.xpath("//h1[text()='Featured categories']");
        ElementPresenceWait.waitUntilVisibilityLocated(Hooks.driver, header);
        WebElement workSpacesDd = ElementPresenceWait.waitUntilClickable(Hooks.driver, Hooks.driver.findElement(By.xpath("//span[@class='kpv7OitsgQTIxo'][text()='Workspaces']")));
        workSpacesDd.click();
    }

    public void setNotificationsIconNavBar() {
        ElementPresenceWait.waitUntilTitleVisible(Hooks.driver,"Boards | Trello");
        WebElement setNotif = ElementPresenceWait.waitUntilClickable(Hooks.driver, Hooks.driver.findElement(By.xpath("//button[@data-testid='header-notifications-button']")));
        setNotif.click();
    }
}
