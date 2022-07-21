@logins
Feature: As a admin, I want to see home page

  Scenario: As a user, i able to login successfully
    Given admin on login page
    When admin input valid ussername
    And admin input valid password
    And click login button
    And click sucsess login
    Then I am on the home pages


