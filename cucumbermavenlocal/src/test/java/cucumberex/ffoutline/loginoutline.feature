#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@Regression
Feature: Validation of login

  @P0
  Scenario: User logs into the the website
    Given The user clicks on the Sign in link
    And The user enters the email <email>
    And The user enters the password <password>
    When The user clicks on the sign in button
    Then Login should be <status>
    


    Examples: 
      | email                     | password          |status    |
      | avinashact1979@gamil.com  |    Sadu2006$      | success  |
      | keera@gmail.com           |     test          | Fail     |
