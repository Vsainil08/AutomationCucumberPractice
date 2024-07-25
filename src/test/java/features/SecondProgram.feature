Feature: Application Login

Background:
When Launch the browese from config variables
And hit the homepage url of banking site

@RegreesionTest @NetBanking
Scenario Outline: NetBanking Page Default Login

Given User is on netbanking landing page
When User login into application with <UserName> and password "<Password>" combination
Then HomePage is displayed
And Cards are displayed

Examples:
	| UserName   | Password |
	| debit user | hello12  |
	| admin user | vish12   |

@SmokeTest @Mortgage
Scenario: User Page Default Login

Given User is on Practice landing page
When User login into application 
|vishal|
|saini|
|vishal081296@gmail.com|
|6789054321|
Then HomePage is displayed
And Cards are displayed
	
	