
Feature: Login
  

  
  Scenario: Login with valid credentials
    Given User launch crome browser
    When User opens app url "https://sakshingp.github.io/assignment/login.html"
    Then user enter username as "naidu" and password as "123"
    And click on login
    And page title should be ""
    Then user click on logout link
    And page title should be ""
    And close the browser

 