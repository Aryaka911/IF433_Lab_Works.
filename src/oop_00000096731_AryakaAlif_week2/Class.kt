package oop_00000096731_AryakaAlif_week2

class MyCar {
    var warna:String = "Merah"

    fun kecepatan() {
        println("Mobil saya warna $warna")
    }
}

fun main() {
    val myCar = MyCar()
    myCar.kecepatan()
}