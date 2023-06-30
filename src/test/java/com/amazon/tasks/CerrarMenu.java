package com.amazon.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;

import static com.amazon.page.DetalleItem.BOTON_CERRAR_MENU_DESPLEGABLE_CARRITO;


public class CerrarMenu {

    public static Performable desplegableDelCarrito(Actor actor) {

        try {
            Thread.sleep(3500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (BOTON_CERRAR_MENU_DESPLEGABLE_CARRITO.isVisibleFor(actor)){
            actor.attemptsTo(Click.on(BOTON_CERRAR_MENU_DESPLEGABLE_CARRITO));
        }

        return null;
    }
}
