
Feature: login feature

  Scenario: login with valid credentials
    Given user is on the authentication page
    When user enter a valid email
    And user enter a valid password
    And user press sign in
    Then user should be on the users account page

  Scenario: User is not registered
    Given user is on the authentication page
    When user enter a valid email but not registered
    And user press sign in
    Then an error message is displayed

  Scenario: User enters invalid password
    Given user is registered
    And user is on the authentication page
    When user enter a valid email
    And user enter an invalid password
    And user press sign in
    Then an error message is displayed
    And user should not be signed in

  Scenario: User enters invalid email
    Given user is registered
    And user is on the authentication page
    When user enter an invalid email
    And user enter a valid password
    And user press sign in
    Then an error message is displayed
    And user should not be signed in

  Scenario: User enters empty password
    Given user is registered
    And user is on the authentication page
    When user enter a valid email
    And user press sign in
    Then an error message is displayed
    And user should not be signed in

  Scenario: User enters empty email
    Given user is registered
    And user is on the authentication page
    When user enter a valid password
    And user press sign in
    Then an error message is displayed
    And user should not be signed in

