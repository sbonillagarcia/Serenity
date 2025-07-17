Feature: Login

  Scenario: Successful login with valid credentials

    Given the user opens the login page
    When they enter valid credentials
      | username | password  |
      | admin    | admin123  |
    Then they should be redirected to the dashboard

