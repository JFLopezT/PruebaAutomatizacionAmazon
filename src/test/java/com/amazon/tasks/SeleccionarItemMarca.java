package com.amazon.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.amazon.page.DetalleItem.BUT_AGREGAR_CARRITO;
import static com.amazon.page.ResultadosBusqueda.ITEM_COMPRA_ENVIO_COLOMBIA;
import static com.amazon.page.ResultadosBusqueda.ITEM_COMPRA_MARCA;

public class SeleccionarItemMarca {
    public static Performable conMarca() {
        return Task.where("{0} buscando items con una marca",
                Click.on(ITEM_COMPRA_MARCA),
                Click.on(ITEM_COMPRA_ENVIO_COLOMBIA),
                Click.on(BUT_AGREGAR_CARRITO)
        );
    }
}
