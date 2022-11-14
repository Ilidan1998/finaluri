package PageObject;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selectors.*;
import static DataObject.PlusData.PatchNotes.*;

public class PlusPage {

  public   SelenideElement
            languageBtn = $(byClassName(LanguageBtn)),
            SwitcLeng1 = $(byClassName(LengBtnName),0),
          SwitcLeng2 = $(byClassName(LengBtnName),1),
          SwitcLeng3 = $(byClassName(LengBtnName),2),
          SwitcLeng4 = $(byClassName(LengBtnName),3),
          SwitcLeng5 = $(byClassName(LengBtnName),4),
          SwitcLeng6= $(byClassName(LengBtnName),5),
          SwitcLeng7= $(byClassName(LengBtnName),6),
          SwitcLeng8= $(byClassName(LengBtnName),7),
          SwitcLeng9= $(byClassName(LengBtnName),8),
          SwitcLeng10= $(byClassName(LengBtnName),9),
          SwitcLeng11 = $(byClassName(LengBtnName),10),
          SwitcLeng12 = $(byClassName(LengBtnName),11),
          SwitcLeng13 = $(byClassName(LengBtnName),12),
          SwitcLeng14 = $(byClassName(LengBtnName),13),
          SwitcLeng15 = $(byClassName(LengBtnName),14),
          SwitcLeng16 = $(byClassName(LengBtnName),15),
          SwitcLeng17 = $(byClassName(LengBtnName),16),
          SwitcLeng18 = $(byClassName(LengBtnName),17),
          SwitcLeng19 = $(byClassName(LengBtnName),18),









  CheckEnglishNA = $(byText( EnglishNA)),
          CheckEnglishEUW =$(byText(EnglishEUW)),
          CheckDeutsch =$(byText(Deutsch)),
          CheckEspañolEUW =$(byText(EspañolEUW)),
          CheckFrançais =$(byText( Français)),
          CheckItaliano =$(byText(Italiano)),
          CheckEnglishEUNE =$(byText(EnglishEUNE)),
          CheckPolski =$(byText(Polski)),
          CheckΕλληνικά =$(byText( Ελληνικά)),
          CheckRomână =$(byText(Română)),
          CheckMagyar =$(byText(Magyar)),
          CheckČeština =$(byText(Čeština)),
          CheckEspañolLATAM =$(byText(EspañolLATAM)),
          CheckPortuguês =$(byText(Português)),
          Check日本語 =$(byText(日本語 )),
          CheckРусский =$(byText(Русский)),
          CheckTürkçe =$(byText(Türkçe)),
          CheckEnglishOCE =$(byText(EnglishOCE)),
          Check한국어 =$(byText(한국어));


}
