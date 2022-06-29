package co.com.screenplay.tasks;

import co.com.screenplay.userinterface.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class LoginT implements Task {

    public static LoginT onThePage() {

        return Tasks.instrumented(LoginT.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("divirinho09@gmail.com").into(LoginPage.TEXT_EMMAIL),
                Enter.theValue("Hola1234@@").into(LoginPage.TEXT_PASSWORD),
                Click.on(LoginPage.BTN_LOGIN)
        );
    }
}