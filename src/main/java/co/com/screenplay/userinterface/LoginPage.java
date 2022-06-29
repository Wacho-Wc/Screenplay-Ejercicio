package co.com.screenplay.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {
    public static final Target TEXT_EMMAIL = Target.the("Llenar campos de email")
            .located(By.name("email"));

    public static final Target TEXT_PASSWORD = Target.the("Lenar campo password")
            .located(By.name("password"));

    public static final Target BTN_LOGIN = Target.the("Dar clic en el boton Log In")
            .located(By.xpath("//*[@id=\"fadein\"]/div[1]/div/div[2]/div[2]/div/form/div[3]/button"));

}
