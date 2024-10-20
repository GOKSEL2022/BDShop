@US01    @regression     @smoke
Feature: sayfaya kayit tesi
  Background:
    Given kullanici url ye gider
    When  kullanici anasayfanin acildigini dogrular

  Scenario: sayfa_acilis_testi
    And   kullanici loginHome butona tiklar
    And   kullanici loginLogin butona tiklar
    And   kullanici email ve password alanlarinda This is a required field uyarisini goruntuler
    And   kullanici sayfayi kapatir

    @TC02
  Scenario: ad ve soyad alanlari oncesi bosluk birakma testi
    And   kullanici loginHome butona tiklar
    And   kullanici eposta alanina bosluk birakarak valid deger girer
    And   kullanici sifre alanina bosluk birakarak valid deger girer
    And   kullanici loginLogin butona tiklar
