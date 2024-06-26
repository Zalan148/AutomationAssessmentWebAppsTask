Feature: Test Boards Page features
  As a user of Trello
  I would like to be able to create a new board, view an existing board and view closed boards from the Boards page
  So that I can manage progress of tasks

  Background:
    Given I have logged in successfully
    And   I arrive at Boards page

  @zalantest
  Scenario: A new board can be created from the Boards page
    When I click on Create New Board
    And  Enter a board title from Boards page
    And  Select a background image
    And  Click Create Board button from Boards page
    Then A board is created

  @zalantest
  Scenario: An existing board can be viewed
    When I click on an existing board
    Then board is displayed

  @zalantest
  Scenario: All closed boards can be viewed from the Boards page
    When I click on View All Closed Boards
    Then Boards that have been closed will be displayed