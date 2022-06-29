#AUTHOR DIVIER CAMARGO
  #lenguage: es

  @PhpTravels1
  Feature: PhpTravels
    Yo como usuario
    Quiero hacer una reserva en el hotel phptravles
  Scenario: reserva de hotel
    Given dado que usuario ingrese a phptravels
    When  ingresa al modulo de hotels
    Then podra hacer una reserva en el hotel