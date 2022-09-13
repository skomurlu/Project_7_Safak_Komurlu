Feature: Add Address Functionality

  Background:
    Given Navigate to magento
    When  Click to sign in button
    And Enter email and password and click login button
    Then User should login successfully

 Scenario Outline: Manage Address

    And Click to on the elements for the manage address
      | switchButton |
      | account |
      | manageAddress |
      | addNewAddress |

    And User should send the new address information in Dialog Content
      | street    | <street>    |
      | city      | <city>      |
      | telephone | <telephone> |
      | postcode  | <postcode>  |

    And User should be select state and country

    And Click to save address

    And Success message should be displayed

   Examples:
     | street  | city  | telephone    | postcode |
     | street1 | city1 | 555 555 5555 | 77000    |
     | street2 | city2 | 444 444 4444 | 66000    |
     | street3 | city3 | 333 333 3333 | 55000    |




