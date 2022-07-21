
@content
Feature: admin can see detail content page
  Background:
    Given admin on login page
    When admin input valid ussername
    And admin input valid password
    And click login button
    And click sucsess login

  Scenario: admin send new content
    Given admin the dashboard page
    When admin click content page
    And admin fill in the desired title and fill link after that click send
    Then admin sucsess send the content

  Scenario: admin see content
    Given admin the dashboard page
    When admin click content page
    And admin see when you burn fat,where does it go on the list of content
    Then admin sucsess click list of content

  Scenario: admin send new conten but do not fill in the tittle and link
    Given admin the dashboard page
    When admin click content page
    And admin do not fill in the desired title and fill link after that click send
    Then admin  send the content error
