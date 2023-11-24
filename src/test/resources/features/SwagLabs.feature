Feature: SwagLabs Login tests

  Scenario: Login with standard_user
    Given I go to "https://www.saucedemo.com/"
    Then I fill username "example"
    Then Just wait 5000

  Scenario: FullFild Button
    Given I go to "https://fd.fulfilld.qa/auth/login"
    Then Fulfilld - I click login button
    And Switch to new opened tab
    Then Fulfilld - I login through microsoft service
    Then Just wait 50000



