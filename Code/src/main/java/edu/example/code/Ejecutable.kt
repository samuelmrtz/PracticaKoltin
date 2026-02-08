package edu.example.code
import kotlin.math.PI

open class Aquarium(var length: Int = 100, var width: Int = 20, var height: Int = 40) {
    init {
        println("aquarium initializing")
    }

    open var volume: Int
        get() = width * height * length / 1000
        set(value) {
            height = (value * 1000) / (width * length)
        }

    open val shape = "rectangle"

    open val water: Double
        get() = volume * 0.9

    fun printSize() {
        println("-------------------------------")
        println("Shape: $shape")
        println("Width: $width cm | Length: $length cm | Height: $height cm")
        println("Volume: $volume liters | Water: $water liters (${(water / volume) * 100.0}% full)")
    }
}

class TowerTank(height: Int, var diameter: Int) : Aquarium(height = height, width = diameter, length = diameter) {

    override var volume: Int
        get() = ((width / 2.0) * (length / 2.0) * height / 1000.0 * PI).toInt()
        set(value) {
            height = ((value * 1000.0 / PI) / ((width / 2.0) * (length / 2.0))).toInt()
        }

    override val water: Double
        get() = volume * 0.8

    override val shape = "cylinder"
}

fun buildAquarium() {
    val myAquarium = Aquarium(width = 25, length = 25, height = 40)
    myAquarium.printSize()

    val myTower = TowerTank(diameter = 25, height = 40)
    myTower.printSize()
}

fun main() {
    buildAquarium()
}