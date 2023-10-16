Feature: US1003 Kullanici gecerli bilgilerle sayfaya giris yapar

  Scenario: TC05 qualitydemy pozitif login testi
    Given kullanici "qdUrl" anasayfaya gider
    Then  ilk login linkine tiklar
    And username kutusuna "gecerliEmail" yazar
    And password kutusuna "gecerliPassword" yazar
    And login butonuna basar
    Then basarili giris yapildigini test eder
    And sayfayi kapatir