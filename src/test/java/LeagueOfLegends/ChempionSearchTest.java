package LeagueOfLegends;

import Chrome.ChempPageRun;
import StepObject.ChempionsSteps;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selectors.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

@Test
@Epic("ჩემპიონების გვერდი")
@Severity(SeverityLevel.CRITICAL)
public class ChempionSearchTest extends ChempPageRun {
ChempionsSteps checkchemp=new ChempionsSteps();


    @Test(description = "6 ჩემპიონზე დაკლიკება და უკან გამოსვლის ღილაკის შემოწმება")
    public void testExel() throws IOException, BiffException {
        String FilePath = "files/TEST.xls";
        FileInputStream fs = new FileInputStream(FilePath);
        Workbook wb = Workbook.getWorkbook(fs);
        Sheet sheet = wb.getSheet("TEST");
        for (int row = 1; row < 7; row++) {
            String str1 = "//span[text()='" + sheet.getCell(0, row).getContents() + "']";
            SelenideElement chempions = $(byXpath(str1));
            chempions.click();
            Duration.ofMillis(10000);
            checkchemp.backbtn();
            Duration.ofMillis(10000);
   }}


    @Test(description = "ასასინების გვერდზე შესვალა კონკრეტული ჩემპიონიში შესვლა და გამოსვა ")
    public void DificoltAssasin(){
        checkchemp.Assasinbtn();


}



}







//
//       @Test
//            public void testExel() throws IOException, BiffException{
//                  String FilePath = "files/TEST.xls";
//                FileInputStream fs = new FileInputStream(FilePath);
//                Workbook wb = Workbook.getWorkbook(fs);
//                   Sheet sheet = wb.getSheet("TEST");
//                   SelenideElement nameinput = $(byId("react-select-14-input"));
//           nameinput.click();
//
//                int TotalRow = sheet.getRows();
//                for (int row = 1 ; row<TotalRow;row++){
//             nameinput.setValue(sheet.getCell(0,row).getContents()).pressEnter();
//            SelenideElement asd = $(".style__Text-n3ovyt-3");
//                  Assert.assertEquals(asd.getText(),sheet.getCell(0,row).getType());




//@Test
//public void testExel() throws IOException, BiffException {
//    String FilePath = "files/TEST.xls";
//    FileInputStream fs = new FileInputStream(FilePath);
//    Workbook wb = Workbook.getWorkbook(fs);
//    Sheet sheet = wb.getSheet("TEST");
//
//    for (int row = 1; row < 160; row++) {
//        String str1 = "//span[text()='" + sheet.getCell(0, row).getContents() + "']";
//        SelenideElement chempions = $(byXpath(str1));
//        chempions.click();
//        SelenideElement ChempList = $(byClassName("iNzOgG"));
//        ChempList.click();
//    }
//}
