package StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import testbase.BaseClass;
import utils.CommonMethod;

public class Hooks {

    @Before
    public void startTest(){
        BaseClass.setUp();
    }


    @After
    public void endTest(Scenario scenario){
        byte[] screenshot;
        if (scenario.isFailed()){

            screenshot=CommonMethod.takeScreen("failed/"+scenario.getName());
        }else{
            screenshot=CommonMethod.takeScreen("passed/"+scenario.getName());
        }



        BaseClass.teardown();
    }
}
