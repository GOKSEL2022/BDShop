@US02    @regression     @smoke
Feature: sayfaya kayitli giris icin pozitif ve negatif test senaryolari
  Background:
    Given kullanici url ye gider
    When  kullanici anasayfanin acildigini dogrular
    And   kullanici loginHome butona tiklar

  Scenario: sayfa_acilis_testi
    And   kullanici loginLogin butona tiklar
    And   kullanici email ve password alanlarinda This is a required field uyarisini goruntuler
    And   kullanici sayfayi kapatir

    @TC02
 Scenario: eposta ve sifre alanlari oncesi bosluk birakma testi
    And   kullanici eposta alanina bosluk birakarak valid deger girer
    And   kullanici sifre alanina bosluk birakarak valid deger girer
    And   kullanici loginLogin butona tiklar
    And   kullanici email ve password alanlarinda Invalid login or password uyarisini goruntuler
    And   kullanici sayfayi kapatir

  @TC03
  Scenario: eposta ve sifre alanlari oncesi ozel karakter testi
    And   kullanici eposta alanina ozel karakterle birlikte valid deger girer
    And   kullanici sifre alanina ozel karakterle birlikte  valid deger girer
    And   kullanici loginLogin butona tiklar
    And   kullanici email ve password alanlarinda Invalid login or password uyarisini goruntuler
    And   kullanici sayfayi kapatir

  @TC04
  Scenario: eposta ve sifre alanlari oncesi sayilarla test
    And   kullanici eposta alanina sayilarla birlikte valid deger girer
    And   kullanici sifre alanina sayilarla birlikte  valid deger girer
    And   kullanici loginLogin butona tiklar
    And   kullanici email ve password alanlarinda Invalid login or password uyarisini goruntuler
    And   kullanici sayfayi kapatir

  @TC05
  Scenario: eposta ve sifre alanlarinin bos birakilma sonrasi giris testi
    And   kullanici eposta alanina bosluk girer
    And   kullanici sifre alanina bosluk girer
    And   kullanici loginLogin butona tiklar
    And   kullanici email ve password alanlarinda This is a required field uyarisini goruntuler
    And   kullanici sayfayi kapatir

  @TC06
  Scenario: eposta ve sifre alanlarina valid degerle sayfaya giris testi
    And   kullanici eposta alanina valid deger girer
    And   kullanici sifre alanina valid deger girer
    And   kullanici loginLogin butona tiklar
    And   kullanici hesabiyla sayfaya giris yapildigi dogrulanir
    And   kullanici sayfayi kapatir

  @TC07
  Scenario: eposta ve sifre alanlarina invalid degerle sayfaya giris testi
    And   kullanici eposta alanina invalid deger girer
    And   kullanici sifre alanina invalid deger girer
    And   kullanici loginLogin butona tiklar
    And   kullanici hesabiyla sayfaya giris isleminin basarisiz oldugu dogrulanir
    And   kullanici sayfayi kapatir

  @TC08
  Scenario: Remember Me What's this? secenegi isaretlenmeden valid degerlerle giris testi
    And   kullanici eposta alanina valid deger girer
    And   kullanici sifre alanina valid deger girer
    And   kullanici remember me checkboxin secimini kaldirir
    And   kullanici loginLogin butona tiklar
    And   kullanici hesabiyla sayfaya giris yapildigi dogrulanir
    And   kullanici sayfayi kapatir

   @TC09
   Scenario: Forgot linke tiklayarak sifremi unuttum alanina yonlendirilme testi
     And kullanici forgot linke tiklar
     And kullanici forgot password sayfasinda sifresini sifirlayabilecegini dogrular
     And kullanici reset my password butona tiklar
     And kullanici zorunlu alanlarda This is a required field uyarisini goruntuler
     And kullanici sayfayi kapatir

  @TC10
  Scenario: Klavye tuslarini (Tab ve Enter) kullanarak Uygulamada oturum acmayi dogrulama testi
    And   kullanici eposta alanina valid deger girer
    And   kullanici tab tusu ile sifre alanina gelerek valid sifre girer
    And   kullanici tab tusu ile loginLogin butona gelir ve entera tiklar
    And   kullanici hesabiyla sayfaya giris yapildigi dogrulanir
    And   kullanici sayfayi kapatir

   @TC11
   Scenario:



