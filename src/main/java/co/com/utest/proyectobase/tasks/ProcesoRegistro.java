package co.com.utest.proyectobase.tasks;

import co.com.utest.proyectobase.interations.Esperar;
import co.com.utest.proyectobase.userinterface.UtestRegistroPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.apache.bcel.generic.Select;

public class ProcesoRegistro implements Task {
    private String strUser;
    private String strApellido;
    private String strEmail;
    private String strMes;
    private String strDia;
    private String strAnio;

    public ProcesoRegistro(String strUser, String strApellido, String strEmail, String strMes, String strDia, String strAnio) {
        this.strUser = strUser;
        this.strApellido = strApellido;
        this.strEmail = strEmail;
        this.strMes = strMes;
        this.strDia = strDia;
        this.strAnio = strAnio;
    }

    public static ProcesoRegistro the(String strUser, String strApellido, String strEmail, String strMes, String strDia, String strAnio) {
        return Tasks.instrumented(ProcesoRegistro.class,strUser,strApellido,strEmail,strMes,strDia,strAnio);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(strUser).into(UtestRegistroPage.INPUT_USER),
                Enter.theValue(strApellido).into(UtestRegistroPage.INPUT_APELLIDO),
                Enter.theValue(strEmail).into(UtestRegistroPage.INPUT_EMAIL),
                Click.on(UtestRegistroPage.INPUT_FECHAMES),
                SelectFromOptions.byVisibleText(strMes).from(UtestRegistroPage.INPUT_FECHAMES),
                SelectFromOptions.byVisibleText(strDia).from(UtestRegistroPage.INPUT_FECHADIA),
                SelectFromOptions.byVisibleText(strAnio).from(UtestRegistroPage.INPUT_FECHAANIO),
                Scroll.to(UtestRegistroPage.INPUT_CAMPOIDIOMA),
                Click.on(UtestRegistroPage.INPUT_CAMPOIDIOMA),
                Click.on(UtestRegistroPage.SELEC_IDIOMA),
                Click.on(UtestRegistroPage.BOTON1),
                Esperar.estosSegundos(15),
                Click.on(UtestRegistroPage.INPUT_CIUDAD),
                Esperar.estosSegundos(15),
                Click.on(UtestRegistroPage.BOTON2)
        );
    }
}
