@user
Feature: admin see detail user page
  Background:
    Given admin on login page
    When admin input valid ussername
    And admin input valid password
    And click login button
    And click sucsess login

  Scenario: admin choose user
    Given Admin dashboard page
    When admin click user page
    And admin click select user and behind user post
    Then admin sucsees choose user select

  Scenario: admin choose delete user
    Given Admin dashboard page
    When admin click user page
    And Admin click the red image next to the address
    Then admin sucsees delete user

