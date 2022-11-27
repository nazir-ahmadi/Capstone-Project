Feature: Retail Account Page
  Note: For this feature you have to have an account and be logged in into account. Repeated steps are
  under Background Keyword

  Background: 
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'fakerson@foo.com' and password 'Fake@1234512'
    And User click on login button
    And User should be logged in into Account
    When User click on Account option

  @NameUpdate
  Scenario: Verify User can update Profile Information
    And User update Name 'NewSampleName' and Phone '0987656789'
    And User click on Update button
    Then user profile information should be updated

  @PasswordUpdate
  Scenario: Verify User can Update password
    And User enter below information
      | previousPassword | newPassword  | confirmPassword |
      | Fake@1234511     | Fake@1234512 | Fake@1234512    |
    And User click on Change Password button
    Then a message should be displayed ‘Password Updated Successfully’

  @addPaymentMethod
  Scenario: Verify User can add a payment method
    And User fill Debit or credit card information
      | cardNumber       | nameOnCard   | expirationMonth | expirationYear | securityCode |
      | 0987654321234567 | Mr. Fakerson |              12 |           2023 |          123 |
    And User click on Add your card button
    Then a message should be displayed ‘Payment Method added successfully’

  @EditPaymentMethod
  Scenario: Verify User can edit Debit or Credit card
    And User click on Edit option of card section
    And user edit information with below data
      | cardNumber       | nameOnCard            | expirationMonth | expirationYear | securityCode |
      | 1234567890111213 | Mrs. and Mr. Fakerson |               1 |           2025 |          321 |
    And user click on Update Your Card button
    Then a message should be displayed ‘Payment Method updated Successfully’

  @RemoveCard
  Scenario: Verify User can remove Debit or Credit card
    And User click on remove option of card section
    Then payment details should be removed

  @AddAddress
  Scenario: Verify User can add an Address
    And User click on Add address option
    And user fill new address form with below information
      | country     | fullName      | phoneNumber | streetAddress   | apt | city  | state | zipCode |
      | Afghanistan | Fake Fakerson |  0987654321 | 143 fake street | 786 | Kabul | Kabul |   10001 |
    And User click Add Your Address button
    Then a message should be displayed ‘Address Added Successfully’

  @EditAddress
  Scenario: Verify User can edit an Address added on account
    And User click on edit address option
    And user fill edited address form with below information
      | country       | fullName      | phoneNumber | streetAddress   | apt | city        | state      | zipCode |
      | United States | Mrs. Fakerson |          12 | 143 love street | 143 | Santa Clara | California |    95051 |
    And User click update Your Address button
    Then a message should be displayed ‘Address Updated Successfully’

	@removeAddress
  Scenario: Verify User can remove Address from Account
    And User click on remove option of Address section
    Then Address details should be removed
