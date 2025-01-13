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
    And kullanici first name alanina bosluk birakarak valid girer
    And kullanici last name alanina bosluk birakarak valid girer
    And kullanici create an account butona tiklar
    And kullanici first name ve last name alanlarinda zorunlu alan uyarisi olmadigini dogrular
    And kullanici email ve password alanlarinda This is a required field uyarisini goruntuler
    And kullanici sayfayi kapatir

  @US01_TC003
  Scenario: ad ve soyad alanlarinda valid deger oncesi sayi ile hesap kaydini dogrulama testi
    And kullanici first name alanina sayi ile birlikte valid girer
    And kullanici last name alanina sayi ile birlikte valid girer
    And kullanici create an account butona tiklar
    And kullanici first name ve last name alanlarinda zorunlu alan uyarisi olmadigini dogrular
    And kullanici email ve password alanlarinda This is a required field uyarisini goruntuler
    And kullanici sayfayi kapatir

  @US01_TC004
  Scenario: ad ve soyad alanlarinda valid deger oncesi sembol ile hesap kaydini dogrulama testi
    And kullanici first name alanina sembol ile birlikte valid girer
    And kullanici last name alanina sembol ile birlikte valid girer
    And kullanici create an account butona tiklar
    And kullanici first name ve last name alanlarinda zorunlu alan uyarisi olmadigini dogrular
    And kullanici email ve password alanlarinda This is a required field uyarisini goruntuler
    And kullanici sayfayi kapatir

  @US01_TC004
  Scenario: Gecerli girdiye sahip ad ve soyad alanlari ile Eposta alanini bos girisle kontrol etme testi
    And kullanici first name alanina valid deger girer
    And kullanici last name alanina valid deger girer
    And kullanici eposta alanini bos birakarak create an account butona tiklar
    And kullanici Eposta ve sifre alanlarinda alanlarinda This is a required field uyarisini goruntuler
    And kullanici sayfayi kapatir

  @US01_TC005
  Scenario: Gecerli girdiye sahip ad ve soyad alanlari ile Gecersiz Eposta adresi saglayarak giris kontrol etme testi
    And kullanici first name alanina valid deger girer
    And kullanici last name alanina valid deger girer
    And kullanici register eposta alanina invalid deger girer
    And kullanici create an account butona tiklar
    And kullanici Eposta ve sifre alanlarinda alanlarinda This is a required field uyarisini goruntuler
    And kullanici sayfayi kapatir

  @US01_TC006
  Scenario: Eposta alanini alfabe sağlayarak dogrulama testi
    And kullanici first name alanina valid deger girer
    And kullanici last name alanina valid deger girer
    And kullanici register eposta alanina alfabetik karakter degeri girer
    And kullanici create an account butona tiklar
    And kullanici Eposta ve sifre alanlarinda alanlarinda This is a required field uyarisini goruntuler
    And kullanici sayfayi kapatir





