Feature: User should able to login and finish the purchase
  @wip
  Scenario: Login and End to End Test
    Given The user is on the login page
    When The user enters "standard_user" and "secret_sauce"
    Then The user should be able to login and see "Products" header
    When The user sorts the products by "Price (high to low)"
    And The user adds the cheapest product as "7.99" and the second costliest product as "29.99"
    And The user opens the basket
    And The user clicks on checkout button
    And The user enters details as "le" and "Po" and "Ny1245" and clicks continue button
    Then The user verifies that the total price is"Total: $41.02"
    When The user clicks on finish button
    Then  The user should be able to see confirmation message as "Thank you for your order!"