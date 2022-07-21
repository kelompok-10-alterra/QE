
@booking
Feature: admin see detail booking page
  Background:
    Given admin on login page
    When admin input valid ussername
    And admin input valid password
    And click login button
    And click sucsess login

  Scenario: admin click booking page on dashboard page
    Given admin on the dashboard page
    When when admin click booking page
    Then admin sucsess look detail booking page

@new
  Scenario: create new booking
    Given admin on the booking page
    When admin click add new booking
    And admin fill in all that is ordered
    Then admin sucsess create new booking

  Scenario: select booking
    Given admin on the booking page
    When admin click select booking
    And Admin select filter booking
    Then admin sucsess select filter booking
