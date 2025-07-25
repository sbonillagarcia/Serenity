Feature: Login falabella

  Scenario: login succesful with valid credentials

    Given the user opens the login page
    When they enter valid credentials
      | username | admin    |
      | password | admin123 |
    Then they should be redirected to the dashboard