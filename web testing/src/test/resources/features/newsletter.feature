@newsletter
Feature: admin see detail newsletter page
  Background:
    Given admin on login page
    When admin input valid ussername
    And admin input valid password
    And click login button
    And click sucsess login

  Scenario: admin send newsletter
    Given admin on dashboard page
    When admin click newsletter page
    And admin fill in the desired title and fill in the text that matches the title after that click send
    Then admin sucsess send the newsletter

  Scenario: admin see newsletter page
    Given admin on dashboard page
    When admin click newsletter page
    Then admin succses see detail newsletter page
@email
  Scenario:admin send news letter but do not fill in the title and text
#    Given admin on dashboard page
    When admin click newsletter page
    And And admin do not fill in the desired title and fill in the text that matches the title after that click send
    Then admin don't sucsess send the newsletter