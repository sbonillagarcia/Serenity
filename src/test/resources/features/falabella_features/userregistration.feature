Feature: user registration

  As a new user
  I want to register in the application
  So that I can access to my account

  Scenario Outline: valid registration
    Given the user opens the registration page
    When the user registers with valid data:

      | firstName    | <firstName>    |
      | lastName     | <lastName>     |
      | email        | <email>        |
      | password     | <password>     |
      | confirmPass  | <confirmPass>  |
      | acceptTOS    | <acceptTOS>    |

    Then the user should see the message "<expectedMessage>"

    Examples:
      | firstName | lastName | email               | password    | confirmPass  | acceptTOS | expectedMessage               |
      | Juan      | Pérez    | juan.perez@mail.com | Passw0rd!   | Passw0rd!    | true      | Registro exitoso              |
      | María     | Gómez    | maria.gomez@mail.co | S3gur0_Pass | S3gur0_Pass  | true      | Registro exitoso              |


