@tabs
  Feature: checking all tabs are clickable

    Scenario: Log in with manager
      Given i login as a "eventscrmmanager13@info.com" with "eventscrmmanager"
      Then I proceed to all tabs one by one


        | Discuss     |
        | Calendar    |
        | Notes       |
        | Contacts    |
        | CRM         |
        | Sales       |
        | Website     |
        | Inventory   |
        | Repairs     |
        | Events      |
        | Employees   |
        | Leaves      |
        | Expenses    |
        | Maintenance |
        | Dashboards  |
