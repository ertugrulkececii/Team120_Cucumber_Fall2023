package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonStepdefinitions {

    AmazonPage amazonPage=new AmazonPage();

    @Given("kullanici amazonUrl anasayfaya gider")
    public void kullanici_amazon_url_anasayfaya_gider() {

        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
    }

    @Given("arama kutusuna Nutella yazip aratir")
    public void arama_kutusuna_nutella_yazip_aratir() {
        amazonPage.aramaKutusu.sendKeys("Nutella" + Keys.ENTER);
    }

    @Then("arama sonuclarinin Nutella icerdigini test eder")
    public void arama_sonuclarinin_nutella_icerdigini_test_eder() {
        String expectedIcerik = "Nutella";
        String actualAramaSonucu = amazonPage.sonucYaziElementi.getText();
        Assert.assertEquals(actualAramaSonucu, expectedIcerik);
    }

    @Then("sayfayi kapatir")
    public void sayfayi_kapatir() {
        Driver.closeDriver();
    }

    @Given("arama kutusuna Java yazip aratir")
    public void arama_kutusuna_java_yazip_aratir() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        amazonPage.aramaKutusu.sendKeys("Java" + Keys.ENTER);
    }
    @Then("arama sonuclarinin Java icerdigini test eder")
    public void arama_sonuclarinin_java_icerdigini_test_eder() {
        String expectedIcerik = "Java";
        String actualAramaSonucu = amazonPage.sonucYaziElementi.getText();
        Assert.assertEquals(actualAramaSonucu, expectedIcerik);
    }
    @Given("kullanici {string} anasayfaya gider")
    public void kullanici_anasayfaya_gider(String istenenUrl) {
       Driver.getDriver().get(ConfigReader.getProperty(istenenUrl));
    }
    @Given("arama kutusuna {string} yazip aratir")
    public void arama_kutusuna_yazip_aratir(String arananUrun) {
     amazonPage.aramaKutusu.sendKeys(arananUrun+ Keys.ENTER);
    }
    @Then("arama sonuclarinin {string} icerdigini test eder")
    public void arama_sonuclarinin_icerdigini_test_eder(String string) {
     //String actualSonucYazisi=
}
}