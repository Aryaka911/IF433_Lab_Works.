package oop_00000096731_AryakaAlif_week5

class PaymentMethod {
    abstract class PaymentMethod(val accountName: String) {
        abstract fun processPayment(amount: Double)
    }