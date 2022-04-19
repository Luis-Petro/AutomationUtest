#Author: Luis Petro

@stories
Feature: I as a Utest user
  I want to be able to register on your website
  To have access to all its functions

  Scenario:Verify a successful registration in Utest
    Given than user enters the website
    When   you fill out the registration form
      |strFirstName| strLastName|           strEmail           | strDateOfBirth | strLanguage | strCity  | strPostalCode | strCountry | strComputer| strComputerVersion| strPcLanguage|strMobileDevice|strModelMobile|strSoMobile|      strPassword     |
      | luis       |   Perez    |    PPpptope0zHzalez@ramau.com      | 12/09/2000     |  Spanish    | Montería |        3920   |    Colombia| Windows    | 10                |Spanish       | Samsung       | Galaxy a20   | 9         |  #Hell01994Choucair  |

    Then check for successful registration

    |                              strVerificationText                         |
    |    Welcome to the world's largest community of freelance software testers!  |

