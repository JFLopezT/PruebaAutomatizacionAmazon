package com.amazon.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.time.Duration;

import static com.amazon.page.DetalleItem.BOTON_COMPRAR;
import static com.amazon.page.DetalleItem.BUT_AGREGAR_CARRITO;
import static com.amazon.page.HomePage.*;
import static com.amazon.page.ResultadosBusqueda.ITEM_COMPRA_ENVIO_COLOMBIA;
import static com.amazon.page.ResultadosBusqueda.ITEM_COMPRA_MARCA;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ComprarTarjetaElectronica {
    public static Performable TarjetaElectronica() {
        return Task.where("{0} buscando tarjeta de regalo",
                Click.on(BOTON_HAMBURGUESA),
//                WaitUntil.the(BOTON_TARJETA_REGALO, isVisible()).forNoMoreThan(Duration.ofSeconds(1)),
                Click.on(BOTON_TARJETA_REGALO),
//                WaitUntil.the(BOTON_TARJETA_REGALO_ELECTRONICA, isVisible()).forNoMoreThan(Duration.ofSeconds(1)),
                Click.on(BOTON_TARJETA_REGALO_ELECTRONICA),
//                WaitUntil.the(ITEM_COMPRA_ENVIO_COLOMBIA, isVisible()).forNoMoreThan(Duration.ofSeconds(1)),
                Click.on(ITEM_COMPRA_ENVIO_COLOMBIA)
        );
    }


}
