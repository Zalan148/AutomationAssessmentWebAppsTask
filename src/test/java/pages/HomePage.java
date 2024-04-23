package pages;
import common.ElementPresenceWait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.trello.Hooks;

public class HomePage {
    public void clickCreateABoardLink() {
        Hooks.driver.findElement(By.xpath("//span[text()='Create a board']")).click();
    }

    public void setAddBoardTitle(String title) {
        ElementPresenceWait.waitUntilVisibilityLocated(Hooks.driver, By.xpath("//p[text()='Board title is required']"));
        WebElement addTitle = ElementPresenceWait.waitUntilClickable(Hooks.driver, Hooks.driver.findElement(By.xpath("//*[@class='nch-textfield__input lsOhPsHuxEMYEb lsOhPsHuxEMYEb VkPAAkbpkKnPst']")));
        addTitle.sendKeys(title);
    }

    public void clickCreateBoardBtn() {
        Hooks.driver.findElement(By.xpath("//button[@data-testid='create-board-submit-button']")).click();
    }
}
