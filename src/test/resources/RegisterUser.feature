Feature: Register User

  @smoke
  Scenario: Validate Register User
    Given Launch browser 
    And Navigate to url
    And Verify that home page is visible successfully "<sheetname>" and <rownum>
    And Click on Signup or login button
    And Verify new user signup is visible "<sheetname>" and <rownum>
    And Enter name and email address "<sheetname>" and <rownum>
    And Click signup button
    And Verify that ENTER ACCOUNT INFORMATION is visible "<sheetname>" and <rownum>
    And Fill details Title Name Email Password Date of birth "<sheetname>" and <rownum>
    And Select checkbox Sign up for our newsletter
    And Select checkbox Receive special offers from our partners
    And Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number "<sheetname>" and <rownum>
    And Click on Create Account button
    And Verify that ACCOUNT CREATED is visible "<sheetname>" and <rownum>
    And Click Continue button
    And Verify that Logged in as username is visible "<sheetname>" and <rownum>
    And Click Delete Account button
    #And Verify that ACCOUNT DELETED is visible and click Continue button
    
    Examples: 
      | sheetname        | rownum | 
      | AutoExercise     |    1   |
   
    
