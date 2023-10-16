
  Feature: US1001 Kullanici amazon anasayfada arama yapar

    @smoke
    Scenario: TC01 Kullanici amazonda Nutella aratir

      Given kullanici amazonUrl anasayfaya gider
      And arama kutusuna Nutella yazip aratir
      Then arama sonuclarinin Nutella icerdigini test eder
      And sayfayi kapatir
@smoke
      Scenario: TC02 Kullanici amazonda Java aratir
        Given kullanici amazonUrl anasayfaya gider
        And arama kutusuna Java yazip aratir
        Then arama sonuclarinin Java icerdigini test eder
        And sayfayi kapatir