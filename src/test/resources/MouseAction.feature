Feature: Mouse action

    #Background: setup for scenario
    
     @smoke
    Scenario: Performing mouse action
     Given Open test automation practice page "<sheetname>" and <rownum>
    #And Click on mouse hover
    Given Double click on copy text button
    Given Perform drag and drop option
    Given Perform slider action
    Given Scrolling dropdown  
    
    Examples:
    | sheetname | rownum |
    |   Sheet1  |   1    |
      
    
    