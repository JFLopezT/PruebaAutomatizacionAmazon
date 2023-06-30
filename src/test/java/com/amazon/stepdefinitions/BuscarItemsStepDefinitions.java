package com.amazon.stepdefinitions;

import com.amazon.tasks.ComprarTarjetaElectronica;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;

import static com.amazon.page.DetalleItem.BOTON_COMPRAR;

public class BuscarItemsStepDefinitions {



    @Cuando("Busco una Tarjeta de regalo")
    public void buscoUnaTarjetaRegalo() {
        OnStage.theActorCalled("comprador").attemptsTo(
                Open.url("https://www.amazon.com"),
                ComprarTarjetaElectronica.TarjetaElectronica()

        );

    }

    @Entonces("debe verse la opcion de comprar")
    public void debeVerseLaOpcionDeComprar() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Ensure.that(BOTON_COMPRAR).isEnabled()
        );
    }

}
