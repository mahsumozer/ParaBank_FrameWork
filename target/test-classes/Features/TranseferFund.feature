@Smoke @TransferFunds
Feature: Transfer Funds

  Background:
    Given User is on Welcome page
    When User clicks on Transfer Funds button from home page

  Scenario: User should be able to transfer funds successfully

    And User fills all fields
    |120|15009|15453|
    And User clicks Transfer button
    Then User should see transfer message

  Scenario: User should see Error Message if user blanks amount field
    When User does not enter anything to amount field
    And User clicks Transfer button
    Then User should see "The amount cannot be empty." error message on transfer funds page

  Scenario: User should be choose account for transfer funds
    And User chooses account from dropdown


