# ME-UI_tests
This is thwe automated test project for Money Experience

Any Developer or QE will be able to use this locally. The only requirements are Java 8 and Maven.

To run the tests locally:

1. Clone the project to any directory you like
  
2. Open a terminal session and navigate to the main directory
  
3. Run the following command:
  
mvn clean test -Dspring.profiles.active=regressions -Dtest.url=http://localhost:9000 -Dconfigured.user1={username} -Dconfigured.user1.password={password} -Dcucumber.options='--tags "@Complete_Simulator_Experience"'
    
Here's what each of the Java Spring variables mean:

<strong>spring.profiles</strong>: There is a regressions.properties file in the /src/test/resources directory. The project is setup like this to allow future QEs to have their own saved personalized configurations. Just keep this as the default value. Failure to use this variable or to have it reference an existing properties file will throw a nullPointer exception.

<strong>test.url</strong>: the URL of the instance against which you want to run these tests. The example Maven command uses the default local install of the ME Simulator. You can point it anywhere you want to test.

<strong>configured.user1</strong>: This is the user involved in your test, examples include jane, sara, joeyvitamins-counselor. As of 6/3/19, the UI automation is not designed to handle the pre-course survey so please make sure the user in your test instance has the value of 1 for completed_pre_survey in the application_user table in the api db.

<strong>configured.user1.password</strong>: This is the user's password. Newly added as a configurable as of 6/6/19 because of the new method of user provisioning in the Admin Portal.

<strong>cucumber.options</strong>: These are the tags for the tests you'd like to run. In Cucumber, tags can be used at the Feature File or the Scenario level. The tag included in the Maven command example above is for the Feature File designed to run a configured user from Lesson 1 through Lesson 9. If you want to only run a subset of scenarios, substitute @Complete_Simulator_Experience for something like "@Lesson1 or @Lesson2 or @Lesson3". This will run any scenarios with a tag of @Lession1, @Lession2 or @Lession3. This is how the scenario corresponding to each lesson is tagged.
  
# Checking the results
Cucumber generates an HTML report out of the box. It is not at cool or attractive as the Cucumber Sandwich Report Generator we use on our Jenkins server or your can use locally but it is simple and can provide info on where a test failed, which is all a Developer would need if the purpose of running the tests are to get their instance into a certain state. You can open an HTML report for the Complete Simulator Experience from this URL: file:///{path to test project}/ME-UI_tests/target/html/1001_Complete_Simulator_Experience/index.html

If you see red on Lesson 7 and beyond and you need to run a user through the complete course, you can re-run the test with the following in the Maven command: -Dcucumber.options='--tags "@Lesson7 or @Lesson8 or @Lesson9"'
