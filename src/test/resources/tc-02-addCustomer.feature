Feature: Add Customer
  @smoke
  Scenario Outline:click on add customer button
    Given Bank manager is in home page
    When User click on add customer button
    And User will input '<firstName>' and '<lastName>' and '<postCode>'
    And User click add customer button
    And user accept the alart ok button
    Then The customer  successfully added

    Examples:
    |firstName|lastName|postCode|
    |Anindita |Basak   |1212    |

