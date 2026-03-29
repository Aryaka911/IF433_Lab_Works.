package oop_000000996731_AryakaAlif_week7

fun processEvent(event: BattleState) {
    val message = when (event) {
        is BattleState.MonsterEncounter ->
            "Monster muncul: ${event.monsterName}! Bersiap untuk bertarung!"

        is BattleState.LootDropped -> {
            val (name, damage, rarity) = event.item
            "Loot didapat: $name (Damage: $damage, Rarity: $rarity)"
        }

        is BattleState.GameOver ->
            "Game Over! ${event.reason}"

        BattleState.SafeZone ->
            "Berada di Safe Zone."
    }

    println(message)
}