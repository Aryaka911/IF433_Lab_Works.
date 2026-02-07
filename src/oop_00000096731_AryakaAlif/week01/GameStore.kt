package oop_00000096731_AryakaAlif.week01

fun main() {
    val gameTitle = "Mobile Legends"
    val price = 750000
    println(calculateDiscount(price))


}
fun calculateDiscount(price: Int): Int =
    if (price > 500000) price - (price * 20/100)
    else price - (price * 10/100)