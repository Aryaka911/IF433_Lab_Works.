package oop_000000996731_AryakaAlif_week6

class KRS(override val nama: String) : Mahasiswa {
    override fun belajar() {
        println("si $nama sedang belajar")
    }

    override fun serang() {
        println("si $nama serang")
    }

    override fun mati() {
        println("si $nama mati")
    }
}