Feature: Login
  Scenario: Login as a driver
    Given i am on log in page
    When I log in as a driver
    Then I should be able to see the dashboard page

