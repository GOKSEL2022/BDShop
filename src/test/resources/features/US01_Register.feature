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
    And   kullanici email ve password alanlarinda Invalid login or password uyarisini goruntuler
    And   kullanici sayfayi kapatir

  @TC03
  Scenario: ad ve soyad alanlari oncesi ozel karakter testi
    And   kullanici loginHome butona tiklar
    And   kullanici eposta alanina ozel karakterle birlikte valid deger girer
    And   kullanici sifre alanina ozel karakterle birlikte  valid deger girer
    And   kullanici loginLogin butona tiklar
    And   kullanici email ve password alanlarinda Invalid login or password uyarisini goruntuler
    And   kullanici sayfayi kapatir

  @TC04
  Scenario: ad ve soyad alanlari oncesi sayilarla test
    And   kullanici loginHome butona tiklar
    And   kullanici eposta alanina sayilarla birlikte valid deger girer
    And   kullanici sifre alanina sayilarla birlikte  valid deger girer
    And   kullanici loginLogin butona tiklar
    And   kullanici email ve password alanlarinda Invalid login or password uyarisini goruntuler
    And   kullanici sayfayi kapatir

  @TC05
  Scenario: ad ve soyad alanlarinin bos birakilma sonrasi giris testi
    And   kullanici loginHome butona tiklar
    And   kullanici eposta alanina bosluk girer
    And   kullanici sifre alanina bosluk girer
    And   kullanici loginLogin butona tiklar
    And   kullanici email ve password alanlarinda This is a required field uyarisini goruntuler
    And   kullanici sayfayi kapatir

