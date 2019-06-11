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
  @ME-937
  Scenario: User sets priorities at start of Lesson
    Given a user "configured user 1" logs in to ME with password "password"
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
      | slider           |                            20,000 |                     |
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
    # Lesson 2
    And a user resets the user progress to Lesson 2
    And a user clicks the Begin Button at the start of the lesson
    And a user clicks the Next Button
    And a user clicks the Next Link
    And a user goes through the storyboards
    And A user clicks Go when Tess sends a new message
    And a user chooses the following responses in the Chat with Tess:
      | carouselOrSlider | choice                                                        | navigationDirection |
      # Let's say your laptop breaks and you need a new one. What will you buy?
      |                  | A new basic machine ($$)                                      |                     |
      # In what might be your first place living on your own, what kind of neighborhood do you see yourself living in?
      |                  | A place that's rough around the edges ($)                     |                     |
      # How much are you spending on coffee?
      |                  | Very frequent visits to the corner cafe ($$$)                 |                     |
      # What are you MOST LIKELY up to on the weekends?
      |                  | Seeing a movie ($$)                                           |                     |
      # Do you want any pets?
      |                  | None for me ($)                                               |                     |
      # What best describes your hobbies?
      |                  | My hobbies don't really require any supplies or equipment ($) |                     |
      # Buying furniture can be expensive. Where will you buy yours?
      |                  | At a discount warehouse store ($)                             |                     |
      # How about kitchen stuff? What do you need?
      |                  | I just need the bare essentials ($$)                          |                     |
      # OK last question about adulting. What will you spend on a bed?
      |                  | I'll look for deals online ($$)                               |                     |
      #  What region would you like to live in?
      | text carousel    | A smaller, up & coming city (Like Portland, ME)               |                     |
      # Would you still like to live in a smaller up & coming city like Portland, Maine?
      |                  | Yes                                                           |                     |
      # Would you like to change the type of residence that you live in?
      |                  | No                                                            |                     |
      # OK, that's it for now! Let's move on.
      |                  | Ok                                                            |                     |
    And a user goes through the storyboards
    And a user clicks the Next Button on the Optional Narratives Dashboard
    And a user clicks the Finish Lesson on the Lessson Checkpoint Page
    # Lesson 3
    And a user resets the user progress to Lesson 3
    And a user clicks the Begin Button at the start of the lesson
    And a user clicks the Next Button
    And a user clicks the Next Link
    And a user goes through the storyboards
    And a user chooses the following responses in the Chat with Tess:
      | carouselOrSlider | choice                               | navigationDirection |
      # Would you like to change your living situation by renting or buying a new place?
      |                  | No, stay where I am                  |                     |
      # Would you like to try living in a different region?
      |                  | No                                   |                     |
      # OK let's talk about your career! What kind of career are you looking for?
      | text carousel    | Something in technology              | right               |
      # What kind of technology career?
      |                  | Tech / software developer            |                     |
      # Are you someone who cooks or eats out a lot?
      |                  | I cook at home a lot ($)             |                     |
      # When you eat out, what type of stuff do you get?
      |                  | Mostly healthy take-out ($$)         |                     |
      # What kind of stuff do you like to do when out with friends?
      |                  | Dinner and movie ($$)                |                     |
      # What about date night?
      |                  | Dinner and dancing ($$)              |                     |
      # How will you watch stuff at home?
      |                  | Big-screen with surround sound ($$$) |                     |
      # OK That's it for now! I heard Ria is back from the military, let's go see what she's up to.
      |                  | OK                                   |                     |
    And a user goes through the storyboards
    And a user clicks the Next Button on the Optional Narratives Dashboard
    And a user clicks the Finish Lesson on the Lessson Checkpoint Page
    # Lesson 4
    And a user resets the user progress to Lesson 4
    And a user clicks the Begin Button at the start of the lesson
    And a user clicks the Next Button
    And a user clicks the Next Link
    And a user goes through the storyboards
    And a user chooses the following responses in the Chat with Tess:
      | carouselOrSlider | choice                                                | navigationDirection |
      # First of all, are you still happy with where you're living, or would you like to move?
      |                  | I want to move                                        |                     |
      # Where would you like to move to?
      | text carousel    | A Southern city (Like Atlanta, or New Orleans)        | left                |
      #  Would you still like to live in a Southern city like Atlanta, or New Orleans?
      |                  | Yes                                                   |                     |
      # Would you like to change your residence, or buy a house?
      |                  | Yes                                                   |                     |
      # Where would you like to live?
      | text carousel    | Starter Home                                          | right               |
      # Would you still like to choose this option?
      |                  | Yes                                                   |                     |
      # Now let's get back to some basics. What's for dinner?
      |                  | A home cooked meal ($$)                               |                     |
      # How about your daily coffee habit?
      |                  | Daily stop to the corner cafe ($$$)                   |                     |
      # How do you stay active?
      |                  | Regular walks or runs ($)                             |                     |
      # How about your social activities?
      |                  | Quiet nights, like dinner out and a movie ($)         |                     |
      # How important is technology?
      |                  | I like tech stuff, but don't think about it much ($$) |                     |
      # Do you have any pets?
      |                  | One pet is plenty ($$)                                |                     |
      # How do you commute in the morning?
      |                  | Public transport ($$)                                 |                     |
      # Where will you buy new furniture?
      |                  | At the build-it-yourself warehouse store ($)          |                     |
      # What kind of car insurance policy will you have?
      |                  | Average deductibles and coverages ($$)                |                     |
      # How will you split the check with friends?
      |                  | Just split it evenly. It doesn't matter much. ($$)    |                     |
      # How will you reply to your friend's invite to a destination wedding?
      |                  | I'll go, but that is my wedding gift to you. ($$)     |                     |
      # How will you spend an average night out with friends?
      |                  | Low key dinner. I'll probably leave early ($)         |                     |
      # How much are you actively staying fit?
      |                  | Weekly fitness classes ($$$)                          |                     |
      # Now that you're settling into your career, would you like to adjust your 401k contribution?
      |                  | Yes                                                   |                     |
      # How much of your salary would you like to contribute?
      | slider           | 10%                                                   |                     |
      # How about a 529? Are you saving for your kids' future education?
      |                  | No                                                    |                     |
      # OK lastly, would you like to invest any of your savings?
      |                  | Yes                                                   |                     |
      # How much of your savings would you like to invest going forward?
      | slider           | 15%                                                   |                     |
      # OK, let's move onto your dashboard.
      |                  | OK                                                    |                     |
    And a user clicks the Next Button on the Optional Narratives Dashboard
    And a user clicks the Finish Lesson on the Lessson Checkpoint Page
    # Lesson 5
    And a user resets the user progress to Lesson 5
    And a user clicks the Begin Button at the start of the lesson
    And a user clicks the Next Button
    And a user clicks the Next Link
    And a user goes through the storyboards
    And a user chooses the following responses in the Chat with Tess:
      | carouselOrSlider | choice                                           | navigationDirection |
      # What neighborhood do you see yourself living in?
      |                  | Central and nice, but not extravagant ($$)       |                     |
      # How is your place furnished?
      |                  | Pretty bare. Just the essentials. ($)            |                     |
      # How often do you get your car serviced?
      |                  | Oil changes on time every time ($$)              |                     |
      # How healthily do you live?
      |                  | I pay attention to ingredients and calories ($$) |                     |
      # What best describes your hobbies?
      |                  | Something artistic ($)                           |                     |
      # When you travel, how do you like to fly?
      |                  | I’ll pay for extra legroom ($$)                  |                     |
      # How many subscriptions do you carry?
      |                  | Only a couple, like streaming music. ($)         |                     |
      # What’s your idea of a great night out with friends?
      |                  | Dinner at most ($)                               |                     |
      # Your water heater has broken. What do you do?
      |                  | Go buy a new one at the local home store ($$)    |                     |
      # You have an important meeting in the heart of the city. How will you get there?
      |                  | Take public transportation ($)                   |                     |
      # How will you handle lunches at work?
      |                  | I'll brown bag my lunch ($)                      |                     |
      # If you do have a family, how will you travel?
      |                  | Road trips and day trips ($)                     |                     |
      # Your favorite artist is playing nearby for the first time in a long time. Where are your seats?
      |                  | Best seats that are available ($$)               |                     |
      # Suddenly your back is starting to get sore pretty often. How do you handle it?
      |                  | Go to the doc just to be safe ($$)               |                     |
      # Would you like to edit how much you contribute to a 401k?
      |                  | No                                               |                     |
      # How about a 529? Are you saving for your kids' education in your 30s?
      |                  | No                                               |                     |
      # OK lastly, would you like to adjust how much you're investing?
      |                  | No                                               |                     |
      # OK, let's move onto your dashboard.
      |                  | OK                                               |                     |
    And a user clicks the Next Button on the Optional Narratives Dashboard
    And a user clicks the Continue to Next Lesson Button on the Life Progress Page
    # Lesson 6
    And a user resets the user progress to Lesson 6
    And a user clicks the Begin Button at the start of the lesson
    And a user clicks the Next Button
    And a user clicks the Next Link
    And a user goes through the storyboards
    And a user chooses the following responses in the Chat with Tess:
      | carouselOrSlider | choice                                              | navigationDirection |
      # Would you still like to live in the same place?
      |                  | Yes I’m happy where I am.                           |                     |
      # How often would you like to travel?
      |                  | A few times per year. ($$)                          |                     |
      # What does dinner look like on any given Tuesday?
      |                  | Something on the grill ($$)                         |                     |
      # You’re getting a little older, and may be paying closer attention to your health habits. What are they like?
      |                  | I watch what I eat, and go to the gym. ($$)         |                     |
      # What best describes your idea of home improvement?
      |                  | Gut renovation of a room ($$$)                      |                     |
      # What would you best describe as a “splurge” purchase in mid-life?
      |                  | A big screen TV ($$)                                |                     |
      # Do you see yourself continuing your education in any way?
      |                  | I'll read a book ($)                                |                     |
      # When you go to a concert or sporting event, where are your seats?
      |                  | Somewhere in the middle ($$)                        |                     |
      # You wake up one morning and notice your bathroom is looking pretty dingy. How will you handle it?
      |                  | Gut renovation. Rip everything out. ($$$)           |                     |
      # Your friend brought his dog in your car, and he had a little accident in the backseat.
      |                  | Vinegar and water, scrub until clean ($)            |                     |
      # You're pretty busy, and food prep is swallowing your time. How do you make it more efficient?
      |                  | Dedicate weekend time to make food for the week ($) |                     |
      # You're alone with no plans for the first time in a while. What do you do?
      |                  | Go for a daytrip somewhere ($$)                     |                     |
      # It's a very special occasion. Where do you go for a classy night out?
      |                  | Fine dining restaurant ($$$)                        |                     |
      # You've found out a certain health condition runs in your family. How do you handle?
      |                  | Get tested as a precaution ($$)                     |                     |
      # Would you like to edit how much you contribute to a 401k?
      |                  | Yes                                                 |                     |
      # How much would you like to contribute?
      | slider           | 12%                                                 |                     |
      # How about a 529? Are you saving for your kids' education in your 40s?
      |                  | No                                                  |                     |
      # OK lastly, would you like to adjust how much you're investing?
      |                  | No                                                  |                     |
      # OK, let's move onto your optional choices!
      |                  | OK                                                  |                     |
    And a user clicks the Next Button on the Optional Narratives Dashboard
    And a user clicks the Finish Lesson on the Lessson Checkpoint Page
    # Lesson 7
    And a user resets the user progress to Lesson 7
    And a user clicks the Begin Button at the start of the lesson
    And a user clicks the Next Button
    And a user clicks the Next Link
    And a user goes through the storyboards
    And a user chooses the following responses in the Chat with Tess:
      | carouselOrSlider | choice                                                         | navigationDirection |
      # Would you like to purchase a life insurance policy to protect your loved ones?
      |                  | How much does that cost?                                       |                     |
      # Would you like to purchase a life insurance policy to protect your loved ones?
      |                  | Yes                                                            |                     |
      # What kind of health insurance would you choose?
      |                  | A premium plan that lets me go to any doctor ($$$)             |                     |
      # What about car insurance? You’ve needed that your whole life. What’s more important?
      |                  | Average cost and deductibles ($$)                              |                     |
      # Would you buy travel insurance for your trips?
      |                  | I would buy a modest policy for emergencies ($$)               |                     |
      # It's the hottest summer on record, and your lawn has turned to dirt. How do you handle it?
      |                  | Buy some fertilizer and water it regularly ($$)                |                     |
      # Oops, you backed your car into a pole at the grocery store. How will you fix it?
      |                  | I won't, it's just dented now. ($)                             |                     |
      # You're getting a little older now, how healthy are you eating?
      |                  | I'm conscious of what I'm eating and make healthy choices ($$) |                     |
      # Your friend's kids are off to college and they want to plan a trip together.
      |                  | Find a discount flight somewhere for the weekend ($$)          |                     |
      # How do you imagine an average night out with friends in your 50s?
      |                  | Try to keep up with people half our age. ($$)                  |                     |
      # You have a pain in your foot that won't go away without surgery. What do you do?
      |                  | Get surgery as soon as possible ($$$)                          |                     |
      # Would you like to edit how much you contribute to your 401k?
      |                  | No                                                             |                     |
      # How about a 529? Are you still saving for your kids' education in your 50s?
      |                  | No                                                             |                     |
      # OK lastly, would you like to adjust how much you're investing?
      |                  | No                                                             |                     |
      # OK, let's move onto your dashboard.
      |                  | OK                                                             |                     |
    And a user clicks the Next Button on the Optional Narratives Dashboard
    And a user clicks the Finish Lesson on the Lessson Checkpoint Page
    # Lesson 8
    And a user resets the user progress to Lesson 8
    And a user clicks the Begin Button at the start of the lesson
    And a user clicks the Next Button
    And a user clicks the Next Link
    And a user goes through the storyboards
    And a user chooses the following responses in the Chat with Tess:
      | carouselOrSlider | choice                                                             | navigationDirection |
      # Would you like to adjust your 401k contribution?
      |                  | Yes                                                                |                     |
      # How much of your income would you like to contribute?
      | slider           | 15%                                                                |                     |
      # Would you like to buy an investment property?
      |                  | No that's a terrible idea                                          |                     |
      # Uh oh. There's a water stain on the ceiling. Your roof is leaking.
      |                  | Replace the roof ($$)                                              |                     |
      # Your car is due for a 100,000 mile service
      |                  | Get the oil and filters changed, the minimum. ($$)                 |                     |
      # You're in your 60s now, and looking at a fixed income in retirement.
      |                  | I'll buy groceries on sale, but I'm not fussing with coupons ($$)  |                     |
      # You'll have a lot more free time in retirement. How do you spend it?
      |                  | Throw myself into a new hobby. Like kayaking. Or sky diving. ($$$) |                     |
      # In your 60s, how much is your health on your mind?
      |                  | I'm making an effort to be active and healthy ($$)                 |                     |
      # OK, let’s move on!
      |                  | OK                                                                 |                     |
    And a user clicks the Next Button on the Optional Narratives Dashboard
    And a user clicks the Finish Lesson on the Lessson Checkpoint Page
    # Lesson 9
    And a user resets the user progress to Lesson 9
    And a user clicks the Begin Button at the start of the lesson
    And a user clicks the Next Button
    And a user clicks the Next Link
    And a user goes through the storyboards
    And a user chooses the following responses in the Chat with Tess:
      | carouselOrSlider | choice                                                       | navigationDirection |
      # Where will you live?
      | text carousel    | Age in place at home                                         | left                |
      # In old age, it's harder than ever to clean your house
      |                  | I'll pay a neighborhood kid to help me out ($$)              |                     |
      # Driving isn't so easy anymore. Your sight isn't what it used to be.
      |                  | Keep my car, but lean on others to drive me most places ($$) |                     |
      # Grocery shopping is harder these days. What's for dinner?
      |                  | It might take me 4 times as long, but I'm shopping ($)       |                     |
      # When getting around isn't so easy, how often do you travel?
      |                  | Whatever it takes. Can't keep me stationary. ($$$)           |                     |
      # What's your entertainment like in old age?
      |                  | Group rate on a cruise ($$$)                                 |                     |
      # What does wellness mean to you in old age?
      |                  | Frequent checkups with preventative action plans ($$)        |                     |
      # OK, that's it for your lifestyle in your senior years, let's move on.
      |                  | Ok                                                           |                     |
    And a user clicks the Next Link
    And a user clicks the Next Button on the Optional Narratives Dashboard

  @ME-1003 @API
  Scenario: APIs in ME
    Given a user "configured user 1" logs in to ME with password "for configured user 1"
    Given user "configured user 1" with password "for configured user 1" resets the user progress to Lesson 1
