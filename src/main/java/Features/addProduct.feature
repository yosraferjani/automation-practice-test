Feature: add product feature

  Scenario: user can add a product in the cart
    Given user open the web site
    And user log in to his account
    When user click on the first product category
    And hover the first product
    Then add to card button is displayed
    When user click on add button
    Then a popup is displayed to confirm the add operation
    When user close the popup
    And open his shopping cart
    Then user find the selected product in his cart

