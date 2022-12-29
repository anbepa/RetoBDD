Feature: As test analyst
  I want to perform tests in the product module
  To validate its correct operation

  Background:
    Given the user entered the section to enter a new product

  Scenario: Create  a new product
    When you fill out the form whit
      |productName |unitsInStock|unitsOnOrder|reorderLevel|
      |PruebaAndres|1           |2           |3           |
   Then should show the created product on the screen


  Scenario: Delete  product
    When look for the product
    And delete the product
    Then not should show the created product on the screen

