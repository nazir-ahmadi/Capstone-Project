Feature: Sign In Feature

  Background: 
    Given User is on retail website
    When User click on Sign in option

  @createNewAccount
  Scenario: Verify user can create an account into Retail Website
    When User click on Create New Account button
    When User fill the signUp information with below data
      | name     | email                    | password  | confirmPassword |
      | panthers | fakefakersonfake@tek.com | Tek@12345 | Tek@12345       |
    When User click on SignUp button
    Then User should be logged into account page

  @signin
  Scenario: Verify user can sign in into Retail Application
    And User enter email 'fake@fake.com' and password 'Fake@123'
    And User click on login button
    Then User should be logged in into Account
