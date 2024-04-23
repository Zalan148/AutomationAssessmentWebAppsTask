package pages;

import common.ElementPresenceWait;
import org.openqa.selenium.By;
import org.trello.Hooks;
import org.openqa.selenium.WebElement;


public class BoardsPage {
    public void boardsPageDisplayed() {
        ElementPresenceWait.waitUntilTitleVisible(Hooks.driver, "Boards | Trello");
        ElementPresenceWait.waitUntilVisible(Hooks.driver, Hooks.driver.findElement(By.xpath("//button[contains(text(),'View all closed boards')]")));
    }

    public void createNewBoard() {
        WebElement createNewBd = ElementPresenceWait.waitUntilClickable(Hooks.driver, Hooks.driver.findElement(By.xpath("//div[@class='board-tile mod-add']")));
        createNewBd.click();
    }

    public void setAddBoardTitle(String title) {
        ElementPresenceWait.waitUntilVisibilityLocated(Hooks.driver, By.xpath("//p[text()='Board title is required']"));
        WebElement l = ElementPresenceWait.waitUntilClickable(Hooks.driver, Hooks.driver.findElement(By.xpath("//*[@data-testid='create-board-title-input']")));
        l.click();
        l.sendKeys(title);
    }

    public void setSelectBackground() {
        WebElement backGd = ElementPresenceWait.waitUntilClickable(Hooks.driver, Hooks.driver.findElement(By.xpath("//button[@style='background-color: rgb(11, 80, 175); background-image: url(\"/assets/d106776cb297f000b1f4.svg\");']")));
        backGd.click();
    }

    public void clickCreateBoardBtn() {
        Hooks.driver.findElement(By.xpath("//button[@data-testid='create-board-submit-button']")).click();
    }

    public void clickExistingBoard() {
        Hooks.driver.findElement(By.xpath("//div[@class='board-tile-details-sub-container']")).click();
    }

    public void setViewAllClosedBoards() {
        Hooks.driver.findElement(By.xpath("//button[text()='View all closed boards']")).click();
    }
}
