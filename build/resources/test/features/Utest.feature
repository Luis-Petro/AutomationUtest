#Author: Luis Petro

@stories
Feature: I as a Utest user
  I want to be able to register on your website
  To have access to all its functions

  Scenario Outline:Verify a successful registration in Utest
    Given than user enters the website
    When   you fill out the registration form
      | strFirstName   | strLastName   | strEmail   | strDateOfBirth   | strLanguage   | strCity   | strPostalCode   | strCountry   | strComputer   | strComputerVersion   | strPcLanguage   | strMobileDevice   | strModelMobile   | strSoMobile   | strPassword   |
      | <strFirstName> | <strLastName> | <strEmail> | <strDateOfBirth> | <strLanguage> | <strCity> | <strPostalCode> | <strCountry> | <strComputer> | <strComputerVersion> | <strPcLanguage> | <strMobileDevice> | <strModelMobile> | <strSoMobile> | <strPassword> |

    Then check for successful registration
      | strVerificationText   |
      | <strVerificationText> |
    Examples:
      | strFirstName | strLastName | strEmail                             | strDateOfBirth   | strLanguage | strCity  | strPostalCode | strCountry | strComputer | strComputerVersion | strPcLanguage | strMobileDevice | strModelMobile | strSoMobile | strPassword        | strVerificationText                                                     |
      | luis         | Perez       | Petro1994Lucho15Herrera12@lpetro.com | 15-December-1994 | Spanish     | Montería | 3920          | Colombia   | Windows     | 10                 | Spanish       | Samsung         | Galaxy a20     | 9           | #Hell01994Choucair | Welcome to the world's largest community of freelance software testers! |


