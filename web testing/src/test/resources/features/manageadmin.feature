@manage
Feature:  admin see detail manageadmin page
  Background:
    Given admin on login page
    When admin input valid ussername
    And admin input valid password
    And click login button
    And click sucsess login

  Scenario: admin add new admin
    Given admin dashboard page
    When admin click manage admin page and click add new manage admin
    And admin click add new admin then fill in as instructed
    Then admin sucsees add new admin

  Scenario: admin choose manage admin
    Given admin dashboard page
    When admin click manage admin page and click
    And admin click select admin and behind manage admin post
    Then admin sucsees choose admin select

  Scenario: admin choose delete admin
    Given admin dashboard page
    When admin click manage admin page and click
    And admin click the red image next to the address
    Then admin sucsees delete admin

