Feature: Sign out feature

  Scenario: user can checkout
    Given user is logged in
    When  user click sign out
    Then user is logged out and the authentification page is displayed