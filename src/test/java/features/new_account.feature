Feature: New Account Page 
	As a user I want a new account page so that accounts can be created.
#	
#Scenario: C234 - New account page should display with error 
#	Given a user with username "demo@techfios.com" and password "abc123" 
#	When user navigates to New Account Page 
#	Then new account page should display 
	
#Scenario Outline: C235 - User should be able to create a new account 
#	Given a user with username "<username>" and password "<password>" 
#	When user navigates to New Account Page 
#	When user create new account using title "<title>" Description "<description>" Amount "<amount>" 
#	Examples: 
#		|username		  |password|title|description |amount|
#		|demo@techfios.com|abc123  |Shrimp|Two Topping|10    |
#		|demo@techfios.com|abc123  |Sandwich| Kabab   |5     |
		
Scenario: C234 - New account page should display with error 
	Given a user with username
	When user navigates to New Account Page 
	Then new account page should display 
