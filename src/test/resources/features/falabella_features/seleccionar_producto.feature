Feature: Select products

  As a registered user,
  I want to select products to add to my cart,
  So that I can proceed to checkout and complete my purchase.

  @SelectProducts

  Scenario: Select product and add to cart

    Given I am  logged in as a registered user,
    And I browse through the product catalog,
    When I select a product and add it to my cart,
    Then the product should be added to my cart successfully,
    And the cart should reflect the correct number of items.
