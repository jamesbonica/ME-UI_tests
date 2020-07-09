#Author: Jim Bonica jim@moneyexperience.com
@Complete_Simulator_Professional3
Feature: 1005 Complete Simulator Professional 3
  Description: 
  	As a Money Experience Engineer
  	I want an automation tool to execute user choices for all TME Simulator lessons in Professional 3
  	So I am not required to manually simulate a user experience

  @Lesson1
  Scenario: User completes Lesson 1
    Given a user "configured user 1" logs in to ME with password "for configured user 1"
    And a user accepts the Terms of Use if the user has not logged in before
    And a user resets the user progress to Lesson 1
    And a user clicks the Begin Button at the start of the lesson
    And a user completes the V2 Baseline Assessment if the user has not completed it before
    And a user goes through the storyboards
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
    And a user chooses the following responses in the Chat with Tess:
      | choiceType | choice                                   |
      #
      # Would you like to simulate a college education?
      | text stack | Yes                                      |
      #
      # From what type of school would you like this degree to be from?
      | text stack | Two-Year Community College               |
      #
      # Would you like to simulate any student loan debt?
      | slider     |                                   20,000 |
      #
      # What type of job would you like to simulate?
      | text stack | Something in healthcare                  |
      #
      # What kind of healthcare career?
      | text stack | Nurse                                    |
      #
      # Would you like to use this salary or simulate your own custom salary for this job?
      | text stack | Simulate a custom salary                 |
      #
      # Approximately, what is the annual salary you would like to simulate?
      | slider     |                                   55,000 |
      #
      # Would you like to simulate any savings?
      | slider     |                                   10,000 |
      #
      # What best describes the place you'd like to live?
      | text stack | A Midwestern city (Like Chicago, Denver) |
      #
      # What are your eating habits like?
      | text stack | Easy in the microwave ($)                |
      #
      # What's your travel style?
      | text stack | Tent and a backpack ($)                  |
      #
      # What's your average weekend like?
      | text stack | Weekend away ($$$)                       |
      #
      # What is your fitness routine like?
      | text stack | A morning run ($)                        |
      #
      # What is your gadget status?
      | text stack | Old phone with a cracked screen ($)      |
      #
      # What best describes your fashion choices
      | text stack | Thrift-store treasure hunt ($)           |
      #
      # Are you ready to move on?
      | text stack | Yes                                      |
    And a user selects the "Residence" Optional Narrative on the Initial Assumptions Dashobard
    And the user chooses the following responses in the Optional Narrative Chat with Tess:
      | choiceType | choice |
      #
      # Would you like to simulate owning a house at age 22, or would you rather simulate a rent payment?
      | text stack | Rent   |
      #
      # How much rent would you like to pay per month?
      | slider     |  1,100 |
      #
      # Let's head back to the dashboard.
      | text stack | OK     |
    And a user selects the "Car" Optional Narrative on the Initial Assumptions Dashobard
    And the user chooses the following responses in the Optional Narrative Chat with Tess:
      | choiceType | choice            |
      #
      # Would you like to simulate owning a car?
      | text stack | Yes               |
      #
      # What type of car?
      | text stack | Hatchback         |
      #
      # Would you like to simulate a car loan, or should we assume a car that is already paid off?
      | text stack | Simulate car loan |
      #
      # What is the total amount of you loan you would like to simulate?
      | slider     |            10,000 |
      #
      # Let's go back to the dashboard.
      | text stack | OK                |
    And a user selects the "Invest" Optional Narrative on the Initial Assumptions Dashobard
    And the user chooses the following responses in the Optional Narrative Chat with Tess:
      | choiceType | choice |
      #
      # Would you like to simulate any investments in stocks, bonds, or mutual funds?
      | text stack | Yes    |
      #
      # What investment amount would you like to simulate?
      | slider     | 10,000 |
      #
      # OK that's all I need to know about investments. Let's go back to the dashboard.
      | text stack | OK     |
    And a user selects the "Credit Card" Optional Narrative on the Initial Assumptions Dashobard
    And the user chooses the following responses in the Optional Narrative Chat with Tess:
      | choiceType | choice |
      #
      # Would you like to simulate any credit card debt?
      | text stack | Yes    |
      #
      # How much credit card debt would you like to simulate?
      | slider     |  5,000 |
      #
      # OK that's all I need to know about credit cards. Let's go back to the dashboard.
      | text stack | OK     |
    And a user selects the "401k" Optional Narrative on the Initial Assumptions Dashobard
    And the user chooses the following responses in the Optional Narrative Chat with Tess:
      | choiceType | choice                  |
      #
      # Would you like to simulate a 401k account?
      | text stack | What is a 401k account? |
      #
      # A 401k account is a savings plan for retirement...
      | text stack | OK                      |
      #
      # Would you like to simulate a 401k account?
      | text stack | Yes                     |
      #
      # Would you like to simulate a 401k balance already in your account?
      | slider     |                  10,000 |
      #
      # How much of each future paycheck would you like to contribute?
      | slider     | 5%                      |
      #
      # OK that's all I need to know about 401k. Let's go back to the dashboard.
      | text stack | OK                      |
    And a user clicks Continue on the Optional Narratives Dashboard
    And a user clicks Continue on the Lesson Checkpoint Page

  @Lesson2
  Scenario: User completes Lesson 2
    Given a user "configured user 1" logs in to ME with password "for configured user 1"
    And a user resets the user progress to Lesson 2
    And a user clicks the Begin Button at the start of the lesson
    And a user clicks Next
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
    And a user goes through the storyboards
    And a user chooses the following responses in the Chat with Tess:
      | choiceType | choice                                                        |
      #
      # Let's say your laptop breaks and you need a new one. What will you buy?
      | text stack | A new basic machine ($$)                                      |
      #
      # In what might be your first place living on your own, what kind of neighborhood do you see yourself living in?
      | text stack | A place that's rough around the edges ($)                     |
      #
      # How much are you spending on coffee?
      | text stack | I don't like coffee ($)                                       |
      #
      # What are you MOST LIKELY up to on the weekends?
      | text stack | Outdoor stuff. Hiking, biking, etc. ($)                       |
      #
      # Do you want any pets?
      | text stack | Yes one pet ($$)                                              |
      #
      # What best describes your hobbies?
      | text stack | My hobbies don't really require any supplies or equipment ($) |
      #
      # Buying furniture can be expensive. Where will you buy yours?
      | text stack | At a department store ($$)                                    |
      #
      # How about kitchen stuff? What do you need?
      | text stack | I don't cook. ($)                                             |
      #
      # OK last question about buying stuff. What will you spend on a bed?
      | text stack | I'll look for deals online ($$)                               |
      #
      # Would you like to try living in a different region?
      | text stack | No                                                            |
      #
      # Would you like to change your living situation by renting or buying a new place?
      | text stack | No, stay where I am                                           |
      #
      # OK, that's it for now! Let's move on.
      | text stack | OK                                                            |
    And a user goes through the storyboards
    And a user selects the "Open Credit Card" Inventory on the Dashboard
    And the user chooses the following responses in the Optional Narrative:
      | choiceType     | choice                                                           | navigationDirection |
      | image carousel | 50,000 point sign up bonus + Earn 3x points on dining and travel | right               |
    And a user selects the "Take a trip" Optional Narrative in the "Travel" Inventory on the Dashboard
    And the user chooses the following responses in the Optional Narrative Chat with Tess:
      | choiceType | choice                                                    |
      #
      # Would you like to take a trip somewhere?
      | text stack | Probably                                                  |
      #
      # Where would you like to go?
      | text stack | Marvel at ancient sites in Isreal, Egypt, Istanbul $3,090 |
      #
      # A week in ... Still interested?
      | text stack | Book it!                                                  |
      #
      # For now, let's go back to the dashboard.
      | text stack | OK                                                        |
    And a user selects the "Date someone" Optional Narrative in the "Personal Life" Inventory on the Dashboard
    And the user chooses the following responses in the Optional Narrative:
      | choiceType | choice | navigationDirection |
      | phone app  | Chris  | left                |
    And a user clicks Continue on the Optional Narratives Dashboard
    And a user clicks Continue on the Lesson Checkpoint Page

  @Lesson3
  Scenario: User completes Lesson 3
    Given a user "configured user 1" logs in to ME with password "for configured user 1"
    And a user resets the user progress to Lesson 3
    And a user clicks the Begin Button at the start of the lesson
    And a user clicks Next
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
    And a user goes through the storyboards
    And a user chooses the following responses in the Chat with Tess:
      | choiceType | choice                               |
      #
      # Let's talk about your career! Would you like to change careers?
      | text stack | No, I'm happy with my current career |
      #
      # Now that you've settled into a career, would you like to start or change your contribution to a 401k account?
      | text stack | Yes                                  |
      #
      # How much of each paycheck would you like to contribute?
      | slider     | 7%                                   |
      #
      # How would you like to invest your money in this account?
      | text stack | Medium risk strategy                 |
      #
      # What about investments? Would you like to invest some of your savings in stocks or bonds?
      | text stack | No                                   |
      #
      # Are you someone who cooks or eats out a lot?
      | text stack | I eat out mostly ($$$)               |
      #
      # When you eat out, what type of stuff do you get?
      | text stack | Mostly healthy take-out ($$)         |
      #
      # What kind of stuff do you like to do when out with friends?
      | text stack | Concert and drinks ($$$)             |
      #
      # What about date night?
      | text stack | A romantic weekend away ($$$)        |
      #
      # How will you watch stuff at home?
      | text stack | On my phone ($)                      |
      #
      # OK, that's it for now!
      | text stack | OK                                   |
    And a user goes through the storyboards
    And a user selects the "Get married" Optional Narrative in the "Personal Life" Inventory on the Dashboard
    And the user chooses the following responses in the Optional Narrative Chat with Tess:
      | choiceType | choice                                                          |
      #
      # Would you like to get married?
      | text stack | Yes                                                             |
      #
      # What kind of wedding do you imagine?
      | text stack | Modest, don't want to break the bank                            |
      #
      # What % of this wedding will you be paying for?
      | slider     | 80%                                                             |
      #
      # What's the venue like?
      | text stack | A charming wedding facility ($$)                                |
      #
      # How big is the guest list?
      | text stack | Extended family and social circles ($$)                         |
      #
      # How is the wedding party dressed?
      | text stack | Formal ($$)                                                     |
      #
      # How about meals?
      | text stack | Reasonably good catering ($$)                                   |
      #
      # And the bar tab?
      | text stack | Free drinks... until 8pm ($$)                                   |
      #
      # What kind of music?
      | text stack | Hired professional DJ ($$)                                      |
      #
      # Where is the honeymoon?
      | text stack | Let's kick this thing off: An unforgettable trip overseas ($$$) |
      #
      # Let's head back to the dashboard.
      | text stack | OK                                                              |
    And a user clicks Continue on the Optional Narratives Dashboard
    And a user clicks Continue on the Lesson Checkpoint Page

  @Lesson4
  Scenario: User completes Lesson 4
    Given a user "configured user 1" logs in to ME with password "for configured user 1"
    And a user resets the user progress to Lesson 4
    And a user clicks the Begin Button at the start of the lesson
    And a user clicks Next
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
    And a user goes through the storyboards
    And a user chooses the following responses in the Chat with Tess:
      | choiceType | choice                                                   |
      #
      # Let's get back to some basics. What's for dinner?
      | text stack | I eat on the run ($)                                     |
      #
      # How about your daily coffee habit?
      | text stack | I don't like coffee ($)                                  |
      #
      # How do you stay active?
      | text stack | Regular walks or runs ($)                                |
      #
      # How important is technology?
      | text stack | Not very important ($)                                   |
      #
      # Do you have any pets?
      | text stack | One pet is plenty ($$)                                   |
      #
      # How do you commute in the morning?
      | text stack | Public transport ($$)                                    |
      #
      # Where will you buy new furniture?
      | text stack | That discount place with the annoying radio ads ($$)     |
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
      | text stack | Drinks and local live music ($$)                         |
      #
      # OK, let's move on.
      | text stack | OK                                                       |
    And a user goes through the storyboards
    And a user selects the "Change residence" Optional Narrative in the "Residence" Inventory on the Dashboard
    And the user chooses the following responses in the Optional Narrative Chat with Tess:
      | choiceType | choice                              |
      #
      # Would you like to change the region that you're living in?
      | text stack | No                                  |
      #
      # Would you like to change your residence?
      | text stack | Yes                                 |
      #
      # Where would you like to live?
      | text stack | "Forever" Home $716,182 ($2,735/mo) |
      #
      # Let's head back to the dashboard.
      | text stack | OK                                  |
    And a user selects the "Have a child" Optional Narrative in the "Family and 529" Inventory on the Dashboard
    And the user chooses the following responses in the Optional Narrative Chat with Tess:
      | choiceType | choice                                       |
      #
      # Would you like to start a family, or add to the one you've started?
      | text stack | Yes                                          |
      #
      # How many children would you like to have at this age?
      | text stack |                                            2 |
      #
      # OK! Congrats! ...
      | text stack | Yay!                                         |
      #
      # What kind of childcare do you envision for your kids?
      | text stack | I'll work part time and stay at home         |
      #
      # What type of primary school would you like your children to attend?
      | text stack | Public school $0/year                        |
      # What about college?
      | text stack | In-state university                          |
      #
      # Will you help them pay for college?
      | text stack | Yes                                          |
      #
      # The best way to do that is with a 529 account. Would you like to start or change your 529 contribution now?
      | text stack | Yes                                          |
      #
      # How much of your paycheck would you like to contribute to a 529?
      | slider     | 7%                                           |
      #
      # How would you like to invest your money in this account?
      | text stack | Medium risk strategy                         |
      #
      # What kind of food will your kids eat?
      | text stack | Homemade with love ($$)                      |
      #
      # What kind of clothes will they wear?
      | text stack | Who cares as long as it's clean ($$)         |
      #
      # Who is babysitting them on datenight?
      | text stack | Teenage son/daughter of a family friend ($$) |
      #
      # How's that stroller?
      | text stack | Well-reviewed and on sale ($$)               |
      #
      # What kind of toys?
      | text stack | Lots of lights and noise ($$)                |
      #
      # OK great, that gives me a pretty good idea of how much kids will cost you!
      | text stack | OK                                           |
      #
      # Let's return to the dashboard.
      | text stack | OK                                           |
    And a user clicks Continue on the Optional Narratives Dashboard
    And a user clicks Continue on the Lesson Checkpoint Page

  @Lesson5
  Scenario: User completes Lesson 5
    Given a user "configured user 1" logs in to ME with password "for configured user 1"
    And a user resets the user progress to Lesson 5
    And a user clicks the Begin Button at the start of the lesson
    And a user clicks Next
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
    And a user goes through the storyboards
    And a user chooses the following responses in the Chat with Tess:
      | choiceType | choice                                                 |
      #
      # Would you like to purchase a life insurance policy to protect your loved ones?
      | text stack | Yes                                                    |
      #
      # What kind of health insurance would you choose?
      | text stack | An average cost plan requiring in-network doctors ($$) |
      #
      # What about car insurance? You've needed that your whole life. What's more important?
      | text stack | Average cost and deductibles ($$)                      |
      #
      # Would you buy travel insurance for your trips?
      | text stack | I would buy a modest policy for emergencies ($$)       |
      #
      # What neighborhood do you see yourself living in?
      | text stack | Central and nice, but not extravagant ($$)             |
      #
      # How often do you get your car serviced?
      | text stack | Oil changes on time every time ($$)                    |
      #
      # How healthily do you live?
      | text stack | I pay attention to ingredients and calories ($$)       |
      #
      # How many subscriptions do you carry?
      | text stack | Only a couple, like streaming music. ($)               |
      #
      # Your water heater has broken. What do you do?
      | text stack | Go buy a new one at the local home store ($$)          |
      #
      # You have an important meeting in the heart of the city. How will you get there?
      | text stack | Take public transportation ($)                         |
      #
      # Your favorite artist is playing nearby for the first time in a long time. Where are your seats?
      | text stack | Best seats that are available ($$)                     |
      #
      # Suddenly your back is starting to get sore pretty often. How do you handle it?
      | text stack | Go to the doc just to be safe ($$)                     |
      #
      # OK, let's move on.
      | text stack | OK                                                     |
    And a user goes through the storyboards
    And a user selects the "Sell this car" Optional Narrative in the "Car" Inventory on the Dashboard
    And a user clicks Continue when Tess confirms the transaction
    And a user selects the "Buy a car" Optional Narrative in the "Car" Inventory on the Dashboard
    And the user chooses the following responses in the Optional Narrative:
      | choiceType | choice        | navigationDirection |
      | phone app  | Yogoto Sietti | left                |
    And a user selects the "Continue education" Optional Narrative in the "Education" Inventory on the Dashboard
    And the user chooses the following responses in the Optional Narrative Chat with Tess:
      | choiceType | choice                       |
      #
      # Would you like to go back to school?
      | text stack | Yes, get an undergrad degree |
      #
      # Do you know if you'll need to take out student loans?
      | text stack | Yes                          |
      #
      # Do you know how much your student loans are going to be?
      | text stack | Yes                          |
      #
      # How much will your student loans be in total?
      | slider     |                       50,000 |
      #
      # What kind of school do you plan to go to?
      | text stack | In-State University          |
      #
      # Let's head back to the dashboard.
      | text stack | Ok                           |
    And a user clicks Continue on the Optional Narratives Dashboard
    And a user clicks Continue on the Lesson Checkpoint Page

  @Lesson6
  Scenario: User completes Lesson 6
    Given a user "configured user 1" logs in to ME with password "for configured user 1"
    And a user resets the user progress to Lesson 6
    And a user clicks the Begin Button at the start of the lesson
    And a user clicks Next
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
    And a user goes through the storyboards
    And a user chooses the following responses in the Chat with Tess:
      | choiceType | choice                                                      |
      #
      # How often would you like to travel?
      | text stack | A few times per year. ($$)                                  |
      #
      # What does dinner look like on any given Tuesday?
      | text stack | Something out of a box ($)                                  |
      #
      # You're getting a little older, and may be paying closer attention to your health habits. What are they like?
      | text stack | I watch what I eat, and go to the gym. ($$)                 |
      #
      # What best describes your idea of home improvement?
      | text stack | Repaint and replace some items ($$)                         |
      #
      # What would you best describe as a "splurge" purchase in mid-life?
      | text stack | A nice dinner ($)                                           |
      #
      # How will you learn about new things at this age?
      | text stack | I'll read a book ($)                                        |
      #
      # When you go to a concert or sporting event, where are your seats?
      | text stack | Somewhere in the middle ($$)                                |
      #
      # Your friend brought his dog in your car, and he had a little accident in the backseat.
      | text stack | Vinegar and water, scrub until clean ($)                    |
      #
      # You're pretty busy, and food prep is swallowing your time. How do you make it more efficient?
      | text stack | Dedicate weekend time to make food for the week ($)         |
      #
      # You're alone with no plans for the first time in a while. What do you do?
      | text stack | Go for a daytrip somewhere ($$)                             |
      #
      # It's a very special occasion. Where do you go for a classy night out?
      | text stack | That hot new place you need to book 3 weeks in advance ($$) |
      #
      # You've found out a certain health condition runs in your family. How do you handle?
      | text stack | Visit specialists to plan a preventative lifestyle ($$$)    |
      #
      # OK, let's move onto your optional choices!
      | text stack | OK                                                          |
    And a user selects the "Continue education" Optional Narrative in the "Education" Inventory on the Dashboard
    And the user chooses the following responses in the Optional Narrative Chat with Tess:
      | choiceType | choice                             |
      #
      # Would you like to go back to school?
      | text stack | Yes, get an advanced degree        |
      #
      # What type of advanced degree?
      | text stack | A Different Type of Masters Degree |
      #
      # What type of school will you attend for your advanced degree?
      | text stack | Online School                      |
      #
      # How much financial support will you get from family, scholarships, or other means?
      | slider     |                             20,000 |
      #
      # Let's head back to the dashboard.
      | text stack | Ok                                 |
    And a user clicks Continue on the Optional Narratives Dashboard
    And a user clicks Continue on the Lesson Checkpoint Page

  @Lesson7
  Scenario: User completes Lesson 7
    Given a user "configured user 1" logs in to ME with password "for configured user 1"
    And a user resets the user progress to Lesson 7
    And a user clicks the Begin Button at the start of the lesson
    And a user clicks Next
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
    And a user goes through the storyboards
    And a user chooses the following responses in the Chat with Tess:
      | choiceType | choice                                                         |
      #
      # It's the hottest summer on record, and your lawn has turned to dirt. How do you handle it?
      | text stack | Buy some fertilizer and water it regularly ($$)                |
      #
      # Oops, you backed your car into a pole at the grocery store. How will you fix it?
      | text stack | That's what car insurance is for, get it fixed ($$)            |
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
      # OK, let's move onto your dashboard.
      | text stack | OK                                                             |
    And a user selects the "Change careers" Optional Narrative in the "Career" Inventory on the Dashboard
    And the user chooses the following responses in the Optional Narrative Chat with Tess:
      | choiceType | choice                |
      #
      # What type of work do you want to do?
      | text stack | Something in academia |
      #
      # What kind of academia career?
      | text stack | College professor     |
      #
      # Do you plan to work full-time or part-time?
      | text stack | Full-time             |
      # And that's it! You can always change your mind again later.
      | text stack | Ok                    |
    And a user clicks Continue on the Optional Narratives Dashboard
    And a user clicks Continue on the Lesson Checkpoint Page

  @Lesson8
  Scenario: User completes Lesson 8
    Given a user "configured user 1" logs in to ME with password "for configured user 1"
    And a user resets the user progress to Lesson 8
    And a user clicks the Begin Button at the start of the lesson
    And a user clicks Next
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
    And a user goes through the storyboards
    And a user chooses the following responses in the Chat with Tess:
      | choiceType | choice                                                            |
      #
      # Would you like to adjust your 401k contribution?
      | text stack | Yes                                                               |
      #
      # How much of your income would you like to contribute?
      | slider     | 12%                                                               |
      #
      # How would you like to invest your money in this account?
      | text stack | Low risk strategy                                                 |
      #
      # Would you like to buy an investment property?
      | text stack | Maybe, let me browse.                                             |
      #
      # What region would you like to buy the property?
      | text stack | A Southern city (Like Atlanta, or New Orleans)                    |
      #
      # What type of property would you like to buy?
      | text stack | House on the beach $2,723/mo                                      |
      #
      # Would you like to purchase this option?
      | text stack | Yes                                                               |
      #
      # Uh oh. There's a water stain on the ceiling. Your roof is leaking.
      | text stack | Replace the roof ($$)                                             |
      #
      # Your car is due for a 100,000 mile service
      | text stack | Get the oil and filters changed, the minimum. ($$)                |
      #
      # You're looking at a fixed income in retirement. How will you pay for groceries?
      | text stack | I'll buy groceries on sale, but I'm not fussing with coupons ($$) |
      #
      # You'll have a lot more free time in retirement. How do you spend it?
      | text stack | Work around the house with small home improvement projects ($$)   |
      #
      # In your 60s, how much is your health on your mind?
      | text stack | I'm making an effort to be active and healthy ($$)                |
      #
      # OK, let's move on!
      | text stack | OK                                                                |
    And a user clicks Continue on the Optional Narratives Dashboard
    And a user clicks Continue on the Lesson Checkpoint Page

  @Lesson9
  Scenario: User completes Lesson 9
    Given a user "configured user 1" logs in to ME with password "for configured user 1"
    And a user resets the user progress to Lesson 9
    And a user clicks the Begin Button at the start of the lesson
    And a user clicks Next
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
    And a user goes through the storyboards
    And a user chooses the following responses in the Chat with Tess:
      | choiceType | choice                                                       |
      #
      # Where will you live?
      | text stack | Age in place at home $4,166/mo                               |
      #
      # In old age, it's harder than ever to clean your house
      | text stack | I'll pay a neighborhood kid to help me out ($$)              |
      #
      # Driving isn't so easy anymore. Your sight isn't what it used to be.
      | text stack | Keep my car, but lean on others to drive me most places ($$) |
      #
      # Grocery shopping is harder these days. What's for dinner?
      | text stack | I'll hire a grocery delivery service and cook myself ($$)    |
      #
      # When getting around isn't so easy, how often do you travel?
      | text stack | Whatever it takes. Can't keep me stationary. ($$$)           |
      #
      # What's your entertainment like in old age?
      | text stack | Group rate on a cruise ($$$)                                 |
      #
      # What does wellness mean to you in old age?
      | text stack | Physical trainers that help me stay fit and mobile ($$$)     |
      #
      # OK, that's it for your lifestyle in your senior years, let's move on.
      | text stack | OK                                                           |
    And a user completes the V2 Post-Course Assessment
    And a user selects the "Sell this house" Optional Narrative in the "Residence" Inventory on the Dashboard
    And a user clicks Continue when Tess confirms the transaction
    And a user selects the "Change investment contribution" Optional Narrative in the "Invest" Inventory on the Dashboard
    And a user chooses the following responses in the Chat with Tess:
      | choiceType | choice            |
      #
      # Would you like to invest some of your savings in stocks or bonds?
      | text stack | Yes               |
      #
      # How much of your available savings would you like to invest?
      | slider     | 60%               |
      #
      # How would you like to invest your money in this account?
      | text stack | Low risk strategy |
      #
      # Let's return to the dashboard.
      | text stack | Ok                |
    And a user selects the "Take a trip" Optional Narrative in the "Travel" Inventory on the Dashboard
    And the user chooses the following responses in the Optional Narrative Chat with Tess:
      | choiceType | choice                                   |
      #
      # Would you like to take a trip somewhere?
      | text stack | Probably                                 |
      #
      # Where would you like to go?
      | text stack | Visit the great cities of Europe $15,580 |
      #
      # A week in ... Still interested?
      | text stack | Book it!                                 |
      #
      # For now, let's go back to the dashboard.
      | text stack | OK                                       |
    And a user clicks Continue on the Optional Narratives Dashboard
    And a user clicks Continue on the Simulator Conclusion Page
