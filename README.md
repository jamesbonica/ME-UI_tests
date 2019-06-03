# ME-UI_tests
This is thwe automated test project for Money Experience

Any Developer or QE will be able to use this locally. The only requirements are Java 8 and Maven.

To run the tests locally:

1. Clone the project to any directory you like
  
2. Open a terminal session and navigate to the main directory
  
3. Run the following command:
  
mvn test -Dspring.profiles.active=regressions -Dtest.url=http://localhost:9000 -Dconfigured.user1=jane -Dcucumber.options='--tags "@Complete_Simulator_Experience"'
    
Here's what each of the Java Spring variables mean:

<strong>spring.profiles</strong>: There is a regressions.properties file in the /src/test/resources directory. The project is setup like this to allow future QEs to have their own saved personalized configurations. Just keep this as the default value. Failure to use this variable or to have it reference an existing properties file will throw a nullPointer exception.

<strong>test.url</strong>: the URL of the instance against which you want to run these tests. The example Maven command uses the default local install of the ME Simulator. You can point it anywhere you want to test.

<strong>configured.user1</strong>: This is the user involved in your test, examples include jane, sara, joeyvitamins-counselor. As of 6/3/19, the UI automation is not designed to handle the pre-course survey so please make sure the user in your test instance has the value of 1 for completed_pre_survey in the application_user table in the api db.

<strong>cucumber.options</strong>: These are the tags for the tests you'd like to run. In Cucumber, tags can be used at the Feature File or the Scenario level. The tag inlcuded in the Maven command example above is for the Feature File designed to run a configured user from Lesson 1 through Lesson 9. If you want to only run a subset of scenarios, substitute @Complete_Simulator_Experience for something like "@Lesson1 or @Lesson2 or @Lesson3". This would run any scenarios with the a tag of Lession1, Lession2 or Lession3. In the Feature File, the individual scenarios for each lesson are tagged @Lession1, @Lession2, etc. 
  
# To Come
Instructions on generating a report of your local test using Cucumber Sandwich reporting tool
