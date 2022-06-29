package co.com.screenplay.tasks;

import co.com.screenplay.userinterface.SearchHotelsPage;
import cucumber.api.java.eo.Se;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.lang.annotation.Target;


public class SearchHotels implements Task {

    public static SearchHotels ThePageOn() {

        return Tasks.instrumented(SearchHotels.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(SearchHotelsPage.BTN_HOTELS),
                Click.on(SearchHotelsPage.CLIC_SEARCH),
                Enter.theValue("Singapore").into(SearchHotelsPage.SEND_COUNTRY),
                WaitUntil.the(SearchHotelsPage.SELECCT_RESULT_COUNTRY.of("Singapore,Singapore"), WebElementStateMatchers.isVisible()).forNoMoreThan(20).seconds(),
                Click.on(SearchHotelsPage.SELECCT_RESULT_COUNTRY.of("Singapore,Singapore")),
                Click.on(SearchHotelsPage.SELECCT_PASSAGERS),
                Click.on(SearchHotelsPage.ROOMS_0),
                Click.on(SearchHotelsPage.BTN_SEARCH)
        );
    }
}
