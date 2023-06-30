# language: es

Característica: Verificar opciones
  Yo como comprador
  Quiero verificar distintas opciones en los escenarios
  Para revisar posibles cambios

  @manual
  @manual-result:passed
  Escenario: Verificar limite de especificaciones
    Dado que ya he realizado una busqueda de un item con especificaciones activadas
    Cuando busque un item con mas especificaciones activas
    Entonces puedo ver como ciertas especificaciones del item se bloquean o desaparecen

  @manual
  @manual-result:passed
  Escenario: Verificar nombre de items eliminados del carrito
    Dado que ya he eliminado un item del carrito
    Cuando recien elimine el item
    Entonces debo poder visualizar el nombre del item eliminado

  @manual
  @manual-result:passed
  Escenario: Verificar items sin precio y sin envio a colombia
    Dado que ya he realizado una busqueda de un item con envio a colombia
    Cuando se muestren los resultados de busqueda del item
    Entonces debo poder ver que items no tenian disponibilidad para añadir al carrito

  @manual
  @manual-result:passed
  Escenario: Verificar reviews de un item
    Dado que ya he buscado y seleccionado un item
    Cuando quiera revisar las reviews del item
    Entonces debo poder visualizar cada una de estas reviews