package stepDefinitions;


import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import utils.DriverManager;

public class Hooks {

    @AfterStep
    public void waitAfterStep() throws InterruptedException {
        Thread.sleep(1000);
    }

    @After
    public void afterScenario() throws InterruptedException {
        Thread.sleep(1500);
        DriverManager.quitDriver();
    }
}

