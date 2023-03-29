Feature: Login Functionlaity

Scenario: Login with Valid Credentails
Given User navigate to Login page
When User enters Valid Email "satyaa75@gmail.com" in Email Field
And User enters Valid Password "Satya@0312" in password field
And user click on Login button
Then User should get login in sucessfully 

Scenario: Login with Invalid Credentials
Given User navigate to Login page
When User enter the Invaild Email "sdfdf@gmail.com" in Email field
And User enter the Invalid Password "sfdf" in password field
And user click on Login button
Then User should get a proper warning message about crediantail mismatch

Scenario: Login with Invalid email and valid password
Given User navigate to Login page
When User enter the Invaild Email "sdfdf@gmail.com" in Email field
And User enters Valid Password "Satya@0312" in password field
And user click on Login button
Then User should get a proper warning message about crediantail mismatch

Scenario: Login with Vlaid email and Invalid Password
Given User navigate to Login page
When User enters Valid Email "satyaa75@gmail.com" in Email Field
And User enter the Invalid Password "sfdf" in password field
And user click on Login button
Then User should get a proper warning message about crediantail mismatch

Scenario: Login with out providing the email Id and Password
Given User navigate to Login page
When user not provided any email in email field
And User not provided any password in Password field
And user click on Login button
Then User should get a proper warning message about crediantail mismatch
