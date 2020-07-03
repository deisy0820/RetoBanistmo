#Author: deisy mosquera
# Correo: deisymsqr6@gmail.com

Feature: enter page Ninja store
  I as a user, need enter to page Ninja store and search a add a new address a to the account

  Background:the user open page Ninja store
    Given that user enter to page

  @possive_case
  Scenario: add new address a to account
    When  He enter new address a ti the account
    Then  He validate that the address was added