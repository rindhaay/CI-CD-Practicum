Feature: Admin
  As a user
  I want to see admin page

  Scenario: As user I have be able to success login
    Given I am on the login page
    When I input valid username
    And I input valid password
    And I click login button
    And I am on the home page
    Then I click admin page