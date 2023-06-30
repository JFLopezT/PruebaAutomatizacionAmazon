package com.amazon.page;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DetalleItem {
    public static Target BUT_AGREGAR_CARRITO = Target.the("botón agregar carrito en detalle del item").located(By.id("add-to-cart-button"));

    public static Target BOTON_COMPRAR = Target.the("botón comprar en el detalle del item").located(By.id("gcui-asv-reload-buynow-button"));
}
