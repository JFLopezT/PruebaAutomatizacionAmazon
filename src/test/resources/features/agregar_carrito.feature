# language: es
  Característica: agregar al carrito
    Yo como comprador
    Quiero agregar elementos a un carrito de compras
    Para posteriormente comprar


  Escenario: agregar 3 items al carrito de compras y eliminar 1
    Cuando Jose agrega al carrito los items
      | "control de pc"  |
      | "mouse gaming"   |
      | "teclado gaming" |
    Entonces debe eliminarse uno y visualizar unicamente 2 items en el carrito de compras


  Escenario: agregar audifonos sony al carrito de compras
    Cuando agrego unos "audifonos" al carrito
    Entonces debe verse 1 item en el carrito de compras


    Escenario: agregar 2 items recomendados al carrito de compras
      Cuando Jose agrega al carrito los items recomendados
       | "fuente de poder 650w"  |
       | "Monitor 27 inch"   |
      Entonces debe verse 2 items en el carrito de compras





















