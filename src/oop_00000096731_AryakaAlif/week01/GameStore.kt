package oop_00000096731_AryakaAlif.week01

fun main() {
    val gameTitle = "Mobile Legends"
    val price = 750000

    val finalPrice = calculateDiscount(price)

    printReceipt(
        title = gameTitle,
        finalPrice = finalPrice
    )


}
fun calculateDiscount(price: Int): Int =
    if (price > 500000) price - (price * 20/100)
    else price - (price * 10/100)

fun printReceipt(title: String, finalPrice: Int) {
    println("judul game : $title")
    println("harga akhir : $finalPrice")

}