package utilities;

import org.openqa.selenium.*;

import java.util.List;

public class HtmlElement implements WebElement {

        private WebElement element;
        private String name;

        public HtmlElement(String name, WebElement element){
            this.element = element;
            this.name = name;

        }

    @Override
        public void click() {
            new Logger().step("Click on " + name);
            element.click();
        }

        @Override
        public void submit() {
            element.submit();
        }

        @Override
        public void sendKeys(CharSequence... charSequences) {
            new Logger().step("Type " + charSequences + " in " + name);
            element.sendKeys(charSequences);
        }

        @Override
        public void clear() {
            new Logger().step("Clear " + name);
            element.clear();
        }

        @Override
        public String getTagName() {
            return element.getTagName();
        }

        @Override
        public String getAttribute(String s) {
            return element.getAttribute(s);
        }

        @Override
        public boolean isSelected() {
            return element.isSelected();
        }

        @Override
        public boolean isEnabled() {
            return element.isEnabled();
        }

        @Override
        public String getText() {
            String text = element.getText();
            new Logger().info("The " + name + " is " + text);
            return element.getText();
        }

        @Override
        public List<WebElement> findElements(By by) {
            return element.findElements(by);
        }

        @Override
        public WebElement findElement(By by) {
            new Logger().info("Find element " + name);
            return element.findElement(by);
        }

        @Override
        public boolean isDisplayed() {
            return element.isDisplayed();
        }

        @Override
        public Point getLocation() {
            return element.getLocation();
        }

        @Override
        public Dimension getSize() {
            return element.getSize();
        }

        @Override
        public Rectangle getRect() {
            return element.getRect();
        }

        @Override
        public String getCssValue(String s) {
            new Logger().step("CSS Value of an element is " + s);
            return element.getCssValue(s);
        }

        @Override
        public <X> X getScreenshotAs(OutputType<X> outputType) throws WebDriverException {
            return null;
        }

        public WebElement WrappedElement() {
            return this.element;
        }

        public String Name(){
            return this.name;
        }


}
