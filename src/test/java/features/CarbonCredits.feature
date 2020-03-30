Feature: Verify Acceptance criteria using Rest-assured

Scenario: Verify name, CanRelist and gallery descriptions

Given I perform get operations for "tmsandbox"
Then I should see the name as "Carbon credits"
Then I should see the CanRelist as "true"
Then I should  see gallery description as "2x larger image"