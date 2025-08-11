Feature: user registration

  As a new user
  I want to register in the application
  So that I can access to my account

  Scenario: valid registration
    Given the user opens the registration page
    When the user registers with valid data:
      | firstName       | Sayury                        |
      | lastName        | Test                          |
      | email           | sbonillagarcia12@hotmail.com  |
      | idType          | CC                            |
      | idNumber        | 1234567890                    |
      | confirmId       | 1234567890                    |
      | phoneNumber     | 3216549870                    |
      | password        | Passw0rd!                     |
      | confirmPassword | Passw0rd!                     |
      | acceptTOS       | true                          |
    Then the user should see the message "Registro exitoso"


