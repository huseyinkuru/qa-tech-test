Feature: Automated End2End Tests
Description: Testing End to End integration

Scenario: Submitting 3 challenges

Given user is already on the home page
When user clicks on render the challenge
And submits first challenge
And submits second challenge
And submits third challenge
And enters name
And click on submit button
Then Congratulations alert appeared

