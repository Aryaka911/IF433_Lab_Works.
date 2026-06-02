package oop_00000096731_AryakaAlif_week13

import java.io.File
import java.io.FileNotFoundException

data class TradeRecord(
    val id: Int,
    @@ -36,4 +37,14 @@ fun saveTrades(trades: List<TradeRecord>, path: String) {
    writer.println(it.toCsv())
}
}
}

fun loadTrades(path: String): List<TradeRecord> {
    return try {
        File(path)
            .readLines()
            .mapNotNull { fromCsvTrade(it) }
    } catch (e: FileNotFoundException) {
        emptyList()
    }