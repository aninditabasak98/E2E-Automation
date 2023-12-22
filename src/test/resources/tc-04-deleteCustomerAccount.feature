Feature: Delete Customer
  @smoke
  Scenario Outline: Click on Customer button
    Given Being in bank manager homepage
    When User click on customer button
    And User inputs '<CustomerName>' in search customer field
    And User clicks on delete button
    Then The customer successfully deleted

    Examples:
    |CustomerName  |
    |Anindita      |
