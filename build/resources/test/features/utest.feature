@stories
Feature: pagina de registro de Utest
  yo como usuario nuevo de Utest
  quiero registrarme en la pagina
  para poder tener acceso a su contenido

  @Scenario1
  Scenario: Registro de usuario nuevo
    Given que ana quiere registrarse en la pagina de Utest
    When complete todo el formulario de registro de la pagina de Utest
    | strUser       | strApellido  | strEmail                  | strMes   | strDia | strAnio | strMarcaCel | strVersionCel | strPassword    | strConfirmPassword |
    | Guillermo     | Cuadrado     | cuadrado_19@hotmail.com   | February | 23     | 1989    | Motorola    | Moto G9 Plus  | Cuadrado2021   | Cuadrado2021     |
    Then podra ver el contenido de la pagina
    | strMensaje     |
    | The last step  |