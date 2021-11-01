Feature: compose function in gmail.

  Scenario Outline: Check Login is Successfull with valid Credentials.
    Given User is at gmail login page
    And User Enters the "<username>" 
    And User Enters the "<password>" and User clicks on Login button
    When user clicks on compose button and User enters the data in subject and body.
    Then Exit and close the browser

    Examples: 
      | username                   | password |
      | prince2015akash@gmail.com  | abcdef |
