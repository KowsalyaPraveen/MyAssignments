Feature: User Authenication in Leaftaps Application

Scenario: User tries to login using the valid credentials
    
    Given user enters username as 'DemoSalesManager'
    And user enters password as 'crmsfa'
    When user clicks the login button
    Then user redirected to welcome page
    
Scenario: User tries to login using the invalid credentials
    
    Given user enters username as 'Demo'
    And user enters password as 'crm123'
    When user clicks the login button
    But user redirected to login page