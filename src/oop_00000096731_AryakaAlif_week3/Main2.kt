package oop_00000096731_AryakaAlif_week3

fun main() {
    val weapon = Weapon("Dragon Slayer")
    val player = Player("Kyoodain")

    player.addXp(50)
    player.addXp(60)

    println("Level sekarang: ${player.level}")

    weapon.damage = -50
    weapon.damage = 9999

    println("Damage akhir: ${weapon.damage}")
    println("Tier: ${weapon.tier}")

}