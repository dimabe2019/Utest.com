package co.com.utest.proyectobase.questions;

import co.com.utest.proyectobase.interations.Esperar;
import co.com.utest.proyectobase.userinterface.UtestRegistro2Page;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidaRegistro implements Question<Boolean> {

    private String strMensaje;

    public ValidaRegistro(String strMensaje) {
        this.strMensaje = strMensaje;
    }

    public static ValidaRegistro toThe(String strMensaje) {
        return new ValidaRegistro(strMensaje);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        //Esperar.estosSegundos(10);
        String mensajeExitoso = Text.of(UtestRegistro2Page.TXT_MENSAJE).viewedBy(actor).asString();
        if (strMensaje.equals(mensajeExitoso)) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}
