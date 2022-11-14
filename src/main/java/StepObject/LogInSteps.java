package StepObject;

import PageObject.Loginpage;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.testng.Assert;

import static DataObject.LogInData.*;

public class LogInSteps extends Loginpage {
    public LogInSteps LogInL2() {
        Assert.assertTrue(YourName.is(Condition.visible));
        YourName.setValue(MyName2);
        Assert.assertTrue(YourPassword.is(Condition.visible));
        return this;
    }

    public LogInSteps LogInL1(){
        Assert.assertTrue(YourName.is(Condition.visible));
        YourName.setValue(MyName1);
        Assert.assertTrue(YourPassword.is(Condition.visible));
        YourPassword.setValue(PasswordStr);
        Assert.assertTrue(Buton.is(Condition.enabled));
  return this;
}


}
