package com.amazon.page;

import net.serenitybdd.screenplay.targets.Target;

public class ResultadosBusqueda {
    public static Target ITEM_COMPRA_ENVIO_COLOMBIA = Target.the("item buscado con envio a Colombia").locatedByFirstMatching("//span[@class='a-price-whole']");

    public static Target ITEM_COMPRA_MARCA = Target.the("item buscado con marca").locatedByFirstMatching("//li[@aria-label='Sony']/span/a");


}
