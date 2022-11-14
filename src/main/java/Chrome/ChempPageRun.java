package Chrome;

import com.codeborne.selenide.Configuration;
import io.qameta.allure.Description;
import org.testng.annotations.BeforeTest;

import static com.codeborne.selenide.Selenide.open;

public class ChempPageRun {


    @BeforeTest(description = "ხსნის ჩემპიონების გვერდის რაუზერს ")
    public static void OpenChempPage(){

open("https://www.leagueoflegends.com/en-gb/champions/");

    }
}
