package oop_00000096731_AryakaAlif_week4

class ElectricCar(brand: String, numberOfDoors: Int, val batteryCapacity: Int): Car(brand, numberOfDoors) {
    final override fun accelerate() {
        println("$brand berakselerasi dalam sunyi. Kapasitas baterai: $batteryCapacity%.")
    }
}