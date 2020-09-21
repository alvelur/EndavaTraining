Feature: Order a pizza
  Me as a papa johns client
  I need to order a classic pizza
  To order it at home

  Scenario: Order a classic Pizza
    Given I'm in "https://www.papajohns.com.co/"
    When I select a chicken mushroom pizza
    Then I select ingredients and size
