package Chrome;

import org.testng.annotations.BeforeTest;

import static com.codeborne.selenide.Selenide.open;

public class PlusPageRun {

        @BeforeTest(description = "შედის მტავარ გვერდზე ")
        public void test(){
            open("https://www.leagueoflegends.com");


        }
}