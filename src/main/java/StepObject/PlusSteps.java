package StepObject;

import PageObject.PlusPage;
import com.codeborne.selenide.Condition;
import org.testng.Assert;

import java.time.Duration;


public class PlusSteps extends PlusPage {


    public PlusSteps Chooselanguage1() {
        languageBtn.click();
        Assert.assertTrue(languageBtn.is(Condition.visible));
        Assert.assertTrue(SwitcLeng1.is(Condition.visible));
        SwitcLeng1.click();
        CheckEnglishNA.shouldBe(Condition.visible, Duration.ofMillis(30000));


        return this;
    }

    public PlusSteps Chooselanguage2(){
        languageBtn.click();
        Assert.assertTrue(languageBtn.is(Condition.visible));
        Assert.assertTrue(SwitcLeng2.is(Condition.visible));
        SwitcLeng2.click();
        CheckEnglishEUW.shouldBe(Condition.visible, Duration.ofMillis(30000));
        return this;

    } public PlusSteps Chooselanguage3(){
        languageBtn.click();
        Assert.assertTrue(languageBtn.is(Condition.visible));
        Assert.assertTrue(SwitcLeng3.is(Condition.visible));
        SwitcLeng3.click();
        CheckDeutsch.shouldBe(Condition.visible, Duration.ofMillis(30000));
        return this;

    } public PlusSteps Chooselanguage4(){
        languageBtn.click();
        Assert.assertTrue(languageBtn.is(Condition.visible));
        Assert.assertTrue(SwitcLeng4.is(Condition.visible));
        SwitcLeng4.click();
        CheckEspañolEUW.shouldBe(Condition.visible, Duration.ofMillis(30000));
        return this;

    } public PlusSteps Chooselanguage5(){
        languageBtn.click();
        Assert.assertTrue(languageBtn.is(Condition.visible));
        Assert.assertTrue(SwitcLeng5.is(Condition.visible));
        SwitcLeng5.click();
        CheckFrançais.shouldBe(Condition.visible, Duration.ofMillis(30000));
        return this;

    } public PlusSteps Chooselanguage6(){
        languageBtn.click();
        Assert.assertTrue(languageBtn.is(Condition.visible));
        Assert.assertTrue(SwitcLeng6.is(Condition.visible));
        SwitcLeng6.click();
        CheckItaliano.shouldBe(Condition.visible, Duration.ofMillis(30000));
        return this;

    }
    public PlusSteps Chooselanguage7(){
        languageBtn.click();
        Assert.assertTrue(languageBtn.is(Condition.visible));
        Assert.assertTrue(SwitcLeng7.is(Condition.visible));
        SwitcLeng7.click();
        CheckEnglishEUNE.shouldBe(Condition.visible, Duration.ofMillis(30000));
        return this;
    }

    public PlusSteps Chooselanguage8(){
        languageBtn.click();
        Assert.assertTrue(languageBtn.is(Condition.visible));
        Assert.assertTrue(SwitcLeng8.is(Condition.visible));
        SwitcLeng8.click();
        CheckPolski.shouldBe(Condition.visible, Duration.ofMillis(30000));
        return this;
    }

    public PlusSteps Chooselanguage9(){
        languageBtn.click();
        Assert.assertTrue(languageBtn.is(Condition.visible));
        Assert.assertTrue(SwitcLeng9.is(Condition.visible));
        SwitcLeng9.click();
        CheckΕλληνικά.shouldBe(Condition.visible, Duration.ofMillis(30000));
        return this;
    }
    public PlusSteps Chooselanguage10(){
        languageBtn.click();
        Assert.assertTrue(languageBtn.is(Condition.visible));
        Assert.assertTrue(SwitcLeng10.is(Condition.visible));
        SwitcLeng10.click();
        CheckRomână.shouldBe(Condition.visible, Duration.ofMillis(30000));
        return this;
    }

    public PlusSteps Chooselanguage11(){
        languageBtn.click();
        Assert.assertTrue(languageBtn.is(Condition.visible));
        Assert.assertTrue(SwitcLeng11.is(Condition.visible));
        SwitcLeng11.click();
        CheckMagyar.shouldBe(Condition.visible, Duration.ofMillis(30000));
        return this;
    }

    public PlusSteps Chooselanguage12(){
        languageBtn.click();
        Assert.assertTrue(languageBtn.is(Condition.visible));
        Assert.assertTrue(SwitcLeng12.is(Condition.visible));
        SwitcLeng12.click();
        CheckČeština.shouldBe(Condition.visible, Duration.ofMillis(30000));
        return this;
    }


    public PlusSteps Chooselanguage14(){
        languageBtn.click();
        Assert.assertTrue(languageBtn.is(Condition.visible));
        Assert.assertTrue(SwitcLeng14.is(Condition.visible));
        SwitcLeng14.click();
        CheckPortuguês.shouldBe(Condition.visible, Duration.ofMillis(30000));
        return this;
    }
    public PlusSteps Chooselanguage15(){
        languageBtn.click();
        Assert.assertTrue(languageBtn.is(Condition.visible));
        Assert.assertTrue(SwitcLeng15.is(Condition.visible));
        SwitcLeng15.click();
        Check日本語.shouldBe(Condition.visible, Duration.ofMillis(30000));
        return this;
    }
    public PlusSteps Chooselanguage16(){
        languageBtn.click();
        Assert.assertTrue(languageBtn.is(Condition.visible));
        Assert.assertTrue(SwitcLeng16.is(Condition.visible));
        SwitcLeng16.click();
       CheckРусский.shouldBe(Condition.visible, Duration.ofMillis(30000));
        return this;
    }

    public PlusSteps Chooselanguage17(){
        languageBtn.click();
        Assert.assertTrue(languageBtn.is(Condition.visible));
        Assert.assertTrue(SwitcLeng17.is(Condition.visible));
        SwitcLeng17.click();
        CheckTürkçe.shouldBe(Condition.visible, Duration.ofMillis(30000));
        return this;
    }


    public PlusSteps Chooselanguage18(){
        languageBtn.click();
        Assert.assertTrue(languageBtn.is(Condition.visible));
        Assert.assertTrue(SwitcLeng18.is(Condition.visible));
        SwitcLeng18.click();
       CheckEnglishOCE.shouldBe(Condition.visible, Duration.ofMillis(30000));
        return this;
    }
    public PlusSteps Chooselanguage19(){
        languageBtn.click();
        Assert.assertTrue(languageBtn.is(Condition.visible));
        Assert.assertTrue(SwitcLeng19.is(Condition.visible));
        SwitcLeng19.click();
        Check한국어.shouldBe(Condition.visible, Duration.ofMillis(30000));
        return this;


}

}

