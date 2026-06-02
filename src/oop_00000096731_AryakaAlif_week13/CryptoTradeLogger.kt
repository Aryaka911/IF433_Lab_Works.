package oop_00000096731_AryakaAlif_week13

import java.io.File

data class TradeRecord(
    val id: Int,
    @@ -27,4 +28,12 @@ fun fromCsvTrade(line: String): TradeRecord? {
    println("(Log) Data korup diabaikan: $line")
    null
}
}

fun saveTrades(trades: List<TradeRecord>, path: String) {
    File(path).printWriter().use { writer ->
        trades.forEach {
            writer.println(it.toCsv())
        }
    }
}