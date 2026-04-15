package oop_000000996731_AryakaAlif_week5

class PaymentMethod {
    abstract class PaymentMethod(val accountName: String) {
        abstract fun processPayment(amount: Double)
    }