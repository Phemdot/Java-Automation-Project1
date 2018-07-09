Feature: Login
  This tests the login functionality

  Background:
    Given that I navigate to dev.giftrete.com
    When I click on login

    @valid @smoke
  Scenario: Valid Login
    And I entered the username
    And I entered the password
    And I click on the login button
    Then I should be logged in

  @invalid @regression
  Scenario: Login with invalid username
    And I entered the invalid username
    And I entered the password
    And I click on the login button
    Then I should not be logged in

  @invalid
  Scenario: Login with invalid password
    And I entered the username
    And I entered the invalid password
    And I click on the login button
    Then I should not be logged in

  Scenario: Login
    And I entered the username "username"
    And I entered the password "password"
    And I click on the login button
    Then I should not be logged in

  Scenario: Invalid Login with Parameter
    And I entered the username "username"
    And I entered the password "password"
    And I click on the login button
    Then I should not be logged in


    Scenario Outline: Login with multiple users

      And I entered the username "<username>"
      And I entered the password "<password>"
      And I click on the login button
      Then I should be logged in
      And I log out

      Examples:
      | username | password |
      |dejiuser | dejipass |
      | dejavu | dejipass2 |