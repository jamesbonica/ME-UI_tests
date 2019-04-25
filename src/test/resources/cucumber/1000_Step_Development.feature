#Author: jim@moneyexperience.com
Feature: 1000 Step Development
  Description:
  As an Administrator of the Money Experience Simulator
  I want to allow registered users to login using specific credentials
  So I can ensure only licensed users are accessing a course

  #1
  @smoketest
  Scenario: Money Experience displays the username of a registered user in the top menu
    When a user "joeyvitamins-counselor" logs in to ME with password "password"
    Then ME must display the username "joeyvitamins-counselor" in the top menu
    And the user logs out

  #2
  @smoketest
  Scenario: Money Experience displays the username of a registered user in the top menu
    When a user "joeyvitamins-counselor" logs in to ME with password "password"
    Then ME must display the username "joeyvitamins-counselor" in the top menu
    And the user logs out

  #3
  @smoketest
  Scenario: User resets lesson progress to Lesson 1
    Given a user "joeyvitamins-counselor" logs in to ME with password "password"
    When a user resets the user progress to Lesson 1

  #4
  @ME-905
  Scenario: User sets priorities at start of Lesson
    Given a user "joeyvitamins-counselor" logs in to ME with password "password"
    And a user resets the user progress to Lesson 1
    And a user clicks the Begin Button at the start of the lesson
    And a user sets priorities in the following order:
      | Education   |
      | Adventure   |
      | Health      |
      | Community   |
      | Career      |
      | Family      |
      | Luxury      |
      | Security    |
      | Social Good |
      | Free Time   |
