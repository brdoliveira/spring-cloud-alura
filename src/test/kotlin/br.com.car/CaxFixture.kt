package br.com.car

import br.com.car.domain.model.Car

object CaxFixture{
    fun getCar() = Car(1,"Gol","VW", year = 2015)
}