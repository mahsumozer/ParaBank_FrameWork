@Smoke @login
Feature: Login Functionality

  Background:
    Given user is on login page


  @login
  Scenario: User login successfully

    When user enters valid username and password
    Then user should have access to homepage

  @login
  Scenario: User  forget enter username

    When user enter forget to enter username
    Then user should see "Please enter a username and password." error message

  @login
  Scenario: User forget to enter username and password
    When user forget to enter username and password and click login button
    Then user should see "Please enter a username and password." error message

