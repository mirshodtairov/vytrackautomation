
Feature: CRM module
#  Agile Story
#  when i login as a manager and proceed to crm tab the the value of a
#  certain opportunity in pivot table must appear in the list table
  @smoke
  Scenario: i login as a manager
    Given i am in log in page
    When i proceed to "CRM"
    And i proceed to "pivot" in the grid
    And i expand "total"
    Then i click "opportunity" button
    Then i choose one of the opportunities
    Then i proceed t "list" in the grid
    Then i choose the same opportunity
    Then i verify that booth opportunities matches

#  Agile Story
#  As a user when i login as a manager and proceed to crm the certain opportunity under
#  pivot must be the same as in the list

  @smoke
  Scenario: i log in as a manager
      Given i am in log in page
      When i proceed to "CRM"
      And i proceed to "pivot" in the grid
      And i expand "total"
      Then i click "opportunity" button
      Then i verify that total matches the sum of the table
