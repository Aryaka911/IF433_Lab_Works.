package oop_000000996731_AryakaAlif_week4

fun main() {
    val manager = Manager("Andi", 100000000)
    val developer = Developer("Budi", 8000000, "Kotlin")

    manager.work()
    println("Bonus Manager: Rp ${manager.calculateBonus()}")

    developer.work()
    println("Bonus Developer: Rp ${developer.calculateBonus()}")
}