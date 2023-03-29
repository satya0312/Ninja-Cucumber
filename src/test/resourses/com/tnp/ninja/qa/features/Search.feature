Feature: Search Functionality

Scenario: user search for valid product
Given User opens the application
When user provide the Valid product "HP" in search field
And User clicks on Search button
Then User should get valid product displayed in search page

Scenario: User search for invalid produce
Given user opens the application
When user provide the InValid product "Honda" in search field
And User clicks on Search button
Then User should get a message abou no product matching

Scenario: User search with out any product
Given user opens the application
When User not provided any value in Search field
And User clicks on Search button
Then User should get a message abou no product matching
