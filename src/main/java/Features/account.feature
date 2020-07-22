Feature: create account

  Scenario: user can create account with a valid email
    Given the user is in the home page and click sign in
    When the authentication page is opened
    Then the user enter a valid email and press create account
    When the form to fill in the data appears
    Then the user enter all his personal informations and click register
    Then the account is successfully created

  Scenario: user use an invalid email to create an account
    Given the user is on the authentication page
    When the user enter an invalid email and press create account
    Then an error message is displayed