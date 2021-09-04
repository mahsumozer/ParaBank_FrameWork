package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features", //need to give a path for our feature file

        glue = "StepDefinitions" //we need to glue our step definitions -implementation

        ,dryRun =false// will not execute test , will just scan steps, this method will tell me the missing steps,
                //make true before run your testrunner to see your missing steps
       // ,monochrome = true
        ,tags = "@Smoke"
        ,plugin ={"pretty","html:target/cucumber-default-reports.html",

"rerun:target/failed-test","json:target/cucumber.json"}




   )


public class TestRunner {
}
