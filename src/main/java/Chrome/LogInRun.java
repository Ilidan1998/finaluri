package Chrome;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeTest;

import static com.codeborne.selenide.Selenide.open;

public class LogInRun {
    @BeforeTest(description = "ხსნის ლოგინის გვერდს")
    public static void OpenPage(){

        open("https://auth.riotgames.com/login#client_id=prod-xsso-leagueoflegends&code_challenge=9DVn1qvktSsuDdlt-Knan9uBx5hcXiBxKv8DFr7kCsY&code_challenge_method=S256&redirect_uri=https%3A%2F%2Fxsso.leagueoflegends.com%2Fredirect&response_type=code&scope=openid%20account&state=373c696509003c17c9c856e618");
    }
}
