package sections;

import common.ElementPresenceWait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.trello.Hooks;

public class LeftSection {
    public void navigateToHomePage() {
        ElementPresenceWait.waitUntilTitleVisible(Hooks.driver,"Boards | Trello");
        WebElement homeLk = ElementPresenceWait.waitUntilClickable(Hooks.driver, Hooks.driver.findElement(By.linkText("Home")));
        homeLk.click();
    }

    public void setSelectTemplateFromLeftMenu(String temp) {
        By header = By.xpath("//h1[text()='Featured categories']");
        ElementPresenceWait.waitUntilVisibilityLocated(Hooks.driver, header);
        By selectTemplateFromLeftMenu = By.xpath("//span[@class='DD3DlImSMT6fgc'][contains(text(),'"+temp+"')]");
        WebElement selLeftMenu = ElementPresenceWait.waitUntilClickable(Hooks.driver,Hooks.driver.findElement(selectTemplateFromLeftMenu) );
        selLeftMenu.click();
    }

    public void navigateToTempPage() {
        ElementPresenceWait.waitUntilTitleVisible(Hooks.driver, "Boards | Trello" );
        WebElement navTemp = ElementPresenceWait.waitUntilClickable(Hooks.driver, Hooks.driver.findElement(By.xpath("//span[@class='DD3DlImSMT6fgc'][contains(text(),'Templates')]")));
        navTemp.click();
    }
}
