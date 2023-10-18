package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber-reports1.html",
                "json:target/json-reports/cucumber1.json",
                "junit:target/xml-report/cucumber1.xml"},
        features = "src/test/resourses/features",
        glue = "stepdefinitions",
        tags = "@wip",
        dryRun = false)
public class ParalelRunner1 {
//"mvn clean verify" i terminale yazarak paralel calistirmayi baslatiriz
}
