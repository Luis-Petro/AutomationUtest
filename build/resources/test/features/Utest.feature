@stories
Feature: I as a Utest user
  I want to be able to register on your website
  To have access to all its functions

  Scenario:Verify a successful registration in Utest
    Given than user enters the website
    When   you fill out the registration form
      |strFirstName| strLastName|           strEmail           | strDateOfBirth | strLanguage | strCity  | strPostalCode | strCountry |
      | luis       |   Perez    |    pepitoperez@ramau.com     | 12/09/2000     |  Spanish    | Cartegena|        3920   |    Colombia|
