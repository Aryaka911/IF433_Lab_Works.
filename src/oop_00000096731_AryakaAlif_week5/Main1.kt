package oop_00000096731_AryakaAlif_week5

fun main() {
    val mathHelper = MathHelper()
    val luasPersegi = mathHelper.hitungLuas(4)
    val luasPersegiPanjang = mathHelper.hitungLuas(6, 3)
    val luasLingkaran = mathHelper.hitungLuas(7.0)

    println("Luas Persegi: $luasPersegi")
    println("Luas Persegi Panjang: $luasPersegiPanjang")
    println("Luas Lingkaran: $luasLingkaran")
}