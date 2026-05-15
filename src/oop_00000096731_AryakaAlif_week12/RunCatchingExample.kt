package oop_00000096731_AryakaAlif_week12

fun main () {
    println("=== TEST RUNCATCHING ===")
    val result: Result<Int> = runCatching {
        "42X".toInt()
    }
}