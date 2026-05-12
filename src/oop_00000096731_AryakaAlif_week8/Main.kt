package oop_00000096731_AryakaAlif_week8

fun main() {
    println("=== TEST SAFE CASLLS & ELVIS ===")
    val emptyOrder = Order(null, null)

    val destination = emptyOrder.deliveryDetails?.address?.city?.name ?: "Kota Tidak Diketahui"
    println("Tujuan pengiriman: $destination")
}git