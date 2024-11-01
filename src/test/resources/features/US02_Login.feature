@US02    @regression     @smoke
Feature: sayfaya kayitli giris icin pozitif ve negatif test senaryolari
  Background:
    Given kullanici url ye gider
    When  kullanici anasayfanin acildigini dogrular

  Scenario: sayfa_acilis_testi
    And   kullanici loginHome butona tiklar
    And   kullanici loginLogin butona tiklar
    And   kullanici email ve password alanlarinda This is a required field uyarisini goruntuler
    And   kullanici sayfayi kapatir

    @TC02
 Scenario: eposta ve sifre alanlari oncesi bosluk birakma testi
    And   kullanici loginHome butona tiklar
    And   kullanici eposta alanina bosluk birakarak valid deger girer
    And   kullanici sifre alanina bosluk birakarak valid deger girer
    And   kullanici loginLogin butona tiklar
    And   kullanici email ve password alanlarinda Invalid login or password uyarisini goruntuler
    And   kullanici sayfayi kapatir

  @TC03
  Scenario: eposta ve sifre alanlari oncesi ozel karakter testi
    And   kullanici loginHome butona tiklar
    And   kullanici eposta alanina ozel karakterle birlikte valid deger girer
    And   kullanici sifre alanina ozel karakterle birlikte  valid deger girer
    And   kullanici loginLogin butona tiklar
    And   kullanici email ve password alanlarinda Invalid login or password uyarisini goruntuler
    And   kullanici sayfayi kapatir

  @TC04
  Scenario: eposta ve sifre alanlari oncesi sayilarla test
    And   kullanici loginHome butona tiklar
    And   kullanici eposta alanina sayilarla birlikte valid deger girer
    And   kullanici sifre alanina sayilarla birlikte  valid deger girer
    And   kullanici loginLogin butona tiklar
    And   kullanici email ve password alanlarinda Invalid login or password uyarisini goruntuler
    And   kullanici sayfayi kapatir

  @TC05
  Scenario: eposta ve sifre alanlarinin bos birakilma sonrasi giris testi
    And   kullanici loginHome butona tiklar
    And   kullanici eposta alanina bosluk girer
    And   kullanici sifre alanina bosluk girer
    And   kullanici loginLogin butona tiklar
    And   kullanici email ve password alanlarinda This is a required field uyarisini goruntuler
    And   kullanici sayfayi kapatir

  @TC06
  Scenario: eposta ve sifre alanlarina valid degerle sayfaya giris testi
    And   kullanici loginHome butona tiklar
    And   kullanici eposta alanina valid deger girer
    And   kullanici sifre alanina valid deger girer
    And   kullanici loginLogin butona tiklar
    And   kullanici hesabiyla sayfaya giris yapildigi dogrulanir
    And   kullanici sayfayi kapatir

  @TC07
  Scenario: eposta ve sifre alanlarina valid degerle sayfaya giris testi
    And   kullanici loginHome butona tiklar
    And   kullanici eposta alanina valid deger girer
    And   kullanici sifre alanina valid deger girer
    And   kullanici loginLogin butona tiklar
    And   kullanici hesabiyla sayfaya giris yapildigi dogrulanir
    And   kullanici sayfayi kapatir

  @TC08
  Scenario: Remember Me What's this? secenegi isaretlenmeden valid degerlerle giris testi
    And   kullanici loginHome butona tiklar
    And   kullanici eposta alanina valid deger girer
    And   kullanici sifre alanina valid deger girer
    And   kullanici remember me checkboxin secimini kaldirir
    And   kullanici loginLogin butona tiklar
    And   kullanici hesabiyla sayfaya giris yapildigi dogrulanir
    And   kullanici sayfayi kapatir

  Scena

