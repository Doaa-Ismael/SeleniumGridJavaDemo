
import io.appium.java_client.MobileBy;
import org.aspectj.lang.annotation.After;
import io.appium.java_client.MobileElement;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.service.local.AppiumDriverLocalService;

import java.net.URL;
import java.util.concurrent.TimeUnit;


public class SeleniumGrid {
    protected AppiumDriver driver;
    public AppiumDriverLocalService service;

    static String HUB_URL = "http://localhost:4444/wd/hub";

//    @After
//    public void tearDown() {
//        if (driver != null) {
//            driver.quit();
//        }
//    }

    @Before
    public void setup() {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("deviceName", "Pixel_ASHTAR_HPEmulator");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("app", "/Users/doaa/IdeaProjects/seleniumGridDemo/src/app-release.apk");
        service = AppiumDriverLocalService.buildDefaultService();
        driver = new AndroidDriver(service.getUrl(), caps);
    }

    @Test
    public void actualTest() {
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        MobileElement element = (MobileElement) driver.findElementByAccessibilityId("headerText");
        String elText = element.getText();
        Assert.assertEquals(elText, "Welcome to Appium!");
    }
}