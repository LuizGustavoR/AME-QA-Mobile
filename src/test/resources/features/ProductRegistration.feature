Feature: Product Registration

  In order to assure the product registration
  As a valid process
  I want to manage it successfully

  # Scenario Product Register All Fields
  @Product_Register_All_Fields
  Scenario: Register new Product with all fields

    Given Product needs to be registered
    When Register the product with all fields
    Then Product is registered successfully

  # Scenario Product Register Required Fields
  @Product_Register_Required_Fields
  Scenario: Register new Product with required fields

    Given Product needs to be registered
    When Register the product with required fields
    Then Product is registered successfully

  # Scenario Product edit
  @Product_edit
  Scenario: Edit Product description

    Given Product must be edited
    When User change product code
    And description
    Then check it was updated