#Author: James S. Bonica jamesbonica@gmail.com
@Elsevier_QA_skills_assessment
Feature: Elsevier_QA_skills_assessment

  @summer_dress
  Scenario: A User adds a Summer Dress to the Cart
    Given a User is on the Your Logo Homepage
    When a User clicks the reduced-price "Printed Summer Dress" item
    And the User clicks on the Add to Cart Button
    Then the site must display the message "Product successfully added to your shopping cart"

  @sign_in
  Scenario: A User access the Sign In Section
    Given a User is on the Your Logo Homepage
    When a User clicks on the Sign In link
    Then the site must take the User to the Login Page
