#Author: Jim Bonica jim@moneyexperience.com
@Complete_Simulator_Essentials7
Feature: 1004 Complete Simulator Essentials 7
  Description: 
  	As a Money Experience Engineer
  	I want an automation tool to execute user choices for all TME Simulator lessons
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
      | choiceType | choice    |
      # For example, let's pick a job for you to have during the summer after high school.
      # What kind of job would you try to get?
      | text stack | Farm Hand |
      # Anyway that's the basic idea. Now let's meet the others, and think about your life into your early 20s.
      | text stack | OK        |
    And a user goes through the storyboards
    And a user clicks Go when Tess sends a new message
    And a user chooses the following responses in the Chat with Tess:
      | choiceType | choice                            |
      #
      # Do you plan to attend college after high school?
      | text stack | Yes I'm going to college          |
      #
      # What kind of school do you plan to go to?
      | text stack | In-State University $10,125/year  |
      #
      # Now that you know the costs, would you like to stick with this choice or pick a different school?
      | text stack | Stick with this choice            |
      #
      # Will you have any financial help paying for school? This can include money from family, scholarships, Pell Grants, etc.
      | text stack | Yes                               |
      #
      # In approximate dollars, how much help will you have in total?
      | slider     |                            10,000 |
      #
      # The total remaining costs for your education are $30,500. How do you plan to pay for it?
      | text stack | I'll take out student loans       |
      #
      # Do you plan to have a job while in school?
      | text stack | Yes                               |
      #
      # What kind of job are you most likely to get?
      | text stack | Fitness Instructor                |
      #
      # Do you plan to work full-time or part-time?
      | text stack | Part-time                         |
      #
      # What are your eating habits like?
      | text stack | Fresh and organic ($$)            |
      #
      # What's your travel style?
      | text stack | Tent and a backpack ($)           |
      #
      # What's your average weekend like?
      | text stack | Out on the town ($$)              |
      #
      # What is your fitness routine like?
      | text stack | A morning run ($)                 |
      #
      # What is your gadget status?
      | text stack | Last year's model works fine ($$) |
      #
      # What best describes your fashion choices?
      | text stack | Thrift-store treasure hunt ($)    |
      #
      # What kind of place would you like to live in?
      | text stack | On-Campus Dorm                    |
      # Are you sure you want to live in a dorm?
      | text stack | Yes                               |
      #
      # Ready to move on?
      | text stack | Yes                               |
    And a user selects the "Take a trip" Optional Narrative in the "Travel" Inventory on the Dashboard
    And the user chooses the following responses in the Optional Narrative Chat with Tess:
      | choiceType | choice                                  |
      #
      # Would you like to take a trip somewhere?
      | text stack | Probably                                |
      #
      # Where would you like to go?
      | text stack | Outdoor adventure in New Zealand $3,000 |
      #
      # A week in ... Still interested?
      | text stack | Book it!                                |
      #
      # For now, let's go back to the dashboard.
      | text stack | OK                                      |
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
    And a user clicks Go when Tess sends a new message
    And a user chooses the following responses in the Chat with Tess:
      | choiceType | choice                                             |
      #
      # Your adult life is beginning to take shape! What would you like to do?
      | text stack | Start a career or change my job                    |
      #
      # What kind of career are you looking for?
      | text stack | Something in business                              |
      #
      # What kind of business career?
      | text stack | Investment manager                                 |
      #
      # Do you plan to work full-time or part-time?
      | text stack | Full-time                                          |
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
      | text stack | The Northeast                                      |
      #
      # What best describes the neighborhood where you will be living in the northeast?
      | text stack | A small city                                       |
      #
      # Where would you like to live?
      | text stack | Studio Apartment $1,012/mo                         |
      #
      # Would you still like to choose this option
      | text stack | Yes                                                |
      #
      # Would you like to live with a roommate?
      | text stack | No                                                 |
      #
      # OK, that's it for now! Let's move on.
      | text stack | Ok                                                 |
    And a user goes through the storyboards
    And a user selects the "Open Credit Card" Inventory on the Dashboard
    And a user goes through the storyboards
    And the user chooses the following responses in the Optional Narrative Chat with Tess:
      | choiceType | choice              |
      #
      # Some credit cards offer rewards or cash back to incentivize you to use the card. Would you like to choose a different credit card?
      | text stack | Retail Rewards Card |
      #
      # A retail rewards card lets you earn points and provides discounts when you spend online at your favorite retailer.
      | text stack | Sign me up          |
      #
      # ...Remember...you still have to pay off your credit card in full every month to avoid paying interest on the debt! Let's head back to the dashboard.
      | text stack | OK                  |
    And a user selects the "Date someone" Optional Narrative in the "Personal Life" Inventory on the Dashboard
    And the user chooses the following responses in the Optional Narrative:
      | choiceType | choice | navigationDirection |
      | phone app  | Jenn   | right               |
    And a user selects the "Buy a car" Optional Narrative in the "Car" Inventory on the Dashboard
    And the user chooses the following responses in the Optional Narrative:
      | choiceType | choice     | navigationDirection |
      | phone app  | Roma Scoot | right               |
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
      # Would you like to start a new career or change your career?
      | text stack | No, I'm happy with my current career |
      #
      # Now that you've settled into a career, would you like to start or change your contribution to a 401k account?
      | text stack | Yes                                  |
      #
      # How much of each paycheck would you like to contribute?
      | slider     | 10%                                  |
      #
      # How would you like to invest your money in this account?
      | text stack | High risk strategy                   |
      #
      # What about investments? Would you like to invest some of your savings in stocks or bonds?
      | text stack | Yes                                  |
      #
      # How much of your available savings would you like to invest?
      | slider     | 50%                                  |
      #
      # How would you like to invest your money in this account?
      | text stack | High risk strategy                   |
      #
      # Are you someone who cooks or eats out a lot?
      | text stack | I cook at home a lot ($)             |
      #
      # When you eat out, what type of stuff do you get?
      | text stack | Mostly healthy take-out ($$)         |
      #
      # What kind of stuff do you like to do when out with friends?
      | text stack | Dinner and movie ($$)                |
      #
      # What about date night?
      | text stack | Dinner and dancing ($$)              |
      #
      # How will you watch stuff at home?
      | text stack | Big-screen with surround sound ($$$) |
      #
      # OK That's it for now! I heard Ria is back from the military, let's go see what she's up to.
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
    And a user selects the "Change region" Optional Narrative in the "Region" Inventory on the Dashboard
    And the user chooses the following responses in the Optional Narrative Chat with Tess:
      | choiceType | choice                              |
      #
      # Would you like to change the region that you're living in?
      | text stack | Yes                                 |
      #
      # What region would you like to move to?
      | text stack | The South                           |
      #
      # What best describes the neighborhood where you will be living in the south?
      | text stack | A large city                        |
      #
      # Where would you like to live?
      | text stack | A two bedroom apartment $1,463/mo   |
      #
      # Would you like to live with a roommate?
      | text stack | I'll live with my significant other |
      #
      # Let's head back to the dashboard.
      | text stack | OK                                  |
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
      # OK, let's move onto your dashboard.
      | text stack | OK                                                       |
    And a user goes through the "Injury" Wildcard
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
      | text stack | My spouse will be a stay at home parent      |
      #
      # What type of primary school would you like your children to attend?
      | text stack | Public school $0/year                        |
      # What about college?
      | text stack | In-state university                          |
      #
      # Will you help them pay for college?
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
      | text stack | "Forever" Home $659,739 ($2,519/mo) |
      #
      # Let's head back to the dashboard.
      | text stack | OK                                  |
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
      # OK, let's move onto your dashboard.
      | text stack | OK                                                           |
    And a user goes through the "Home Flood" Wildcard
    And a user selects the "Take a trip" Optional Narrative in the "Travel" Inventory on the Dashboard
    And the user chooses the following responses in the Optional Narrative Chat with Tess:
      | choiceType | choice                                  |
      #
      # Would you like to take a trip somewhere?
      | text stack | Probably                                |
      #
      # Where would you like to go?
      | text stack | Visit the great cities of Europe $6,418 |
      #
      # A week in ... Still interested?
      | text stack | Book it!                                |
      #
      # For now, let's go back to the dashboard.
      | text stack | OK                                      |
    And a user selects the "Sell this car" Optional Narrative in the "Car" Inventory on the Dashboard
    And a user clicks Continue when Tess confirms the transaction
    And a user selects the "Buy a car" Optional Narrative in the "Car" Inventory on the Dashboard
    And the user chooses the following responses in the Optional Narrative:
      | choiceType | choice              | navigationDirection |
      | phone app  | F-ST Thunder Canyon | left                |
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
      | choiceType | choice                                              |
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
      # OK, let's move onto your optional choices!
      | text stack | OK                                                  |
    And a user goes through the "Divorce" Wildcard
    And a user selects the "Have a child" Optional Narrative in the "Family and 529" Inventory on the Dashboard
    And the user chooses the following responses in the Optional Narrative Chat with Tess:
      | choiceType | choice                                       |
      #
      # Would you like to start a family, or add to the one you've started?
      | text stack | Yes                                          |
      #
      # How many children would you like to have at this age?
      | text stack |                                            1 |
      #
      # OK! Congrats! ...
      | text stack | Yay!                                         |
      #
      # What kind of childcare do you envision for your kids?
      | text stack | My spouse will be a stay at home parent      |
      #
      # What type of primary school would you like your children to attend?
      | text stack | Private school $9,538/year                   |
      # What about college?
      | text stack | In-state university                          |
      #
      # Will you help them pay for college?
      | text stack | Yes                                          |
      #
      # How much of your paycheck would you like to contribute to a 529?
      | slider     | 9%                                           |
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
    And a user selects the "Continue education" Optional Narrative in the "Education" Inventory on the Dashboard
    And the user chooses the following responses in the Optional Narrative Chat with Tess:
      | choiceType | choice                                   |
      #
      # Would you like to go back to school?
      | text stack | Yes, get an advanced degree              |
      #
      # What type of advanced degree?
      | text stack | Masters of Business Administration (MBA) |
      #
      # What type of school will you attend for your advanced degree?
      | text stack | In-State University $35,500/year         |
      #
      # How much financial support will you get from family, scholarships, or other means?
      | slider     |                                   20,000 |
      #
      # How do you plan to pay for it?
      | text stack | I'll pay for it myself                   |
      #
      # Let's head back to the dashboard.
      | text stack | Ok                                       |
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
      # OK, let's move onto your dashboard.
      | text stack | OK                                                             |
    And a user goes through the "Inheritance" Wildcard
    And a user selects the "Purchase an investment property" Optional Narrative in the "Investment Property" Inventory on the Dashboard
    And the user chooses the following responses in the Optional Narrative Chat with Tess:
      | choiceType | choice                                          |
      #
      # Would you like to buy an investment property?
      | text stack | Yeah that's a good idea                         |
      #
      # What region would you like to buy the property?
      | text stack | The Northeast |
      #
      # What best describes the neighborhood where you will buy the property?
      | text stack | A small city |
      #
      # What type of property would you like to buy?
      | text stack | House on the beach $2,421/mo                    |
      #
      # Would you like to purchase this option?
      | text stack | Yes                                             |
      #
      # Let's head back to the dashboard.
      | text stack | Ok                                              |
    And a user selects the "Change 401k contribution" Optional Narrative in the "401k" Inventory on the Dashboard
    And the user chooses the following responses in the Optional Narrative Chat with Tess:
      | choiceType | choice             |
      #
      # Would you like to start or change your contribution to a 401k account?
      | text stack | Yes                |
      #
      # How much of each paycheck would you like to contribute?
      | slider     | 12%                |
      #
      # How would you like to invest your money in this account?
      | text stack | High risk strategy |
      #
      # Let's return to the dashboard.
      | text stack | Ok                 |
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
      | choiceType | choice                                                             |
      #
      # Would you like to adjust your 401k contribution?
      | text stack | Yes                                                                |
      #
      # How much of your income would you like to contribute?
      | slider     | 16%                                                                |
      #
      # How would you like to invest your money in this account?
      | text stack | High risk strategy                                                 |
      #
      # Would you like to buy an investment property?
      | text stack | No that's a terrible idea                                          |
      #
      # Uh oh. There's a water stain on the ceiling. Your roof is leaking.
      | text stack | Replace the roof ($$)                                              |
      #
      # Your car is due for a 100,000 mile service
      | text stack | Get the oil and filters changed, the minimum. ($$)                 |
      #
      # You're in your 60s now, and looking at a fixed income in retirement.
      | text stack | I'll buy groceries on sale, but I'm not fussing with coupons ($$)  |
      #
      # You'll have a lot more free time in retirement. How do you spend it?
      | text stack | Throw myself into a new hobby. Like kayaking. Or sky diving. ($$$) |
      #
      # In your 60s, how much is your health on your mind?
      | text stack | I'm making an effort to be active and healthy ($$)                 |
      #
      # OK, let's move on!
      | text stack | OK                                                                 |
    And a user goes through the "Market Crash" Wildcard
    And a user selects the "Change careers" Optional Narrative in the "Career" Inventory on the Dashboard
    And the user chooses the following responses in the Optional Narrative Chat with Tess:
      | choiceType | choice                  |
      #
      # What type of work do you want to do?
      | text stack | Something in healthcare |
      #
      # What kind of healthcare career?
      | text stack | Fitness instructor      |
      #
      # Do you plan to work full-time or part-time?
      | text stack | Full-time               |
      # And that's it! You can always change your mind again later.
      | text stack | Ok                      |
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
    And a user completes the V2 Post-Course Assessment
    And a user selects the "Sell this house" Optional Narrative in the "Residence" Inventory on the Dashboard
    And a user clicks Continue when Tess confirms the transaction
    And a user selects the "Change investment contribution" Optional Narrative in the "Invest" Inventory on the Dashboard
    And a user chooses the following responses in the Chat with Tess:
      | choiceType | choice             |
      #
      # Would you like to invest some of your savings in stocks or bonds?
      | text stack | Yes                |
      #
      # How much of your available savings would you like to invest?
      | slider     | 75%                |
      #
      # How would you like to invest your money in this account?
      | text stack | High risk strategy |
      #
      # Let's return to the dashboard.
      | text stack | Ok                 |
    And a user clicks Continue on the Optional Narratives Dashboard
    And a user clicks Continue on the Simulator Conclusion Page
    ## Do I want to add some assertion step here or something????
