@url
Feature: Verfiy the Application Url

  Scenario Outline: Verify the Url with valid Credintials.
    
    Given User Should Enter the WebDriver.
    
    When User should Enter the Url "<Url>"
    
    Then  User should verify after Url success message
    
    Example:
    |Url|
    |https://www.ozsale.com.au/|

