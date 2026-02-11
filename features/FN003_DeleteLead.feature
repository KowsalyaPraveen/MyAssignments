Feature: Lead creation in leaftaps Application 

#Background:
#    Given user launch the browser
#    And user loads the application url
	
	
Scenario:
User tries to create a new Lead by filling the mandatory fields 
	Given user enters username as 'democsr2' 
	And user enters password as 'crmsfa' 
	When user clicks the login button 
	Then user redirected to welcome page 
	When user clicks 'CRM/SFA' link 
	And user clicks 'Leads' link 
	And user clicks 'Create Lead' link 
	Given user enters Company Name as 'Qeagle' 
	And user enters First name as 'Kowsalya' 
	And user enters Last name as 'M' 
	And user enters phone number in create lead Page as '9899' 
	When user clicks Create Lead button 
	Then user redirected to View Lead page 
	

		
Scenario: User tries to delete a Lead by phone number 
	Given user enters username as 'Demosalesmanager' 
	And user enters password as 'crmsfa' 
	When user clicks the login button 
	Then user redirected to welcome page 
	When user clicks 'CRM/SFA' link 
	And user clicks 'Leads' link 
	And user clicks 'Find Leads' link
	Given user enters phone number as '9899'
	When user clicks find leads button
	And user clicks on first data
	And user clicks 'Delete' link
	And user clicks 'Find Leads' link
	Given user enters the deleted lead id
	When user clicks find leads button
	Then user gets no records message 
	
