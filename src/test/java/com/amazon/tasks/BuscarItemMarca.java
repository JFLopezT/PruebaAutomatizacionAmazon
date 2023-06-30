package com.amazon.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static com.amazon.page.CabeceraPage.INPUT_BARRA_BUSQUEDA;


public class BuscarItemMarca {

    public static Performable conMarca(String item) {
       return Task.where("{0} buscando el item ´" +item+"´ con una marca",
                Enter.theValue(item).into(INPUT_BARRA_BUSQUEDA).thenHit(Keys.ENTER),
                SeleccionarItemMarca.conMarca()
       );
    }
}
