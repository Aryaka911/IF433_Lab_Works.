package oop_00000096731_AryakaAlif_week14

import java.io.File

interface OrderRepository {
    fun saveOrder(
        itemName: String,
        finalPrice: Double,
        customerType: String
    )
}

class CsvOrderRepository : OrderRepository {

    private val file = File("orders.csv")

    override fun saveOrder(
        itemName: String,
        finalPrice: Double,
        customerType: String
    ) {

        file.bufferedWriter().use { writer ->
            writer.append("$itemName,$finalPrice,$customerType\n")
        }
        file.appendText("$itemName,$finalPrice,$customerType\n")
    }
}

@@ -36,6 +34,24 @@
}
}

interface PricingStrategy {
    fun calculate(price: Double): Double
}

class RegularPricing : PricingStrategy {

    override fun calculate(price: Double): Double {
        return price
    }
}

class VipPricing : PricingStrategy {

    override fun calculate(price: Double): Double {
        return price * 0.90
    }
}

class SafeOrderProcessor(
    private val repo: OrderRepository,
    private val notifier: NotificationService
    @@ -44,18 +60,19 @@
fun processOrder(
    itemName: String,
    basePrice: Double,
    customerType: String
    customerType: String,
    pricingStrategy: PricingStrategy
) {

    val finalPrice = when (customerType) {
        "REGULAR" -> basePrice
        "VIP" -> basePrice * 0.90
        else -> basePrice
    }
    val finalPrice = pricingStrategy.calculate(basePrice)

    println("Memproses pesanan $itemName seharga $finalPrice")

    repo.saveOrder(itemName, finalPrice, customerType)
    repo.saveOrder(
        itemName,
        finalPrice,
        customerType
    )

    notifier.sendNotification(itemName)
}
@@ -72,9 +89,21 @@
notifier
)

val vipPricing = VipPricing()

val regularPricing = RegularPricing()

processor.processOrder(
"Laptop",
10000000.0,
"VIP"
"VIP",
vipPricing
)

processor.processOrder(
"Mouse",
500000.0,
"REGULAR",
regularPricing
)
}