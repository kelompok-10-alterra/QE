@dashboard
Feature: see detail about dashboard page
  Background:
    Given admin on login page
    When admin input valid ussername
    And admin input valid password
    And click login button
    And click sucsess login

  Scenario: admin see date dashboard page
  Given Admin on the dashboard page
  When admin look on the dashboard page in the right on the dashboard page
    Then admin sucsess look date on the dashboard page

  Scenario: admin change mounth and year
    Given Admin on the dashboard page
    When admin look on the dashboard page in right on the dashboard click which reads mounth
    Then admin sucsess changes mounth and year on the dashboard

  Scenario:admin close total user and total mamber on the analytic dashbord
    Given Admin on the dashboard page
    When admin look on the dashboard page and look analytics on the dashbord and click total user and total member
    Then admin sucsess click total user and total member