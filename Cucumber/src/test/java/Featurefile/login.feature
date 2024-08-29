Feature: Login

Scenario: Validate if user is able to log in

Given Browser is launched and navigated to URl
When User enters valid username and password
Then User should be logged in
