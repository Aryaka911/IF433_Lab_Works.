package oop_00000096731_AryakaAlif.week01

fun main(args: Array<String>) {

    val radius = 7.0
    val pi = 3.14

    val area = pi * radius * radius
    println("Radius: $radius, area: $area")

    checkSize(area)
}
fun checkSize(area: Double) {
    if (area > 100) {
        println("This is a Big Circle")
    } else {
        println("This is a Small Circle")
    }
}
