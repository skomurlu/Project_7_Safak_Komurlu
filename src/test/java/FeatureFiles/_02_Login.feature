Feature: Login Functionality

  Scenario: Login with valid username and password

    Given Navigate to magento
    When  Click to sign in button
    And Enter email and password and click login button
    Then User should login successfully