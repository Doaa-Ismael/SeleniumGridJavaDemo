import org.junit.Test;
import org.junit.experimental.ParallelComputer;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.MalformedURLException;
import java.net.URL;

public class AndroidTest2 extends SeleniumGrid {

    @Test
    public void testAndroid() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("deviceName", "Pixel_ASHTAR_HPEmulator2");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("udid", "emulator-5556");
        caps.setCapability("app", "/Users/doaa/IdeaProjects/seleniumGridDemo/src/app-release.apk");
        driver = new RemoteWebDriver(new URL(HUB_URL), caps);
        actualTest(driver);
    }

//    @Test
//    public void testAndroid2() throws MalformedURLException {
//        DesiredCapabilities caps = new DesiredCapabilities();
//        caps.setCapability("platformName", "Android");
//        caps.setCapability("deviceName", "Pixel2");
//        caps.setCapability("automationName", "UiAutomator2");
//        caps.setCapability("app", "/Users/doaa/IdeaProjects/seleniumGridDemo/src/app-release.apk");
//        driver = new RemoteWebDriver(new URL(HUB_URL), caps);
//        actualTest(driver);
//    }

    @Test
    public void testAll() {
        Result result = JUnitCore.runClasses(ParallelComputer.methods(), AndroidTest2.class);
    }
}