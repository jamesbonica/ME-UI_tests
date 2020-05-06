#Author: Jim Bonica jim@moneyexperience.com
@Complete_Simulator_Essentials5
Feature: 1002 Complete Simulator Essentials 5
  Description: 
  	As a Money Experience Engineer
  	I want an automation tool to execute user choices for all TME Simulator lessons
  	So I am not required to manually simulate a user experience

  @Lesson1
  Scenario: User completes Lesson 1
    Given a user "configured user 1" logs in to ME with password "for configured user 1"
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
    And a user confirms the priorities
    And a user completes the Baseline Assessment if the user has not completed it before
    And a user clicks Next 2 times
    And a user chooses the following responses in the Chat with Tess:
      | choiceType | choice    |
      # For example, let's pick a job for you to have during the summer after high school.
      # What kind of job would you try to get?
      | text stack | Farm Hand |                     
      # Anyway that's the basic idea. Now let's meet the others, and think about your life into your early 20s.
      | text stack | OK        |                     
    And a user goes through the storyboards
    And A user clicks Go when Tess sends a new message
    And a user chooses the following responses in the Chat with Tess:
      | choiceType | choice                                          |
      #
      # Do you plan to attend college after high school?
      | text stack | Yes I'm going to college                        |
      #
      # Will you need to take out student loans?
      | text stack | Yeah, I'll need loans                           |
      #
      #  Do you know how much your student loans will be?
      | text stack | Yes                                             |
      #
      #  How much will your loans be?
      | slider     |                                          80,000 |
      #
      # What kind of school do you plan to go to?
      | text stack | In-state University                             |
      #
      # Do you plan to pursue an advanced degree?
      | text stack | No                                              |
      #
      # You've selected a summer job already, but do you plan to have a job while in school?
      | text stack | Yes                                             |
      #
      # What kind of job are you most likely to get?
      | text stack | Fitness Instructor                              |
      #
      # Do you plan to work full-time or part-time?
      | text stack | Part-time                                       |
      #
      # What are your eating habits like?
      | text stack | Fresh and organic ($$)                          |
      #
      # What's your travel style?
      | text stack | Tent and a backpack ($)                         |
      #
      # What's your average weekend like?
      | text stack | Out on the town ($$)                            |
      #
      # What is your fitness routine like?
      | text stack | A morning run ($)                               |
      #
      # What is your gadget status?
      | text stack | Last year's model works fine ($$)               |
      #
      # What best describes your fashion choices?
      | text stack | Thrift-store treasure hunt ($)                  |
      #
      # What best describes the region where you will be living?
      | text stack | A smaller, up & coming city (Like Portland, ME) |
      #
      # What kind of place would you like to live in?
      | text stack | Rent-free with Family $0/mo                     |
      #
      # Ready to move on?
      | text stack | Yes                                             |

  #  And a user selects the "Take a Trip" Optional Narrative from the Dashboard
  #    And the user chooses the following responses in the Optional Narrative Chat with Tess:
  #      | carouselOrSlider | choice                           |
  #      # Would you like to take a trip somewhere?
  #      |                  | Probably                         |
  #      # Where would you like to go?
  #      | text carousel    | Outdoor adventure in New Zealand |
  #      # A week in ... Still game?
  #      |                  | Book it!                         |
  #      # For now, let's go back to the dashboard.
  #      |                  | OK                               |
      And a user clicks Continue on the Optional Narratives Dashboard
      And a user clicks Continue on the Lesson Checkpoint Page
  @Lesson2
  Scenario: User completes Lesson 2
    Given a user "configured user 1" logs in to ME with password "for configured user 1"
    And a user resets the user progress to Lesson 2
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
    And a user clicks Next
    And a user goes through the storyboards
    And A user clicks Go when Tess sends a new message
    And a user chooses the following responses in the Chat with Tess:
      | choiceType | choice                                             |
      #
      # Let's say your laptop breaks and you need a new one. What will you buy?
      | text stack | A new basic machine ($$)                           |
      #
      # In what might be your first place living on your own, what kind of neighborhood do you see yourself living in?
      | text stack | A place that's rough around the edges ($)          |
      #
      # How much are you spending on coffee?
      | text stack | Very frequent visits to the corner cafe ($$$)      |
      #
      # What are you MOST LIKELY up to on the weekends?
      | text stack | Seeing a movie ($$)                                |
      #
      # Do you want any pets?
      | text stack | None for me ($)                                    |
      #
      # What best describes your hobbies?
      | text stack | My hobbies involve some supplies or equipment ($$) |
      #
      # Buying furniture can be expensive. Where will you buy yours?
      | text stack | At a discount warehouse store ($)                  |
      #
      # How about kitchen stuff? What do you need?
      | text stack | I just need the bare essentials ($$)               |
      #
      # OK last question about adulting. What will you spend on a bed?
      | text stack | I'll look for deals online ($$)                    |
      #
      #  What region would you like to live in?
      | text stack | A smaller, up & coming city (Like Portland, ME)    |
      #
      # Would you still like to live in a smaller up & coming city like Portland, Maine?
      | text stack | Yes                                                |
      #
      # Where would you like to live?
      | text stack | Rent-free with Family $0/mo                        |
      #
      # OK, that's it for now! Let's move on.
      | text stack | Ok                                                 |
    And a user goes through the storyboards
    And a user answers 4 Post Survey Questions
    #    And a user selects the "Apply for a Credit Card" Optional Narrative from the Dashboard
    #    And the user chooses the following responses in the Optional Narrative:
    #      | carouselOrSlider | choice                                                       | navigationDirection |
    #      | image carousel   | $500 bonus and 3% cash back at your favorite online retailer | right               |
    #    And a user selects the "Who Are You Dating" Optional Narrative from the Dashboard
    #    And the user chooses the following responses in the Optional Narrative:
    #      | carouselOrSlider | choice | navigationDirection |
    #      | dating app       | Jenn   | right               |
    #    And a user selects the "Buy a Car" Optional Narrative from the Dashboard
    #    And the user chooses the following responses in the Optional Narrative:
    #      | carouselOrSlider | choice    | navigationDirection |
    #      | image carousel   | Hatchback | right               |
    And a user clicks Continue on the Optional Narratives Dashboard
    And a user clicks Continue on the Lesson Checkpoint Page

  @Lesson3
  Scenario: User completes Lesson 3
    Given a user "configured user 1" logs in to ME with password "for configured user 1"
    And a user resets the user progress to Lesson 3
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
    And a user clicks Next
    And a user goes through the storyboards
    And a user chooses the following responses in the Chat with Tess:
      | choiceType | choice                                         |
      #
      # OK let's talk about your career! What kind of career are you looking for?
      | text stack | Something in business                          |
      #
      # What kind of business career?
      | text stack | Investment manager                             |
      #
      # Do you plan to work full-time or part-time?
      | text stack | Full-time                                      |
      #
      # Would you like to try living in a different region?
      | text stack | Yes                                            |
      #
      # Where would you like to move to?
      | text stack | A Southern city (Like Atlanta, or New Orleans) |
      #
      # Would you still like to live in a southern city like Atlanta or New Orleans?
      | text stack | Yes                                            |
      #
      # Where would you like to live?
      | text stack | A two bedroom apartment $1,652/mo              |
      #
      # Would you still like to choose this option?
      | text stack | Yes                                            |
      #
      # Would you like to live with a roommate?
      | text stack | I'll have a roommate                           |
      #
      # Are you someone who cooks or eats out a lot?
      | text stack | I cook at home a lot ($)                       |
      #
      # When you eat out, what type of stuff do you get?
      | text stack | Mostly healthy take-out ($$)                   |
      #
      # What kind of stuff do you like to do when out with friends?
      | text stack | Dinner and movie ($$)                          |
      #
      # What about date night?
      | text stack | Dinner and dancing ($$)                        |
      #
      # How will you watch stuff at home?
      | text stack | Big-screen with surround sound ($$$)           |
      #
      # OK That's it for now! I heard Ria is back from the military, let's go see what she's up to.
      | text stack | OK                                             |
    And a user goes through the storyboards
    And a user answers 2 Post Survey Questions
    #  And a user selects the "Get Married" Optional Narrative from the Dashboard
    #  And the user chooses the following responses in the Optional Narrative Chat with Tess:
    #    | carouselOrSlider | choice                                                          |
    #    # Would you like to get married?
    #    |                  | Yes                                                             |
    #    # What kind of wedding do you imagine?
    #    |                  | Modest, don't want to break the bank                            |
    #    # What % of this wedding will you be paying for?
    #    | slider           | 80%                                                             |
    #    # What's the venue like?
    #    |                  | A charming wedding facility ($$)                                |
    #    # How big is the guest list?
    #    |                  | Extended family and social circles ($$)                         |
    #    # How is the wedding party dressed?
    #    |                  | Formal ($$)                                                     |
    #    # How about meals?
    #    |                  | Reasonably good catering ($$)                                   |
    #    # And the bar tab?
    #    |                  | Free drinks... until 8pm ($$)                                   |
    #    # What kind of music?
    #    |                  | Hired professional DJ ($$)                                      |
    #    # Where is the honeymoon?
    #    |                  | Let's kick this thing off: An unforgettable trip overseas ($$$) |
    #    # Let's head back to the dashboard.
    #    |                  | OK                                                              |
    And a user clicks Continue on the Optional Narratives Dashboard
    And a user clicks Continue on the Lesson Checkpoint Page

  @Lesson4
  Scenario: User completes Lesson 4
    Given a user "configured user 1" logs in to ME with password "for configured user 1"
    And a user resets the user progress to Lesson 4
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
    And a user clicks Next
    And a user goes through the storyboards
    And a user chooses the following responses in the Chat with Tess:
      | choiceType | choice                                                   |
      #
      # First of all, are you still happy with where you're living, or would you like to move?
      | text stack | I don't want to move                                     |
      #
      # Would you like to change your residence, or buy a house?
      | text stack | Yes                                                      |
      #
      # Where would you like to live?
      | text stack | "Forever" Home $2,845/mo                                 |
      #
      # Would you still like to choose this option?
      | text stack | Yes                                                      |
      #
      # Now let's get back to some basics. What's for dinner?
      | text stack | A home cooked meal ($$)                                  |
      #
      # How about your daily coffee habit?
      | text stack | Daily stop to the corner cafe ($$$)                      |
      #
      # How do you stay active?
      | text stack | Membership to physical fitness programs ($$$)            |
      #
      # How important is technology?
      | text stack | I like tech stuff, but don't think about it much ($$)    |
      #
      # Do you have any pets?
      | text stack | One pet is plenty ($$)                                   |
      #
      # How do you commute in the morning?
      | text stack | Public transport ($$)                                    |
      #
      # Where will you buy new furniture?
      | text stack | At the build-it-yourself warehouse store ($)             |
      #
      # What kind of car insurance policy will you have?
      | text stack | Average deductibles and coverages ($$)                   |
      #
      # How will you split the check with friends?
      | text stack | Just split it evenly. It doesn't matter much. ($$)       |
      #
      # How will you reply to your friend's invite to a destination wedding?
      | text stack | I'll go, and make a vacation out of it for myself. ($$$) |
      #
      # How will you spend an average night out with friends?
      | text stack | Low key dinner. I'll probably leave early ($)            |
      #
      # Now that you're settling into your career, would you like to adjust your 401k contribution?
      | text stack | Yes                                                      |
      #
      # How much of your salary would you like to contribute?
      | slider     | 10%                                                      |
      #
      # How about a 529? Are you saving for your kids' future education?
      | text stack | No                                                       |
      #
      # OK lastly, would you like to invest any of your savings?
      | text stack | Yes                                                      |
      #
      # How much of your savings would you like to invest going forward?
      | slider     | 50%                                                      |
      #
      # OK, let's move onto your dashboard.
      | text stack | OK                                                       |
    And a user answers 1 Post Survey Question
    #  And a user selects the "Have a Child" Optional Narrative from the Dashboard
    #  And the user chooses the following responses in the Optional Narrative Chat with Tess:
    #    | carouselOrSlider | choice                                             | navigationDirection |
    #    # Would you like to start a family, or add to the one you've started?
    #    |                  | Yes                                                |                     |
    #    # How many children would you like to have at this age?
    #    |                  |                                                  2 |                     |
    #    # OK! Congrats! ...
    #    |                  | Yay!                                               |                     |
    #    #  |                  | Great!                                         |                     |
    #    # What kind of childcare do you envision for your kids?
    #    | text carousel    | I'll bring them to a daycare facility $12,000/year | left                |
    #    # What type of primary school would you like your children to attend?
    #    |                  | Public school $0/year                              |                     |
    #    # What about college?
    #    | text carousel    | In-state university                                | right               |
    #    # Will you help them pay for college?
    #    |                  | Yes                                                |                     |
    #    # The best way to do that is with a 529 account. Would you like to start or change your 529 contribution now?
    #    |                  | Yes                                                |                     |
    #    # How much of your paycheck would you like to contribute to a 529?
    #    | slider           | 8%                                                 |                     |
    #    # What kind of food will your kids eat?
    #    |                  | Homemade with love ($$)                            |                     |
    #    # What kind of clothes will they wear?
    #    |                  | Who cares as long as it's clean ($$)               |                     |
    #    # Who is babysitting them on datenight?
    #    |                  | Teenage son/daughter of a family friend ($$)       |                     |
    #    # How's that stroller?
    #    |                  | Well-reviewed and on sale ($$)                     |                     |
    #    # What kind of toys?
    #    |                  | Lots of lights and noise ($$)                      |                     |
    #    # OK great, that gives me a pretty good idea of how much kids will cost you!
    #    |                  | OK                                                 |                     |
    #    # Let's return to the dashboard.
    #    |                  | OK                                                 |                     |
    And a user clicks Continue on the Optional Narratives Dashboard
    And a user clicks Continue on the Lesson Checkpoint Page

  @Lesson5
  Scenario: User completes Lesson 5
    Given a user "configured user 1" logs in to ME with password "for configured user 1"
    And a user resets the user progress to Lesson 5
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
    And a user clicks Next
    And a user goes through the storyboards
    And a user chooses the following responses in the Chat with Tess:
      | choiceType | choice                                                       |
      #
      # What neighborhood do you see yourself living in?
      | text stack | Central and nice, but not extravagant ($$)                   |
      #
      # How is your place furnished?
      | text stack | I hired someone to help me decorate. ($$$)                   |
      #
      # How often do you get your car serviced?
      | text stack | Oil changes on time every time ($$)                          |
      #
      # How healthily do you live?
      | text stack | I pay attention to ingredients and calories ($$)             |
      #
      # What best describes your hobbies?
      | text stack | Something competitive ($$)                                   |
      #
      # When you travel, how do you like to fly?
      | text stack | I'll pay for extra legroom ($$)                              |
      #
      # How many subscriptions do you carry?
      | text stack | Only a couple, like streaming music. ($)                     |
      #
      # What's your idea of a great night out with friends?
      | text stack | Dinner at most ($)                                           |
      #
      # Your water heater has broken. What do you do?
      | text stack | Go buy a new one at the local home store ($$)                |
      #
      # You have an important meeting in the heart of the city. How will you get there?
      | text stack | Take public transportation ($)                               |
      #
      # How will you handle lunches at work?
      | text stack | Brown bag, but occasionally get a fancy sandwich nearby ($$) |
      #
      # If you do have a family, how will you travel?
      | text stack | Road trips and day trips ($)                                 |
      #
      # Your favorite artist is playing nearby for the first time in a long time. Where are your seats?
      | text stack | Best seats that are available ($$)                           |
      #
      # Suddenly your back is starting to get sore pretty often. How do you handle it?
      | text stack | Go to the doc just to be safe ($$)                           |
      #
      # Would you like to edit how much you contribute to a 401k?
      | text stack | No                                                           |
      #
      # How about a 529? Are you saving for your kids' education in your 30s?
      | text stack | Yes                                                          |
      #
      # How much of your income are you saving?
      | slider     | 8%                                                           |
      #
      # OK lastly, would you like to adjust how much you're investing?
      | text stack | No                                                           |
      #
      # OK, let's move onto your dashboard.
      | text stack | OK                                                           |
    And a user clicks Continue on the Optional Narratives Dashboard
    And a user clicks Continue on the Lesson Checkpoint Page

  @Lesson6
  Scenario: User completes Lesson 6
    Given a user "configured user 1" logs in to ME with password "for configured user 1"
    And a user resets the user progress to Lesson 6
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
    And a user clicks Next
    And a user goes through the storyboards
    And a user chooses the following responses in the Chat with Tess:
      | choiceType | choice                                              |
      #
      # Would you still like to live in the same place?
      | text stack | Yes I'm happy where I am.                           |
      #
      # How often would you like to travel?
      | text stack | A few times per year. ($$)                          |
      #
      # What does dinner look like on any given Tuesday?
      | text stack | Something on the grill ($$)                         |
      #
      # You're getting a little older, and may be paying closer attention to your health habits. What are they like?
      | text stack | I watch what I eat, and go to the gym. ($$)         |
      #
      # What best describes your idea of home improvement?
      | text stack | Gut renovation of a room ($$$)                      |
      #
      # What would you best describe as a “splurge” purchase in mid-life?
      | text stack | A big screen TV ($$)                                |
      #
      # Do you see yourself continuing your education in any way?
      | text stack | I'll read a book ($)                                |
      #
      # When you go to a concert or sporting event, where are your seats?
      | text stack | Somewhere in the middle ($$)                        |
      #
      # Your friend brought his dog in your car, and he had a little accident in the backseat.
      | text stack | Vinegar and water, scrub until clean ($)            |
      #
      # You're pretty busy, and food prep is swallowing your time. How do you make it more efficient?
      | text stack | Dedicate weekend time to make food for the week ($) |
      #
      # You're alone with no plans for the first time in a while. What do you do?
      | text stack | Go for a daytrip somewhere ($$)                     |
      #
      # It's a very special occasion. Where do you go for a classy night out?
      | text stack | Fine dining restaurant ($$$)                        |
      #
      # You've found out a certain health condition runs in your family. How do you handle?
      | text stack | Get tested as a precaution ($$)                     |
      #
      # Would you like to edit how much you contribute to a 401k?
      | text stack | Yes                                                 |
      #
      # How much would you like to contribute?
      | slider     | 12%                                                 |
      #
      # How about a 529? Are you saving for your kids' education in your 40s?
      | text stack | Yes                                                 |
      #
      # How much of your income are you saving?
      | slider     | 8%                                                  |
      #
      # OK lastly, would you like to adjust how much you're investing?
      | text stack | No                                                  |
      #
      # OK, let's move onto your optional choices!
      | text stack | OK                                                  |
    And a user answers 1 Post Survey Question
    And a user clicks Continue on the Optional Narratives Dashboard
    And a user clicks Continue on the Lesson Checkpoint Page

  @Lesson7
  Scenario: User completes Lesson 7
    Given a user "configured user 1" logs in to ME with password "for configured user 1"
    And a user resets the user progress to Lesson 7
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
    And a user clicks Next
    And a user goes through the storyboards
    And a user chooses the following responses in the Chat with Tess:
      | choiceType | choice                                                         |
      #
      # Would you like to purchase a life insurance policy to protect your loved ones?
      | text stack | How much does that cost?                                       |
      #
      # Would you like to purchase a life insurance policy to protect your loved ones?
      | text stack | Yes                                                            |
      #
      # What kind of health insurance would you choose?
      | text stack | A premium plan that lets me go to any doctor ($$$)             |
      #
      # What about car insurance? You've needed that your whole life. What's more important?
      | text stack | Average cost and deductibles ($$)                              |
      #
      # Would you buy travel insurance for your trips?
      | text stack | I would buy a modest policy for emergencies ($$)               |
      #
      # It's the hottest summer on record, and your lawn has turned to dirt. How do you handle it?
      | text stack | Buy some fertilizer and water it regularly ($$)                |
      #
      # Oops, you backed your car into a pole at the grocery store. How will you fix it?
      | text stack | I won't, it's just dented now. ($)                             |
      #
      # You're getting a little older now, how healthy are you eating?
      | text stack | I'm conscious of what I'm eating and make healthy choices ($$) |
      #
      # Your friend's kids are off to college and they want to plan a trip together.
      | text stack | Find a discount flight somewhere for the weekend ($$)          |
      #
      # How do you imagine an average night out with friends in your 50s?
      | text stack | Try to keep up with people half our age. ($$)                  |
      #
      # You have a pain in your foot that won't go away without surgery. What do you do?
      | text stack | Get surgery as soon as possible ($$$)                          |
      #
      # Would you like to edit how much you contribute to your 401k?
      | text stack | No                                                             |
      #
      # How about a 529? Are you still saving for your kids' education in your 50s?
      | text stack | No                                                             |
      #
      # OK lastly, would you like to adjust how much you're investing?
      | text stack | No                                                             |
      #
      # OK, let's move onto your dashboard.
      | text stack | OK                                                             |
    And a user answers 1 Post Survey Question
    And a user clicks Continue on the Optional Narratives Dashboard
    And a user clicks Continue on the Lesson Checkpoint Page

  @Lesson8
  Scenario: User completes Lesson 8
    Given a user "configured user 1" logs in to ME with password "for configured user 1"
    And a user resets the user progress to Lesson 8
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
    And a user clicks Next
    And a user goes through the storyboards
    And a user chooses the following responses in the Chat with Tess:
      | choiceType | choice                                                             |
      # Would you like to adjust your 401k contribution?
      | text stack | Yes                                                                |
      # How much of your income would you like to contribute?
      | slider     | 16%                                                                |
      # Would you like to buy an investment property?
      | text stack | No that's a terrible idea                                          |
      # Uh oh. There's a water stain on the ceiling. Your roof is leaking.
      | text stack | Replace the roof ($$)                                              |
      # Your car is due for a 100,000 mile service
      | text stack | Get the oil and filters changed, the minimum. ($$)                 |
      # You're in your 60s now, and looking at a fixed income in retirement.
      | text stack | I'll buy groceries on sale, but I'm not fussing with coupons ($$)  |
      # You'll have a lot more free time in retirement. How do you spend it?
      | text stack | Throw myself into a new hobby. Like kayaking. Or sky diving. ($$$) |
      # In your 60s, how much is your health on your mind?
      | text stack | I'm making an effort to be active and healthy ($$)                 |
      # OK, let's move on!
      | text stack | OK                                                                 |
    And a user clicks Continue on the Optional Narratives Dashboard
    And a user clicks Continue on the Lesson Checkpoint Page

  @Lesson9
  Scenario: User completes Lesson 9
    Given a user "configured user 1" logs in to ME with password "for configured user 1"
    And a user resets the user progress to Lesson 9
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
    And a user clicks Next
    And a user goes through the storyboards
    And a user chooses the following responses in the Chat with Tess:
      | choiceType | choice                                                       |
      #
      # Where will you live?
      | text stack | Age in place at home                                         |
      #
      # In old age, it's harder than ever to clean your house
      | text stack | I'll pay a neighborhood kid to help me out ($$)              |
      #
      # Driving isn't so easy anymore. Your sight isn't what it used to be.
      | text stack | Keep my car, but lean on others to drive me most places ($$) |
      #
      # Grocery shopping is harder these days. What's for dinner?
      | text stack | It might take me 4 times as long, but I'm shopping ($)       |
      #
      # When getting around isn't so easy, how often do you travel?
      | text stack | Whatever it takes. Can't keep me stationary. ($$$)           |
      #
      # What's your entertainment like in old age?
      | text stack | Group rate on a cruise ($$$)                                 |
      #
      # What does wellness mean to you in old age?
      | text stack | Frequent checkups with preventative action plans ($$)        |
      #
      # OK, that's it for your lifestyle in your senior years, let's move on.
      | text stack | Ok                                                           |
    And a user answers 1 Post Survey Question
    And a user clicks Continue on the Optional Narratives Dashboard
    And a user clicks Continue on the Simulator Conclusion Page
    ## Do I want to add some assertion step here or something????
