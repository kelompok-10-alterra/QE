@Logout
Feature: admin logout

  Background:
    Given admin on login page
    When admin input valid ussername
    And admin input valid password
    And click login button
    And click sucsess login

  Scenario: adminlogoutwebsite
    Given admin in the dashboardpage
    When admin click logutpage
    And admin logoutpage
    Then admin sucsess loguout page