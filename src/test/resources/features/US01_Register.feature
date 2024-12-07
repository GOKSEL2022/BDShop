@US01    @regression     @smoke
Feature: sayfaya uyelik icin pozitif ve negatif test senaryolari
  Background:
    Given kullanici url ye gider
    When  kullanici anasayfanin acildigini dogrular

  @US01_TC01
  Scenario: register sayfasina erisebilme testi
    And kullanici registerHome butona tiklar
    And kullanici register sayfasina yonlendirildigini dogrular
    And kullanici sayfayi kapatir

  @US01_TC02
  Scenario:  register sayfasinda herhangi bir deger girmeden hesap olustura tiklama testi
    And kullanici registerHome butona tiklar
    And kullanici register sayfasina yonlendirildigini dogrular
    And kullanici create an account butona tiklar
    And kullanici zorunlu alanlar uzerinde This is a required field uyarisini goruntuler
    And kullanici sayfayi kapatir

  @US01_TC03
  Scenario:

