package hooks;

import com.aventstack.extentreports.Status;
import com.example.auto.util.ExtentTestManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;


public class Hooks {

//    @Before
//    public void beforeScenario(Scenario scenario) {
//        String reportFileName = System.getProperty("user.dir") + "/report/extent-report.html";
//        ExtentTestManager.startTest("Test Scenario: " + scenario.getName(), reportFileName);
//    }
//
//    @After
//    public void afterScenario(Scenario scenario) {
//
//        if (scenario.isFailed()) {
//            ExtentTestManager.getTest().log(Status.FAIL, "Scenario is failed");
//        }
//        ExtentTestManager.endTest();
//    }
}
