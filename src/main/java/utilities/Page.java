package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Page {
    protected static WebDriver driver;
    protected static WebDriverWait wait;

       public Page(WebDriver driver, WebDriverWait wait){
        Page.driver = driver;
        Page.wait = wait;
    }

    public HtmlElement findElement(String name, By locator){
        return new HtmlElement(name, driver.findElement(locator));
    }

    public void waitForAllTabsToLoad(){
        int complete = driver.getWindowHandles().size();
        wait.until(ExpectedConditions.numberOfWindowsToBe(complete));
    }

    public void waitForElementVisibility(By locator){
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public void waitForElementClickability(By locator){
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public void waitForThePresenceOfElementInDom(By locator){
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    public void waitForInvisibilityOfElement(By locator){
        wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
    }

    public String getTabHandle(){
        return driver.getWindowHandle();
    }

    public void deleteAllCookies(){
        driver.manage().deleteAllCookies();
    }

}
