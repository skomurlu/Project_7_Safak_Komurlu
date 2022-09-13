Feature: Product purchase Functionality

   Background:
    Given Navigate to magento
    When  Click to sign in button
    And Enter email and password and click login button
    Then User should login successfully

  Scenario: Add a product to cart and buy

    When Click to product and add to cart
    And Go to cart proceed to Checkout
    Then Select an address
    And Choose shipping method and click next
    And Click place order

    Then Success purchase message should be displayed
