package oop_00000096731_AryakaAlif_week5

class CreditCard {
    class CreditCard(accountName: String, val limit: Double) : PaymentMethod(accountName) {
        var usedAmount: Double = 0.0
        override fun processPayment(amount: Double) {
            if (usedAmount + amount <= limit) {
                usedAmount += amount
                println("Pembayaran sebesar $amount berhasil menggunakan Credit Card. Total terpakai: $usedAmount")
            } else {
                println("Transaksi ditolak. Melebihi limit kartu kredit.")
            }
        }
    }