Feature: Create Account Functionality

  Scenario Outline: Create new account

    Given Navigate to magento
    When  Click the create account button
    And   Enter the information
      | firstName             | <firstName> |
      | lastName              | <lastName> |
      | email                 | <email> |
      | password              | <password> |
      | passwordConfirmation  | <passwordConfirmation> |

    And   Click the create button
    Then  Success message should be displayed

    Examples:
      | firstName | lastName | email | password | passwordConfirmation |
      | Safak | Komurlu | magento@gmail.com | Magento123456 | Magento123456 |