package com.example.bmi

fun main() {
    val p = Person()
    p.weight = 65f
    p.height = 1.7f


    println("Your BMI is ${p.getBmi()}")
}

class Person{
    var weight : Float = 0f
    var height : Float = 0f

    fun getBmi():Float{
        return  weight /(height*height)
    }
}

class HelloWorld {
}