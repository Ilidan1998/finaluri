package PageObject;

import com.codeborne.selenide.SelenideElement;
import static DataObject.LogInData.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;


public class Loginpage {

    public SelenideElement
     YourName = $(byName(UserNameStr)),
    YourPassword = $(byName(PasswordStr)),
    Buton=$(byClassName(BtnName));


}
