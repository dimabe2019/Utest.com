package co.com.utest.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestRegistroPage extends PageObject {
    public static final Target INPUT_USER = Target.the("Campo para ingresar el nombre").locatedBy("//input[@id='firstName']");
    public static final Target INPUT_APELLIDO = Target.the("Campo para ingresar el apellido").locatedBy("//input[@id='lastName']");
    public static final Target INPUT_EMAIL = Target.the("Campo para ingresar el email").locatedBy("//input[@id='email']");
    public static final Target INPUT_FECHAMES = Target.the("Seleccion del mes de nacimiento").locatedBy("//select[@id='birthMonth']");
    public static final Target INPUT_FECHADIA = Target.the("Seleccion del dia de nacimiento").locatedBy("//select[@name='birthDay']");
    public static final Target INPUT_FECHAANIO = Target.the("Seleccion del anio de nacimiento").locatedBy("//select[@id='birthYear']");
    public static final Target INPUT_CAMPOIDIOMA = Target.the("Campo para ingresar el idioma").locatedBy("//input[@type='search']");
    public static final Target SELEC_IDIOMA = Target.the("Seleccion del idioma").locatedBy("//div[contains(text(),'Spanish')]");
    public static final Target BOTON1 = Target.the("Primer boton para avanzar al siguiente paso").locatedBy("//a[@aria-label='Next step - define your location']");
    public static final Target INPUT_CIUDAD = Target.the("Campo para el ingreso de la ciudad").located(By.id("city"));
    public static final Target BOTON2 = Target.the("Segundo boton para avanzar al siguiente paso").locatedBy("//a[@aria-label='Next step - select your devices']");
}
