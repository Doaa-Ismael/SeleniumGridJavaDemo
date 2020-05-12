import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.Assert;
import org.junit.*;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.WebElement;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class SeleniumGrid {
    protected RemoteWebDriver driver;
    public AppiumDriverLocalService service;

    static String HUB_URL = "http://localhost:4444/wd/hub";

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    public void actualTest(RemoteWebDriver driver) {
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        WebElement element =  driver.findElementByXPath("//android.widget.TextView[@content-desc=\"headerText\"]");
//      WebElement element =  driver.findElementByClassName("headerText");
        String elText = element.getText();
        Assert.assertEquals(elText, "Welcome to Appium!");
    }
}

