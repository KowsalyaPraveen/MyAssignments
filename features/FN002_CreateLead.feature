Feature: Lead Creation in Leaftaps Application
#@BeforeMethod
#Background:
#    Given user launch the browser
#    And user loads the application url

@fillingMandatoryFieldsOnly@sanity
Scenario Outline: User tries to create a new Lead by filling the mandatory fields
    Given user enters username as 'DemoSalesManager'
    And user enters password as 'crmsfa'
    When user clicks the login button
    Then user redirected to welcome page
    When user clicks 'CRM/SFA' link
    And user clicks 'Leads' link
    And user clicks 'Create Lead' link
    Given user enters Company Name as '<cname>'
    And user enters First name as '<fname>'
    And user enters Last name as '<lname>'
    When user clicks Create Lead button
    Then user redirected to View Lead page
    
  Examples: 
   |cname|fname|lname|
   |Qeagle|Bhuvanesh|M|
   |Testleaf|Harrish|A|
   |Qualitest|Vineeth|R|
    
@withoutFillingMandatoryFields@smoke@LT1202
Scenario: User tries to create a new Lead without filling the mandatory fields
    Given user enters username as 'democsr2'
    And user enters password as 'crmsfa'
    When user clicks the login button
    Then user redirected to welcome page
    When user clicks 'CRM/SFA' link
    And user clicks 'Leads' link
    And user clicks 'Create Lead' link
    #Given user enters Phone Number as 87080
    When user clicks Create Lead button
    But user should view the error message
   
    