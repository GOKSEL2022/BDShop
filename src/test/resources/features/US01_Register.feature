@US01    @regression     @smoke
Feature: sayfaya kayit tesi
  Scenario: sayfa_acilis_testi
    Given kullanici url ye gider
    When  kullanici anasayfanin acildigini dogrular
    And   kullanici loginHome butona tiklar
    And   kullanici loginLogin butona tiklar
    And   kullanici email ve password alanlarinda This is a required field uyarisini goruntuler
    And   kullanici sayfayi kapatir