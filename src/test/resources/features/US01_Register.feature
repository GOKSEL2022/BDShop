@US01    @regression     @smoke
Feature: sayfaya uyelik icin pozitif ve negatif test senaryolari
  Background:
    Given kullanici url ye gider
    When  kullanici anasayfanin acildigini dogrular

  Scenario:
    And kullanici registerHome butona tiklar
    And kullanici register sayfasina yonlendirildigini dogrular
    And kullanici sayfayi kapatir