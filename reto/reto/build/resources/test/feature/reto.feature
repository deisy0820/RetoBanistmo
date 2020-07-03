#Author: deisy mosquera
# Correo: deisymsqr6@gmail.com

Feature: enter page banistmo
  I as a user, need enter to page banistmo and download tariff

  Background:the user open page banistmo
    Given that user enter to page

  @possive_case
  Scenario: download tariff
    When  He click fees deposit rates
    Then  He validate PDF