package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin ={"html:target/cucumber-reports.html",
        "json:target/json-reports/cucumber.json",
        "junit:target/xml-report/cucumber.xml"},
        features = "src/test/resourses",
        glue = "stepdefinitions",
        tags ="@nltest",
        dryRun=false

)
public class Runner {

    /*
    git init
git add .
git commit -m "first commit"
git branch -M main
git remote add origin https://github.com/ertugrulkececii/Team120_Cucumber_Fall2023.git
git push -u origin main
     */
}
