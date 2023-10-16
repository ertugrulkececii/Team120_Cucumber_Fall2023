package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.QualitydemyPage;
import utilities.ConfigReader;
import utilities.Driver;

public class QalitydemyStepdefinitions {
    QualitydemyPage qualitydemyPage=new QualitydemyPage();

    @Given("kullanici {string} anasayfaya gider")
    public void kullanici_anasayfaya_gider(String string) {
        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));
    }
    @Then("ilk login linkine tiklar")
    public void ilk_login_linkine_tiklar() {
qualitydemyPage.ilkLoginButonu.click();
    }
    @Then("username kutusuna {string} yazar")
    public void username_kutusuna_yazar(String qdGecerliEmail) {
    qualitydemyPage.emailKutusu.sendKeys(qdGecerliEmail);
    }
    @Then("password kutusuna {string} yazar")
    public void password_kutusuna_yazar(String qdGecerliPassword) {
qualitydemyPage.passwordKutusu.sendKeys(qdGecerliPassword);
    }
    @Then("login butonuna basar")
    public void login_butonuna_basar() {
qualitydemyPage.acceptCookies.click();
qualitydemyPage.loginButonu.click();
    }
    @Then("basarili giris yapildigini test eder")
    public void basarili_giris_yapildigini_test_eder() {
        Assert.assertTrue(qualitydemyPage.basariliGirisElementi.isDisplayed());
    }
    @Then("sayfayi kapatir")
    public void sayfayi_kapatir() {
Driver.closeDriver();
    }

}
