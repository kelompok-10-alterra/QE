@login
Feature:as a User Login succses user

  Scenario: succsess login
    Given as user on loading screen home klik icon lewati and click icon masuk
    When as a user input username account
    And user input paswword
    And android user tap login button
    Then android user see message is displayed