package com.amazon.stepdefinitions;

import com.amazon.tasks.ComprarItemJuegos;
import com.amazon.tasks.ComprarTarjetaElectronica;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;

import static com.amazon.page.DetalleItem.BOTON_COMPRAR;
import static com.amazon.page.DetalleItem.BUT_AGREGAR_CARRITO;

public class BuscarItemsStepDefinitions {



    @Cuando("Busco una Tarjeta de regalo")
    public void buscoUnaTarjetaRegalo() {
        OnStage.theActorCalled("comprador").attemptsTo(
                Open.url("https://www.amazon.com/-/es/ref=nav_logo"),
                ComprarTarjetaElectronica.TarjetaElectronica()

        );

    }

    @Entonces("debe verse la opcion de comprar")
    public void debeVerseLaOpcionDeComprar() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Ensure.that(BOTON_COMPRAR).isEnabled()
        );
    }

    @Cuando("Busco un item del catalogo accesorios para juegos")
    public void buscoUnItemDelCatalogoJuegos() {
        OnStage.theActorCalled("comprador").attemptsTo(
                Open.url("https://www.amazon.com/-/es/ref=nav_logo"),
                ComprarItemJuegos.ItemJuegos()

        );

    }

    @Entonces("debe verse la opcion de carrito")
    public void debeVerseLaOpcionDeCarrito() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Ensure.that(BUT_AGREGAR_CARRITO).isEnabled()
        );
    }
}
