@US01    @regression     @smoke
Feature: sayfaya uyelik icin pozitif ve negatif test senaryolari
  Background:
    Given kullanici url ye gider
    When  kullanici anasayfanin acildigini dogrular
    And   kullanici registerHome butona tiklar
    And   kullanici register sayfasina yonlendirildigini dogrular

  @US01_TC01
  Scenario:  register sayfasinda herhangi bir deger girmeden hesap olustura tiklama testi
    And kullanici registerHome butona tiklar
    And kullanici register sayfasina yonlendirildigini dogrular
    And kullanici create an account butona tiklar
    And kullanici zorunlu alanlar uzerinde This is a required field uyarisini goruntuler
    And kullanici sayfayi kapatir

  @US01_TC002
  Scenario: ad ve soyad alanlarinda bosluk birakildiginda hesap kaydini dogrulama testi

