package com.amazon.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.amazon.page.HomePage.*;
import static com.amazon.page.ResultadosBusqueda.ITEM_COMPRA_ENVIO_COLOMBIA;

public class ComprarTarjetaElectronica {
    public static Performable TarjetaElectronica() {
        return Task.where("{0} buscando tarjeta de regalo",
                Click.on(BOTON_HAMBURGUESA),

                Click.on(BOTON_TARJETA_REGALO),

                Click.on(BOTON_TARJETA_REGALO_ELECTRONICA),

                Click.on(ITEM_COMPRA_ENVIO_COLOMBIA)
        );
    }


}
