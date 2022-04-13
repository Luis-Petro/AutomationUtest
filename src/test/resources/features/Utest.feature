#Autor: Luis Petro

@stories
Feature: I as a Utest user
  I want to be able to register on your website
  To have access to all its functions

  @scenario1
  Scenario:   Verify a successful registration in Utest
    Given than Luis enters the website
    And    goes to Join Today
    When   you fill out the registration form
      | FirstName   |
      | lUISPETRO   |
    Then check for successful registration


  #  Examples:
   #   | FirstName | LastName | Email               | DateOfBirth | Languages | City | PostalCode | Country | Computer | ComputerVersion | PcLanguage | MobileDevice | ModelMobile | SoMobile | Password | VerificationText |
   #   | LuisA      | Petro    | LuisPetro@gmail.com | 7           | 2         | 6    | 5          | 2       | 5        | 6               | 6          | 7            | 5           | 3        | 5        | 3                |