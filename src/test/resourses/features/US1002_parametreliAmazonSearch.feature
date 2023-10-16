Feature: US1002 Kullanici parametre oalrak yazdigi urunu amazonda aratir

  Scenario: TC03 parametre ile amazonda arama
    Given kullanici "amazonUrl" anasayfaya gider
    And arama kutusuna "Java" yazip aratir
    Then arama sonuclarinin "Java" icerdigini test eder
    And sayfayi kapatir