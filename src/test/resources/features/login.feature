Feature: Login Functionality

  Scenario: Valid login
    When I try to login with username "user06" and password "secpassword*"
    Then login should be successful

  Scenario: Invalid login
    When I try to login with username "user06" and password "wrongpassword"
    Then login should fail with status code 400