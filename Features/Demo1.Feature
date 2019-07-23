Feature: login Feature
Scenario: User enters Username and Password
	Given the login page is opened
	When user enters lalitha as username
	And userenters password123 as password
	Then user will find himself on testmeapphomepage
	
	