Feature: Application Login

Background:
Given User setup the enteries in database
When Launch the browese from config variables
And hit the homepage url of banking site 

@RegreesionTest @Admin
Scenario Outline: Admin Page Default Login

Given User is on netbanking landing page
When User login into application with <UserName> and password "<Password>" combination
Then HomePage is displayed
And Cards are displayed

Examples:
	| UserName   | Password |
	| debit user | hello12  |
	| admin user | vish12   |

@SmokeTest @Default
Scenario: User Page Default Login

Given User is on Practice landing page
When User login into application 
|vishnu|
|Bhagwan|
|Vaikunth@gmail.com|
|12343567|
Then HomePage is displayed
And Cards are displayed
	
	