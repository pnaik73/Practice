
Feature: Login1

  Scenario: Validate user is able to login using valid username and password
    
    Given Browser should be launched and url is working
    And User clicks on login link
    When user enters "sumanthchinivar16@gmail.com" and "Rowdy@123"
    Then user should be logged in

  