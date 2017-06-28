Feature: SignUp on shopping site for new customer
  Verify signup for new customer

	@SignUp
  Scenario: SignUp for new customer
    Given User enter "rosh@123.com" and land on Signup page
    When User enter all fields and click on Register
      | FieldName | FieldValue  |
      | Firstname | rosh        |
      | Lastname  | cow         |
      | Password  | uob@123     |
      | Address   | cherry road |
      | City      | Singapore   |
      | State     | Rajsthan    |
      | Postcode  |       41300 |
      | Mobile    |    98000123 |
    Then User shouls see My Account page
