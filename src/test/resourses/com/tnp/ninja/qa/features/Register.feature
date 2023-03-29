Feature: Register Functionality

Scenario: Register with only manditory Fields
Given User Navigate to Register page
When User provide the below fields
|First Name				|Satya						|
|Last Name				|Sa								|
|E-Mail						|satya1@gmail.com	|
|Telephone				|12345678 				|
|Password					|123456						|
|Password Confirm	|123456						|
And User select the agree Checkbox
And user click on submit button
Then User Account should be created sucessfully

Scenario: Register with All the Fields
Given User Navigate to Register page
When User provide the below fields
|First Name				|Satya						|
|Last Name				|Sa								|
|E-Mail						|satya1@gmail.com	|
|Telephone				|12345678 				|
|Password					|123456						|
|Password Confirm	|123456						|
And User select the NewsLetter as yes radio button
And User select the agree Checkbox
And user click on submit button
Then User Account should be created sucessfully

Scenario: Register Duplicate account
Given User Navigate to Register page
When User provide the below fields
|First Name				|Satya						|
|Last Name				|Sa								|
|E-Mail						|satya1@gmail.com	|
|Telephone				|12345678 				|
|Password					|123456						|
|Password Confirm	|123456						|
And User select the NewsLetter as yes radio button
And User select the agree Checkbox
And user click on submit button
Then User should get a proper warning message about duplicate account


Scenario: Register Duplicate account
Given User Navigate to Register page
When User dont enter any fields
And user click on submit button
Then User should get a proper warning message about Manditatory fields




