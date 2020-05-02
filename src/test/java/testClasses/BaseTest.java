package testClasses;

import com.google.common.io.Files;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pageObjects.HomePage;
import utilities.Page;
import utilities.WindowManager;

import java.io.File;
import java.io.IOException;

public class BaseTest {
    //private static EventFiringWebDriver driver;
    protected static WebDriver driver;
    protected static WebDriverWait wait;
    private static String url = "";
    protected static HomePage hp;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver(getChromeDriverOptions());
        wait = new WebDriverWait(driver, 8);
        /*
        if the project needs EventFiringWebDriver implementation, add these two lines
        driver = new EventFiringWebDriver(new ChromeDriver(getChromeOptions())); ----> this one goes instead of line no 31
        driver.register(new EventListener());
         */

    }

    @BeforeMethod
    public void goToHomePage() {
        driver.get(url);
        hp = new HomePage(driver, wait);
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void recordFailure(ITestResult result) {
        if (ITestResult.FAILURE == result.getStatus()) {
            var camera = (TakesScreenshot) driver;
            File screenshot = camera.getScreenshotAs(OutputType.FILE);
            try {
                Files.move(screenshot, new File("resources/failedTestScreenshots/" + result.getName() + ".png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

    private ChromeOptions getChromeDriverOptions() {
        ChromeOptions options = new ChromeOptions();
        options.setHeadless(true);
        options.addArguments("--silent");
        return options;
    }

    public WindowManager getWindowManager() {
        return new WindowManager(driver, wait);
    }
}