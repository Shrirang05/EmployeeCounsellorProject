Feature: Mouse action
Scenario: Performing mouse action
    Given Open test automation practice page "<sheetname>" and <rownum>
    #And Click on mouse hover
    And Double click on copy text button
    And Perform drag and drop option
    And Perform slider action
    And Scrolling dropdown
    
     Examples:
    | sheetname | rownum |
    |   Sheet1  |   1    |