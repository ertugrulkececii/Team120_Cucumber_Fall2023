Feature:US2001 Kullanici amazon'da arama yapar
@amazon
  Scenario: TC001 Amazonda iPhone 15 pro arama testi

    Given kullanici "amazonUrl" anasayfaya gider
    Then arama kutusuna "iPhone 15 pro" yazip aratir
    Then arama souclarinin sonuc sayisini yazdir
    And  aramayi kapatir