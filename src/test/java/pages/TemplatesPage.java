package pages;

import common.ElementPresenceWait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.trello.Hooks;

public class TemplatesPage {
    public void setSelectTemplateFromFeaturedCategories(String cat) {
        By header = By.xpath("//h1[text()='Featured categories']");
        ElementPresenceWait.waitUntilVisibilityLocated(Hooks.driver, header);
        By selectTemplateFromFeaturedCat = By.xpath("//span[@class='A2qOFKWdcU_KeW'][contains(text(),'"+cat+"')]");
        WebElement selTemp = ElementPresenceWait.waitUntilClickable(Hooks.driver, Hooks.driver.findElement(selectTemplateFromFeaturedCat));
        selTemp.click();
    }
}
