package co.com.screenplay.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.apache.tools.ant.taskdefs.Tar;
import org.openqa.selenium.By;

public class SearchHotelsPage extends PageObject {

    public static final Target BTN_HOTELS = Target.the("Dar clic en hotels")
            .located(By.linkText("Hotels"));
    public static final Target CLIC_SEARCH = Target.the("Dar clic para buscar el pais singapore")
            .located(By.id("select2-hotels_city-container"));
    public static final Target SEND_COUNTRY = Target.the("Enviar nombre del pais")
            .located(By.xpath("//*[@id=\"fadein\"]/span/span/span[1]/input"));
    public static final  Target SELECCT_RESULT_COUNTRY = Target.the("Seleccioanr pais resultante")
            .locatedBy("//li[contains(text(),'{0}')]");
    public static final Target SELECCT_PASSAGERS = Target.the("Seleccioanr nuemro de pasajeros")
            .located(By.xpath("//*[@id=\"hotels-search\"]/div/div/div[3]/div/div/div/a"));
    public static final Target ROOMS_0 = Target.the("0 habitaciones")
            .located(By.xpath("//*[@id=\"hotels-search\"]/div/div/div[3]/div/div/div/div/div[1]/div/div/div[2]/i"));
    public static final Target BTN_SEARCH = Target.the("Boton para seguir a la siguiente pagina")
            .located(By.id("submit"));



}
