package com.amazon.page;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage {
    public static Target BOTON_HAMBURGUESA = Target.the("boton hamburguesa").locatedBy("//span[@class='hm-icon-label']/..");
    public static Target BOTON_TARJETA_REGALO = Target.the("boton de tarjetas de regalo").locatedBy("//a[@data-menu-id='27']/..");
    public static Target BOTON_TARJETA_REGALO_ELECTRONICA = Target.the("boton de tarjetas de regalo electronica").locatedBy("//ul[@data-menu-id='27']/li[4]");

    public static Target IMG_JUEGOS = Target.the("Imagen seleccionable de accesorios para juegos ").locatedBy("//img[@alt='Auriculares']/..");


}