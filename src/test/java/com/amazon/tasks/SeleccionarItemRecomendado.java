package com.amazon.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.amazon.page.DetalleItem.*;
import static com.amazon.page.ResultadosBusqueda.*;

public class SeleccionarItemRecomendado {
    public static Performable conRecomendacion() {
        return Task.where("{0} buscando items con una recomendacion",

                Click.on(BOTON_ITEM_RECOMENDADO),
                Click.on(BOTON_ITEM_LOS_MAS_VENDIDOS),
                Click.on(ITEM_COMPRA_ENVIO_COLOMBIA),
                Click.on(BUT_AGREGAR_CARRITO)
        );
    }
}
