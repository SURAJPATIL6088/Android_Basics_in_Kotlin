package com.surajpatil.dicerollerapp

class Dice(val Sides:Int){

    fun roll(): Int
    {
        return (1..Sides).random()
    }
}