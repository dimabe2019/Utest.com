package co.com.utest.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestRegistro2Page extends PageObject {
    public static final Target MARCACEL = Target.the("Campo para ingresar la marca del movil").locatedBy("//span[contains(text(),'Select Brand')]");
    public static final Target INPUT_MARCACEL = Target.the("Seleccionar la marca del movil").locatedBy("//input[@placeholder='Select Brand']");
    public static final Target VERSIONCEL = Target.the("Campo para ingresar la version movil").locatedBy("//span[@aria-label='Select a Model']");
    public static final Target INPUT_VERSIONCEL = Target.the("Seleccion version movil").locatedBy("//input[@placeholder='Select a Model']");
    public static final Target SOCEL = Target.the("Campo para el ingreso del sistema operativo movil").locatedBy("//span[@class='ui-select-placeholder text-muted']");
    public static final Target INPUT_SOCEL = Target.the("Seleccion sistema operativo movil").locatedBy("//div[contains(text(),'Android 10')]");
    public static final Target BOTON3 = Target.the("Tercer boton para avanzar al siguiente paso").locatedBy("//a[@aria-label='Next - final step']");
    public static final Target INPUT_PASSWORD = Target.the("Campo para ingresar la contrasena").located(By.id("password"));
    public static final Target INPUT_CONFIRMPASSWORD = Target.the("Campo para ingresar la confirmacion de la contrasena").located(By.id("confirmPassword"));
    public static final Target CHECK_TERMINOS = Target.the("Checkbox para terminos").located(By.id("termOfUse"));
    public static final Target CHECK_POLITICAS = Target.the("Checkbox para politicas").located(By.id("privacySetting"));
    public static final Target BOTON4 = Target.the("Cuarto boton para finalizar el registro").located(By.id("laddaBtn"));
    //public static final Target TXT_MENSAJE = Target.the("Mesnaje para confimar que el registro ha sido exitoso").locatedBy("//div[@class='image-box-header']//h1");
    public static final Target TXT_MENSAJE = Target.the("Mesnaje para confimar que el registro esta apunto de finalizar").locatedBy("//span[contains(text(),'The last step')]");
    ////font[contains(text(),'¡Bienvenido a la comunidad de probadores de software autónomos más grande del mundo!')]
}
