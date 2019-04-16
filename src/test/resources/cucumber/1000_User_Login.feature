#Author: jim@moneyexperience.com
Feature: 1000 User Login
  Description:
  As an Administrator of the Money Experience Simulator
  I want to allow registered users to login using specific credentials
  So I can ensure only licensed users are accessing a course

  #1
  @smoketest
  Scenario: Money Experience displays the username of a registered user in the top menu
    When a user "joeyvitamins-counselor" logs in to ME with password "password"
    Then ME must display the username "joeyvitamins-counselor!" in the top menu
    And the user logs out
    
   #2
  @smoketest
  Scenario: Money Experience displays the username of a registered user in the top menu
    When a user "joeyvitamins-counselor" logs in to ME with password "password"
    Then ME must display the username "joeyvitamins-counselor" in the top menu
    And the user logs out
  
    
  
