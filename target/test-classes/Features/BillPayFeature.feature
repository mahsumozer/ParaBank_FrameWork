@billpay
Feature: Bill Pay Functionality

  Background:
    Given User is already on Welcome page
    And User clicks on Bill pay button

  Scenario: User should be able to pay bill

    When User enter all information
    |ali|20main|denver|colorado|80210|123456|1234|1234|1905|
    And User clicks on Send payment button
    Then User should see see "Bill Payment Complete" message

 @tc2
  Scenario: User should be able choose account for payment
    When User enter all information and choose account
      |ali|20main|denver|colorado|80210|123456|1234|1234|1905|30660|
    And User clicks on Send payment button
    Then User should see see "Bill Payment Complete" message