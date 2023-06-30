package com.amazon.stepdefinitions;

import com.amazon.tasks.BuscarItem;
import com.amazon.tasks.BuscarItemMarca;
import com.amazon.tasks.BuscarItemRecomendado;
import com.amazon.tasks.CerrarMenu;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;

import static com.amazon.page.CabeceraPage.BUT_CARRITO;
import static com.amazon.page.CarritoPage.BOTON_BORRAR;
import static com.amazon.page.CarritoPage.LIST_ITEMS;
import static com.amazon.page.DetalleItem.BOTON_CERRAR_MENU_DESPLEGABLE_CARRITO;

public class AgregarCarritoStepDefinitions {

    @Cuando("agrego un {string} al carrito")
    public void agregoUnItemAlCarrito(String item) {
        OnStage.theActorCalled("comprador").attemptsTo(
                Open.url("https://www.amazon.com/-/es/ref=nav_logo"),
                BuscarItem.conEnvioColombia(item)
        );
    }

    @Entonces("debe verse {int} item(s) en el carrito de compras")
    public void verNumeroItemsEnCarrito(Integer numeroitems) {
        try {
            Thread.sleep(3500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Actor actor = OnStage.theActorInTheSpotlight();
        if (BOTON_CERRAR_MENU_DESPLEGABLE_CARRITO.isVisibleFor(actor)){
            actor.attemptsTo(Click.on(BOTON_CERRAR_MENU_DESPLEGABLE_CARRITO));
        }

        OnStage.theActorInTheSpotlight().attemptsTo(

                Click.on(BUT_CARRITO),
                Ensure.that(LIST_ITEMS).textValues().hasSize(numeroitems)

        );
    }

    @Cuando("{actor} agrega al carrito los items")
    public void agregarVariosItemsCarrito(Actor actor, io.cucumber.datatable.DataTable dataTable) {
        actor.attemptsTo(Open.url("https://www.amazon.com/-/es/ref=nav_logo"));
        dataTable.asList().stream().forEach(item -> {

            actor.attemptsTo(BuscarItem.conEnvioColombia(item));
            CerrarMenu.desplegableDelCarrito(actor);

        });
    }

    @Entonces("debe eliminarse uno y visualizar unicamente {int} items en el carrito de compras")
    public void EliminarYVerItemsEnElCarritoDeCompras(Integer numeroitems) {

        OnStage.theActorInTheSpotlight().attemptsTo(
                Click.on(BUT_CARRITO),
                Click.on(BOTON_BORRAR),
                Click.on(BUT_CARRITO),
                Ensure.that(LIST_ITEMS).textValues().hasSize(numeroitems)
        );

    }


    @Cuando("agrego unos {string} al carrito")
    public void agregoUnosAudifonosAlCarrito(String item) {
        OnStage.theActorCalled("comprador").attemptsTo(
            Open.url("https://www.amazon.com/-/es/ref=nav_logo"),
            BuscarItemMarca.conMarca(item)

            );
//        OnStage.theActorInTheSpotlight().attemptsTo(
//                CerrarMenu.desplegableDelCarrito(OnStage.theActorInTheSpotlight())
//        );
    }

    @Cuando("{actor} agrega al carrito los items recomendados")
    public void agregarDosItemsCarritoRecomendado(Actor actor, io.cucumber.datatable.DataTable dataTable) {
        actor.attemptsTo(Open.url("https://www.amazon.com/-/es/ref=nav_logo"));
        dataTable.asList().forEach(item -> {
            actor.attemptsTo(BuscarItemRecomendado.conRecomendacion(item));
            CerrarMenu.desplegableDelCarrito(actor);
        });
    }



}
