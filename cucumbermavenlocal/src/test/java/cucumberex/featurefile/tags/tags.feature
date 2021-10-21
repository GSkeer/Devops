
@Regression
Feature: Validate Login scenarios


  @P0 @Valid
  Scenario: User login to the the website with valid credentials
    Given The user clicks on the sign in link
    And The user enters the user name
    And The user enters the password
    When The user clicks on the sign in button
    Then User should be able to login sucessfully
    And  User click on the logout button
    
    @P0 @Invalid
  Scenario: User login to the the website with valid credentials
    Given The user clicks on the sign in link
    And The user enters an invalid user name
    And The user enters an invalid password
    When The user clicks on the sign in button
    Then Appropriate error message must be shown
    
    @P1
  Scenario: User login to the the website with valid credentials
    Given The user clicks on the sign in link
    And The user enters an invalid user name
    And The user enters an invalid password
    When The user clicks on the sign in button
    Then Appropriate error message must be shown
    

  
