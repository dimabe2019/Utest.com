package co.com.utest.proyectobase.tasks;

import co.com.utest.proyectobase.userinterface.UtestRegistro2Page;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

public class ProcesoRegistro2 implements Task {

    private String strMarcaCel;
    private String strVersionCel;
    private String strPassword;
    private String strConfirmPassword;

    public ProcesoRegistro2(String strMarcaCel, String strVersionCel, String strPassword, String strConfirmPassword ) {

        this.strMarcaCel = strMarcaCel;
        this.strVersionCel = strVersionCel;
        this.strPassword = strPassword;
        this.strConfirmPassword = strConfirmPassword;
    }

    public static ProcesoRegistro2 the(String strMarcaCel, String strVersionCel, String strPassword, String strConfirmPassword) {
        return Tasks.instrumented(ProcesoRegistro2.class,strMarcaCel,strVersionCel,strPassword,strConfirmPassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
      actor.attemptsTo(
              Click.on(UtestRegistro2Page.MARCACEL),
              Enter.theValue(strMarcaCel).into(UtestRegistro2Page.INPUT_MARCACEL).thenHit(Keys.ENTER),
              Click.on(UtestRegistro2Page.VERSIONCEL),
              Enter.theValue(strVersionCel).into(UtestRegistro2Page.INPUT_VERSIONCEL).thenHit(Keys.ENTER),
              Click.on(UtestRegistro2Page.SOCEL),
              Click.on(UtestRegistro2Page.INPUT_SOCEL),
              Click.on(UtestRegistro2Page.BOTON3),
              Enter.theValue(strPassword).into(UtestRegistro2Page.INPUT_PASSWORD),
              Enter.theValue(strConfirmPassword).into(UtestRegistro2Page.INPUT_CONFIRMPASSWORD),
              Click.on(UtestRegistro2Page.CHECK_TERMINOS),
              Click.on(UtestRegistro2Page.CHECK_POLITICAS)
              //Click.on(UtestRegistro2Page.BOTON4)
      );
    }
}
