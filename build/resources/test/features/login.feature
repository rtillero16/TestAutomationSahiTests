#language:es
Característica: inicio de sesión exitoso

  Escenario: Completar exitosamente un login
    Dado que el usuario esta en la pagina de sahitest
    Cuando ingresa las credencias
      | username | password |
      | test     | secret   |
    Entonces el visualizara el mensaje All available books