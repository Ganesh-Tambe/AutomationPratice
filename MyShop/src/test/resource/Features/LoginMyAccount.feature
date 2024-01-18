Feature: Check the Login Functionality of demopractice Site

Background: 
Given User Should be on "https://practice.automationtesting.in/" page
When  User click on My Account Tab


#Scenario: Validate the Login Functionality with positive credentials
#
#When  User Enter the asx@gmail.com and Register@12345
#And   User click on Login button
#Then  Validate The user is Successfully Login or not
#
#Scenario Outline: Validate the Login Functionality with negative credentials
#
#When  User Enter the <username> and <password>
#And   User click on Login button
#Then  Validate user logged in or not
#
#Examples: 
#
#|username     |password      |
#|axs@gmail.com|Register@12345|

#Scenario: Validate The login functionality with propertis file
#
#When User fill all the credentials
#And  User click on Login button
#Then Validate The user is Successfully Login or not

Scenario: Validate the login functionality with Excel File

When User enters "<SheetName>" and <Rownumber>
And  User click on Login button
Then Validate The user is Successfully Login or not

Examples: 
|SheetName                 | Rownumber |
|LoginCredentials          |   1       |