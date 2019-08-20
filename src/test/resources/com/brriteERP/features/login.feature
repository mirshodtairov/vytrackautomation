@wip
Feature: Login with different types of user


  Scenario Outline: Login with different credentials
    Given I login as a "<user>" with "<password>"
    Then Title page must be "Login | Brite ERP - Best solution for startups"



    Examples:
      | user               | password         |
      | salesmanager15     | salesmanager     |
      | POSManager15       | posmanager       |
      | InventoryManager15 | inventorymanager |
      | ExpensesManager15  | expensesmanager  |
      | salesmanager15     | salesmanager     |







