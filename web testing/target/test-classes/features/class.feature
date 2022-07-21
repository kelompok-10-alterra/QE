@class
Feature: admin on the class page
  Background:
    Given admin on login page
    When admin input valid ussername
    And admin input valid password
    And click login button
    And click sucsess login

  Scenario: admin see detail class page
    Given admin in dashboard page
    When admin click class page
    Then admin see detail about class

  Scenario: sucsess add new class
    Given  admin click class page
    When admin click add new class
    And Admin fill in all that is ordered
    Then admin succsess create new class

  Scenario: admin select class
    Given admin in dashboard page
    When admin click class page
    And admin click class on the class page
    Then user succses select or see class






