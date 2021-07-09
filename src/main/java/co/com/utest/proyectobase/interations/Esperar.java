package co.com.utest.proyectobase.interations;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;


public class Esperar implements Interaction {

    private int seconds;

    public Esperar(int seconds) {
        this.seconds = seconds;
    }

    public static Esperar estosSegundos(int seconds) {
        return Instrumented.instanceOf(Esperar.class).withProperties(seconds);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            Thread.sleep(seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
