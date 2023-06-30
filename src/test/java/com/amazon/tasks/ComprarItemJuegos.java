package com.amazon.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.amazon.page.HomePage.IMG_JUEGOS;
import static com.amazon.page.ResultadosBusqueda.ITEM_COMPRA_ENVIO_COLOMBIA;

public class ComprarItemJuegos {
    public static Performable ItemJuegos() {
        return Task.where("{0} buscando un item del catalogo juegos",
                Click.on(IMG_JUEGOS),

                Click.on(ITEM_COMPRA_ENVIO_COLOMBIA)

        );
    }


}
