Feature: Register for the practice Demosite

Scenario: Register with Valid credentials

Given open the given "https://practice.automationtesting.in/" url
When  click on My Account Tab
Then  Enter the asx@gmail.com and Register@12345
Then  click on Register button
Then  Validate the user is Register Successfully or not