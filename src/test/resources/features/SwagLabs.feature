Feature: SwagLabs Login tests

  Scenario: Login with standard_user
    Given I go to "https://www.saucedemo.com/"
    Then I fill username "example"
    Then Just wait 5000
