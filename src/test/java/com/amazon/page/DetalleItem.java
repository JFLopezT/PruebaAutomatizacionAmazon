package com.amazon.page;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DetalleItem {
    public static Target BUT_AGREGAR_CARRITO = Target.the("botón agregar carrito en detalle del item").locatedByFirstMatching("//input[@id='add-to-cart-button']/..");

    public static Target BOTON_COMPRAR = Target.the("botón comprar en el detalle del item").located(By.id("gcui-asv-reload-buynow-button"));

    public static Target BOTON_ITEM_RECOMENDADO = Target.the("boton para menu items buscados por recomendacion").locatedByFirstMatching("//select[@id='s-result-sort-select']/..");

    public static Target BOTON_ITEM_LOS_MAS_VENDIDOS = Target.the("boton en menu para items mas vendidos").located(By.id("s-result-sort-select_5"));
}
