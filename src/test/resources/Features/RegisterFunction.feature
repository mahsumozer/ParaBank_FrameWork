@Smoke @regis
Feature:Register

  Background:
    Given user is on login page
    And  clicks on register button


  @regis1
  Scenario: Register for a new account

    When user enters all information and click on register button
    |Firstname|mahir|
    |Lastname  |mahir|
    |Address  |20 main |
    |City     |denver|
    |State    |Colorado|
    |Zipcode  |900000  |
    |Phone    |123234242|
    |Ssn      |212121121|
    |Username |parabank12|
    |Password |parapara|
    |Confirm  |parapara|
    Then User should see welcome page

  @regis2
  Scenario: User shoudl see error if user create another account with same username
    When user enters all information and click on register button
      |Firstname|mahir|
      |Lastname  |mahir|
      |Address  |20 main |
      |City     |denver|
      |State    |Colorado|
      |Zipcode  |900000  |
      |Phone    |123234242|
      |Ssn      |212121121|
      |Username |parabank12|
      |Password |newpassword129|
      |Confirm  |newpassword129|
    Then User should see "This username already exists." message

  @regis3
  Scenario: User should see error message if passwords are not match
    When user enters all information and click on register button
      |Firstname|mahir|
      |Lastname  |mahir|
      |Address  |20 main |
      |City     |denver|
      |State    |Colorado|
      |Zipcode  |900000  |
      |Phone    |123234242|
      |Ssn      |212121121|
      |Username |newuser23|
      |Password |newpassword12|
      |Confirm  |newpassword1 |

    Then User should see "Passwords did not match." message on next to password

