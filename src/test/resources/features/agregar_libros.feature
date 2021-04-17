#language:es
Característica: Agregar libros a la canasta

  Antecedentes: Inicio de sesion

    Dado que el usuario esta en la pagina de sahitest
    Cuando ingresa las credencias
      | username | password |
      | test     | secret   |
    Entonces el visualizara el mensaje All available books

  Escenario: Agregar exitosamente los libros a la canasta de compra
    Cuando agrega libros a la canasta de compra
      | coreJava | rubyForRail | pythonCookbook |
      | 3        | 5           | 2              |
    Entonces el visualizara "2600" en el Valor Total