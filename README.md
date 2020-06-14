# SeleniumFrameworkBlank

1. pageObjects 
  - methods that return WebElements must be private.
  - all pageObjects inherit from Page class and its constructor that instantiates WebDriver and WebDriverWait.
  
2. classesUtils
  - WindowManager
  - Logger
  
3. testClasses
  - where actual tests are located
  
4. testUtils
  - BrowserFactory
  - ReportManager
  - TestListener

