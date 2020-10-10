Feature: Calendar

  Scenario: As user
    I want to create an event for all day in the currentDate
    using title, description, check to define it for all day long and no alarm
    So that I can save a special event

    Given I have opened my calendar app
    When I click add button
    And I type 'Special Event' in title textbox in calendar activity
    And I type 'Busy day' in description textbox in calendar activity
    And I check the event for the all day in calendar activity
    And I click on the save button in calendar activity
    Then I search 'Special Event' event to verify if it is created

