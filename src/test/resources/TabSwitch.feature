Feature: Tab and Winow
Scenario: Switching between tab and window
    Given Open test automation practice page "<sheetname>" and <rownum>
    And Click on new tab
    And Verify new tab open
    And Click on CloudFlare
    And Click on popup window
    When Verify new window open 
    Then Click on Download button
    
    
    #Given Open test automation practice page "<sheetname>" and <rownum>
    #Given Enter into searchbox
    #Given Click on search button
    #Given Click on Testing from Wikipedia search result
    
    Examples:
    | sheetname | rownum |
    |   Sheet1  |   1    |

 