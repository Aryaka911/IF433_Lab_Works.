package oop_000000996731_AryakaAlif_week5

class Dosen {
    class Dosen(nama: String, val nidn: String) : Pegawai(nama) {
        override fun bekerja() {
            println("[$nama] sedang menyiapkan materi perkuliahan dan merevisi RPKPS.")
        }

        fun mengajar() {
            println("[$nama] sedang mengajar mahasiswa di kelas.")
        }