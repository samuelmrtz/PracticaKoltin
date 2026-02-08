package edu.example.practicakoltin

fun main() {
    val usuario = "Pana"
    val a = 10
    val b = 20
    val suma = a + b

    println("======================================")
    println("¡Hola $usuario! El proyecto funciona.")
    println("La suma de $a + $b es: $suma")
    println("======================================")

    if (suma > 25) {
        println("Resultado: Operación exitosa y mayor a 25.")
    } else {
        println("Resultado: Operación exitosa.")
    }
}