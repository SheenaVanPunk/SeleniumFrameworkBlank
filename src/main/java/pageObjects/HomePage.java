package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.HtmlElement;
import utilities.Page;

public class HomePage extends Page {
// example for a page object that inherits from Page and its constructor

    public HomePage(WebDriver driver, WebDriverWait wait){
        super(driver, wait);
    }

}
