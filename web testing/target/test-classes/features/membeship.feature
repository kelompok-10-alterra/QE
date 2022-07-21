@Member
Feature: admin can see detail membership page

  Background:
    Given admin on login page
    When admin input valid ussername
    And admin input valid password
    And click login button
    And click sucsess login


  Scenario: admin can see detail membership page
    Given Admin In dashboard page
    When admin click membership page
    And admin can see detail of membership page
    Then admin sucsess see membership page


  Scenario: admin add new membership
    And admin click add new membership
    And admin chosee user and chosee membership
    And admin click save
    Then admin sucsess add new membership




  Scenario: admin look status active
    Given Admin In dashboard page
    When admin click membership page
    And admin can see detail of membership page
    And admin see simbol active on membership page
    Then admin sucsess see symbol active

