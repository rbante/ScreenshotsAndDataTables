Feature: Verify login accounts
  Verify if given accounts are authorised to login

  Scenario Outline: Verify login accounts
    Given User on signin page
    When User enters "<EmailId>" and "<Password>" and click Signin button
    Then User redirects to account page
    And User logout

    Examples: 
      | EmailId         | Password |
      | Roshani@123.com | test@123 |
      | Dhaval@123.com  | hi@123   |
