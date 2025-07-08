Feature: login

  Scenario: Login exitoso
    Given the user opens the login page
    When they enter valid credentials
    Then they should be redirected to the dashboard
