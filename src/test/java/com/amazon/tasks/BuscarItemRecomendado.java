package com.amazon.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static com.amazon.page.CabeceraPage.INPUT_BARRA_BUSQUEDA;


public class BuscarItemRecomendado {
   public static Performable conRecomendacion(String item) {
       return Task.where("{0} buscando el item ´" +item+"´ con recomendacion",
                Enter.theValue(item).into(INPUT_BARRA_BUSQUEDA).thenHit(Keys.ENTER),
                SeleccionarItemRecomendado.conRecomendacion()
       );
    }
}
