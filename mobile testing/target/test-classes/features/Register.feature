Feature:android user can register account

  Scenario: user succses register
    Given new user on login page
    When user click icon register
    And user input name field
    And user input email field
    And user input password field
    Then user click register button and succses register account

