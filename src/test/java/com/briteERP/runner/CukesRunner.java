package com.briteERP.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/default-cucumber-reports","json:target/cucumber.json"},
        features = "src/test/resources/com/brriteERP/features/",
        glue = "com.briteERP.step_definition",
        tags = "@tabs",
        dryRun = true


)
public class CukesRunner {
}
