Feature: xyz Bank
  @smoke
  Scenario: Click on bank manager login button
    Given Authentication in login page
    When  User click on bank manager login page
    Then  It will take to the next page