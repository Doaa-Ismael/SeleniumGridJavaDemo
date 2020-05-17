import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class AndroidTest extends SeleniumGrid {

    @Test
    public void testAndroid() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("deviceName", "Pixel2");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("app", "/Users/doaa/IdeaProjects/seleniumGridDemo/src/app-release.apk");
        driver = new RemoteWebDriver(new URL(HUB_URL), caps);
        actualTest(driver);
    }
}