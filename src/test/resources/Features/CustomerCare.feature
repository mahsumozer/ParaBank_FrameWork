@Smoke
Feature:Customer Care

  Background:
    Given User is on Welcome page

@customercare
  Scenario: User should should send message Successfully
    And User clicks on Contact us button
    When User fills the form and clicks on send button
    |Name|Mahir|
    |Email|abc@gmail.com|
    |Phone|123321123    |
    |Message| I was overcharged from last transaction|
    Then User should see "A Customer Care Representative will be contacting you." message on page
