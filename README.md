# SeleniumFrameworkBlank

1. pageObjects 
  - methods that return WebElements (HtmlElements) must be private.
  - all pageObjects inherit from Page class and its constructor that has WebDriver and WebDriverWait.
  
2. utilities
  - HtmlElement class implements WebElement interface and adds Logger classes methods for creating logs. It improves logs with adding WebElements' readable hard-coded names instead of their generated IDs.

