package LeagueOfLegends;


import Chrome.LogInRun;
import StepObject.LogInSteps;
import io.qameta.allure.Epic;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;


@Epic("ლოგინის გვერდი")
@Severity(SeverityLevel.CRITICAL)
public class LogInTest extends LogInRun {
    LogInSteps LogIn = new LogInSteps();


    @Test(description = "validurad avsebs loginis formats")
    public void LogInCase1(){
        LogIn.LogInL1();
    }


    @Test(description = "amowmebs tu 20 cifrzec imushavebs igive case")
    public void LogInCase2(){
        LogIn.LogInL2();
    }


    }

