package setup;

import io.cucumber.java.Before;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks {
    // Esto hace que Serenity maneje automáticamente el navegador
    @Managed(driver = "chrome")
    WebDriver driver;

    // Este metodo se ejecuta antes de cada escenario
    @Before
    public void setTheStage() {
        WebDriverManager.chromedriver().setup(); // 👉 configura automáticamente el driver
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("User").can(BrowseTheWeb.with(driver));
    }
}
