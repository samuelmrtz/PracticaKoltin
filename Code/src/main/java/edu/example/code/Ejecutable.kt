package edu.example.code

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

    open var water : Double = 0.0
        get() = volume * 0.9
    fun printSize() {
        println(
            "Width: $width cm " +
                    "Length: $length cm " +
                    "Height: $height cm "
        )
        println("Volume: $volume liters Water: $water liters (${water / volume * 100.0}% full)")
    }
}

fun buildAquarium() {
    val aquarium6 = Aquarium(length = 25, width = 25, height = 40)
    aquarium6.printSize()
}

fun main() {
    buildAquarium()
}