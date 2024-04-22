package org.trello;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Random;
import java.io.File;
import java.io.IOException;

public class Hooks {

    static public WebDriver driver;


    @Before
    public void setup(){
       System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://trello.com/login");
    }

    @After
    public void tearDown(Scenario scenario) throws IOException {


        if (scenario.isFailed()){
            int leftLimit = 97; // letter 'a'
            int rightLimit = 122; // letter 'z'
            int targetStringLength = 10;
            Random random = new Random();
            String generatedString = random.ints(leftLimit, rightLimit + 1)
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
            File screenshotFile = ((TakesScreenshot) Hooks.driver).getScreenshotAs(OutputType.FILE);
            File destfile = new File("C://Users//ZalanWadood//"+generatedString +".png");
            FileUtils.copyFile(screenshotFile, destfile);
        }

        Hooks.driver.close();

    }
}
