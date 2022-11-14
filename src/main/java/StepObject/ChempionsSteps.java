package StepObject;

import PageObject.ChampionsPage;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import org.testng.Assert;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class ChempionsSteps extends ChampionsPage{

public ChempionsSteps backbtn() {
    ChempList.click();

    return this;
}

public ChempionsSteps Assasinbtn(){
    Assert.assertTrue(Assassins1.is(Condition.visible));
    Assassins1.click();
    NainTels.shouldBe(Condition.visible,Duration.ofMillis(10000)).click();
    Assert.assertFalse(ahri.is(Condition.visible));
    Duration.ofMillis(10000);
    backbtn();
    return this;
}}