package com.amazon.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.time.Duration;

import static com.amazon.page.DetalleItem.BUT_AGREGAR_CARRITO;
import static com.amazon.page.ResultadosBusqueda.ITEM_COMPRA_ENVIO_COLOMBIA;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class SeleccionarItem {
    public static Performable conEnvioColombia() {
        return Task.where("{0} buscando items con envío a Colombia",
                Click.on(ITEM_COMPRA_ENVIO_COLOMBIA),
                WaitUntil.the(BUT_AGREGAR_CARRITO, isEnabled()).forNoMoreThan(Duration.ofSeconds(6)),
                Click.on(BUT_AGREGAR_CARRITO)
        );
    }
}
