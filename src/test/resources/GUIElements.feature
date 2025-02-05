Feature: Automation practice

@smoke
Scenario: To validate the GUI elements
    Given Open test automation practice page "<sheetname>" and <rownum>
    Given Verify correct page is open "<sheetname>" and <rownum>
    And Enter the name "<sheetname>" and <rownum>
    And Enter the Email "<sheetname>" and <rownum>
    And Enter the phone no "<sheetname>" and <rownum>
    And Enter the Address "<sheetname>" and <rownum>
    And Select gender
    And Select multiple days
    And Select the country from dropdown
    And Select colors
    And Select Sorted list
    And Enter the datepicker1 "<sheetname>" and <rownum>    

    #And handle simple alert
    #And handle confirmation alert
    #And handle prompt alert
    
@regression
    And Click on date picker2
    And Select month and Year
    And Select Date
    And Choose single file
    And Choose multiple file
    And Upload single file
    And Upload multiple file
    
    
    
    Examples:
    | sheetname | rownum |
    |   Sheet1  |   1    |
    
    