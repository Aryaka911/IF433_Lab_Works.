package oop_000000996731_AryakaAlif_week7

object DatabaseManager {
    var connectionStatus: String = "Disconnected"

    fun connect() {
        connectionStatus = "Connected to Server"
        println("Databse is ready.")
    }
}