package org.example
import kotlin.math.sqrt
fun main() {

    println("Введите kоэффициенты a, b и c квадратного уравнения ax^2 + bx + c = 0")

    val a = readLine()!!.toDouble()
    val b = readLine()!!.toDouble()
    val c = readLine()!!.toDouble()

    val discriminant = b*b - 4*a*c

    if (discriminant > 0) {
        val root1 = (-b + sqrt(discriminant)) / (2*a)
        val root2 = (-b - sqrt(discriminant)) / (2*a)
        println("У уравнения два корня: x1 = $root1 и x2 = $root2")
    } else if (discriminant == 0.0) {
        val root = -b / (2*a)
        println("У уравнения один корень: x = $root")
    } else {
        println("У уравнения нет действительных корней")
    }

}