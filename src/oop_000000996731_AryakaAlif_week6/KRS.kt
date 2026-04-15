package oop_000000996731_AryakaAlif_week6

class KRS(override val nama: String) : Mahasiswa {
    class KRS(override val nama: String, override val namaSiswa: String) : Mahasiswa, Siswa {
        override fun belajar() {
            println("si $nama sedang belajar")
        }

        override fun serang() {
            println("si $nama serang")
        }

        override fun mati() {
            println("si $nama mati")
            println("siswa $namaSiswa sedang belajar juga")
        }
    }