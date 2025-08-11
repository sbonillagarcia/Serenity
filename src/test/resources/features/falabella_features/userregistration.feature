Feature: user registration

  As a new user
  I want to register in the application
  So that I can access to my account

  Scenario Outline: valid registration
    Given the user opens the registration page
    When the user registers with valid data:

      | firstName | <firstName> |
      | lastName  | <lastName>  |
      | email     | <email>     |
      | idType    | <idType>    |
      | idNumber  | <idNumber>  |
      | confirmId | <confirmId> |
      | phoneN    | <phoneN>    |
      | password  | <password>  |
      | acceptTOS | <acceptTOS> |
      | terms     | <terms>     |


    Then the user should see the message "<expectedMessage>"

    Examples:

      | firstName | lastName | email                | idType | idNumber   | confirmId  | phoneN     | password   | acceptTOS | terms | expectedMessage                        |
      | sbonilla  | prueba   | miydukirte@necub.com | CC     | 1022222222 | 1022222222 | 3113333333 | Prueba+123 | true      | true  | Te damos la bienvenida a falabella.com |


