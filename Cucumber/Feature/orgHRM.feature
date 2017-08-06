Feature: Orangehrm login and logout

 		Scenario: Login TC
 			Given browser launched and navigated to url
 			When user enters username and password 
 			And clicks on login
 			Then welcome admin message displayed
 			
 		Scenario: logout TC
 			When Tester clicks on welcome admin link
 			And also clicks on logout 	
 			Then Login page displayed
 			