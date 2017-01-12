package com.bootcamp.cucumber;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
/**
 * Created by GonzaMoreno on 12/1/17.
 */

@CucumberOptions(
        features = = "",
        glue={
                "classpath:com.bootcamp.cucumber.definitions"
        },
        format = { "pretty", "html:target/cucumber", "json:target/cucumber.json"},
        strict = true,
        tags = {
                "~@ignore"
        }
)

@RunWith(Cucumber.class)
public class TestRunner{

}
