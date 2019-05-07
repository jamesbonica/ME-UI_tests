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
    And a user clicks the Next Button
    And a user clicks the Next Link 2 times
    And a user chooses the following responses in the Chat with Tess:
      | carouselOrSlider | choice    | navigationDirection |
      # For example, let's pick a job for you to have during the summer after high school.
      # What kind of job would you try to get?
      | text carousel    | Farm Hand | right               |
    And a user clicks the Next Link
    And a user goes through the storyboards
    And A user clicks Go when Tess sends a new message
    And a user chooses the following responses in the Chat with Tess:
      | carouselOrSlider | choice                            | navigationDirection |
      # Do you plan to attend college after high school?
      |                  | Yes I'm going to college          |                     |
      # Will you need to take out student loans?
      |                  | Yeah, I'll need loans             |                     |
      # Do you know how much your student loans will be?
      |                  | Yes                               |                     |
      # How much will your loans be?
      | slider           |                            80,000 |                     |
      # Do you plan to pursue an advanced degree?
      |                  | No                                |                     |
      # You've selected a summer job already, but do you plan to have a job while in school?
      |                  | Yes                               |                     |
      | text carousel    | Fitness Instructor                | right               |
      # Do you plan to work full-time or part-time?
      |                  | Part-time                         |                     |
      # What are your eating habits like?
      |                  | Fresh and organic ($$)            |                     |
      # What's your travel style?
      |                  | Tent and a backpack ($)           |                     |
      # What's your average weekend like?
      |                  | Out on the town ($$)              |                     |
      # What is your fitness routine like?
      |                  | A morning run ($)                 |                     |
      # What is your gadget status?
      |                  | Last year's model works fine ($$) |                     |
      # What best describes your fashion choices?
      |                  | Thrift-store treasure hunt ($)    |                     |
      # Ready to move on?
      |                  | Yes                               |                     |
      # At this age, what kind of place would you like to live in?  Choose an option...
      | image carousel   | Live with Family                  | right               |
      # What kind of car would you like to buy?
      | image carousel   | Public Transportation             | right               |
    And a user clicks the Next Button on the Optional Narratives Dashboard
    And a user clicks the Finish Lesson on the Lessson Checkpoint Page
