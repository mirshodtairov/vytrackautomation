
Feature: CRM module
#  Agile Story
#  when i login as a manager and proceed to crm tab the the value of a
#  certain opportunity price in "pivot" table must appear in the "list" table as same
  @smoke
  Scenario: i login as a manager
    Given i am in log in page
    When i proceed to "CRM"
    And i proceed to "Pivot" in the grid
    And i expand "total"
    Then i click "Opportunity" button
    Then i choose one of the opportunities
    Then i proceed t "List" in the grid
    Then i choose the same opportunity
    Then i verify that booth opportunities matches

#  Agile Story
#  when i login as a manager and proceed crm tab, and open "pivot"
#  table the total revenue must match the sum of opportunities

  @smoke
  Scenario: i log in as a manager
      Given i am in log in page
      When i proceed to "CRM"
      And i proceed to "Pivot" in the grid
      And i expand "total"
      Then i click "Opportunity" button
      Then i verify that total matches the sum of the table
