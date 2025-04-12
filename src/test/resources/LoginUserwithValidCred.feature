Feature: Validate Login with Valid Cred

  @sanity
  Scenario Outline: Login using valid cred
  Given Launch browser 
  And Navigate to url
  And Verify that home page is visible successfully "Website for automation practice"
  #And Click on Signup or login button
          #And Verify new user signup is visible "New User Signup!"   
  #And Enter correct email address and password "<Email>" and "<Pass>"
  #When Click on login button
  #Then Verify that Logged in as username is visible "Logged in as shrirang"
         #When Click Delete Account button
         #Then Verify that ACCOUNT DELETED! is visible 
    

    Examples: 
      | name     |  value                         | status  |
      | Email    |  shrirangladda98@gmail.com     | success |
      | Pass     |  ShriLadda123                  | success |
