@Smoke @update
Feature: Update Contact Info
  @update
  Scenario: User updates contact information successful
    Given User is already on Welcome page
    And User clicks on Update Contact info button
    When User fills all fields and clicks on Update profile button
      |Firstname|mahir|
      |Lastname  |mahir|
      |Address  |20 main |
      |City     |denver|
      |State    |Colorado|
      |Zipcode  |900000  |
      |Phone    |123234242|
    Then User sould see "Profile Updated" message
