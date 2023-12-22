Feature: Open Account
  @smoke
  Scenario: Click on open account button
    Given Bank manager homepage
    When  User click on open account page
    And   User clicks on Please select an item option from a customer dropdown list and clicks on a particular customer from the list
    And   User clicks on Please select an item option from a currency dropdown list and clicks on a particular currency from the list
    And   User clicks on the process button
    And   User accepts the alert ok button
    Then  Ensure that the account exists